package com.example.th2.service.user;

import com.example.th2.model.User;
import com.example.th2.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
}