package com.escZ.escZ.Service;

import com.escZ.escZ.Model.Service.RouteServiceModel;
import com.escZ.escZ.Model.View.RouteDetailsViewModel;
import com.escZ.escZ.Model.View.RouteViewModel;

import java.util.List;

public interface RouteService {

    List<RouteViewModel> findAllRoutesView();

    void addNewRoute(RouteServiceModel routeServiceModel);

    RouteDetailsViewModel findRouteById();


}
