package com.escZ.escZ.Service.Impl;


import com.escZ.escZ.Repository.UserRepository;
import com.escZ.escZ.Model.Entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Set;


@Service
public class AppUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public AppUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        var userEntity = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User with email " + email + " was not found."));


        return map(userEntity);

    }

    private UserDetails map(User user) {

        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(),
                Set.of()
        );
    }



}
