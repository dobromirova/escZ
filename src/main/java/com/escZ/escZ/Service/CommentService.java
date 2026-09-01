package com.escZ.escZ.Service;

import com.escZ.escZ.Model.Service.CommentServiceModel;
import com.escZ.escZ.Model.View.CommentViewModel;

import java.util.List;

public interface CommentService {

    CommentViewModel createComment(CommentServiceModel commentServiceModel);

    List<CommentViewModel> getComments(Long routeId);

}
