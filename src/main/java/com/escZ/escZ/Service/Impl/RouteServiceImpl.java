package com.escZ.escZ.Service.Impl;

import com.escZ.escZ.Model.Entity.Enum.GradeEnum;
import com.escZ.escZ.Model.Entity.Route;
import com.escZ.escZ.Model.Service.RouteServiceModel;
import com.escZ.escZ.Model.View.RouteDetailsViewModel;
import com.escZ.escZ.Model.View.RouteViewModel;
import com.escZ.escZ.Repository.RouteRepository;
import com.escZ.escZ.Service.GradeService;
import com.escZ.escZ.Service.RouteService;
import com.escZ.escZ.Service.UserService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RouteServiceImpl implements RouteService {

    private final RouteRepository routeRepository;
    private UserService userService;
    private final GradeService gradeService;
    private final ModelMapper modelMapper;


    public RouteServiceImpl(RouteRepository routeRepository, UserService userService, GradeService gradeService, ModelMapper modelMapper) {
        this.routeRepository = routeRepository;
        this.userService = userService;
        this.gradeService = gradeService;
        this.modelMapper = modelMapper;
    }

    @Transactional
    @Override
    public List<RouteViewModel> findAllRoutesView() {
        return routeRepository
                .findAll()
                .stream()
                .map(route -> {
                    RouteViewModel routeViewModel = modelMapper.map(route, RouteViewModel.class);
                    if (route.getPictures().isEmpty()) {
                        routeViewModel.setPictureUrl("");
                    } else {
                        routeViewModel.setPictureUrl(route.getPictures().stream().findFirst().get().getUrl());
                    }
                    return routeViewModel;
                }).collect(Collectors.toList());
    }

    @Override
    public void addNewRoute(RouteServiceModel routeServiceModel) {
        Route route = modelMapper.map(routeServiceModel, Route.class);

        route.setGrade(gradeService
                .findGradeByName(routeServiceModel.getGrade()));

        routeRepository.save(route);
    }

    @Transactional
    @Override
    public RouteDetailsViewModel findRouteById(Long id) {
        return routeRepository
                .findById(id)
                .map(route -> modelMapper.map(route, RouteDetailsViewModel.class))
                .orElse(null);
    }


}
