package com.escZ.escZ.Repository;

import com.escZ.escZ.Model.Entity.Picture;
import com.escZ.escZ.Model.Entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
}
