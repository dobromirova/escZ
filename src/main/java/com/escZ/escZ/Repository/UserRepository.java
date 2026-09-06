package com.escZ.escZ.Repository;

import com.escZ.escZ.Model.Entity.Picture;
import com.escZ.escZ.Model.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}
