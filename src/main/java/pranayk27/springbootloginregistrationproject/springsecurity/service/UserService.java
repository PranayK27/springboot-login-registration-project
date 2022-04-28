package pranayk27.springbootloginregistrationproject.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import pranayk27.springbootloginregistrationproject.springsecurity.model.User;
import pranayk27.springbootloginregistrationproject.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
