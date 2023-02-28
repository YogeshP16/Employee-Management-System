package net.yogesh.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.yogesh.springboot.dto.UserRegistrationDto;
import net.yogesh.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
