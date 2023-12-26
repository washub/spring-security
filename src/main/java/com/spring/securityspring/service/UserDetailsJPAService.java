package com.spring.securityspring.service;

import com.spring.securityspring.repositories.UserRepository;
import com.spring.securityspring.security.SecurityUser;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class UserDetailsJPAService implements UserDetailsService {
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var  u = userRepository.findByUserName(username);

        return u.map(SecurityUser::new)
                .orElseThrow(()-> new UsernameNotFoundException("User name :: "+username.toUpperCase() + " not found!"));
    }
}
