package com.escZ.escZ.Service;

import com.escZ.escZ.Model.Service.UserServiceModel;
import org.springframework.stereotype.Service;


public interface UserService {
    void registerUser(UserServiceModel userServiceModel);
    UserServiceModel findById(Long id);

}
