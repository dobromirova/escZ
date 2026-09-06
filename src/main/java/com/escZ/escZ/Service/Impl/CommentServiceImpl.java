package com.escZ.escZ.Service.Impl;

import com.escZ.escZ.Model.Entity.Comment;
import com.escZ.escZ.Model.Service.CommentServiceModel;
import com.escZ.escZ.Model.View.CommentViewModel;
import com.escZ.escZ.Repository.CommentRepository;
import com.escZ.escZ.Repository.RouteRepository;
import com.escZ.escZ.Repository.UserRepository;
import com.escZ.escZ.Service.CommentService;
import com.escZ.escZ.Service.Exceptions.ObjectNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {

    private final RouteRepository routeRepository;
    private final UserRepository userRepository;
    private final CommentRepository commentRepository;

    public CommentServiceImpl(RouteRepository routeRepository, UserRepository userRepository, CommentRepository commentRepository) {
        this.routeRepository = routeRepository;
        this.userRepository = userRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public CommentViewModel createComment(CommentServiceModel commentServiceModel) {

        Objects.requireNonNull(commentServiceModel.getAuthor());

        var route = routeRepository.
                findById(commentServiceModel.getRouteId()).
                orElseThrow(() -> new ObjectNotFoundException("Route with id " + commentServiceModel.getRouteId() + " not found!"));

        var author = userRepository.
                findByEmail(commentServiceModel.getAuthor()).
                orElseThrow(() -> new ObjectNotFoundException("User with email " + commentServiceModel.getAuthor() + " not found!"));

        Comment newComment = new Comment();
        newComment.setTextContent(commentServiceModel.getMessage());
        newComment.setCreated(LocalDateTime.now());
        newComment.setRoute(route);
        newComment.setAuthor(author);

        Comment savedComment = commentRepository.save(newComment);

        return mapAsComment(savedComment);


    }


    @Transactional
    @Override
    public List<CommentViewModel> getComments(Long routeId) {
        var routeOpt = routeRepository.findById(routeId);

        if (routeOpt.isEmpty()) {
            throw new ObjectNotFoundException("Route with id " + routeId + " was not found!");
        }

        return routeOpt.get().getComments()
                .stream().map(this::mapAsComment)
                .collect(Collectors.toList());
    }

        private CommentViewModel mapAsComment(Comment commentEntity) {
            CommentViewModel commentViewModel = new CommentViewModel();

            commentViewModel
                    .setCommentId(commentViewModel.getCommentId())
                    .setCreated(commentEntity.getCreated())
                    .setMessage(commentEntity.getTextContent())
                    .setUser(commentEntity.getAuthor().getUsername());


            return commentViewModel;
    }
}







