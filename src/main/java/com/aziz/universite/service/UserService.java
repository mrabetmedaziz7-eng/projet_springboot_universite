package com.aziz.universite.service;

import java.util.List;
import com.aziz.universite.entities.Role;
import com.aziz.universite.entities.User;
import com.aziz.universite.register.RegistrationRequest;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername(String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User> findAllUsers();
    User registerUser(RegistrationRequest request);
    User validateToken(String code);
}

