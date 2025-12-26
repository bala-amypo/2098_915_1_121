package com.example.demo.security;

import com.example.demo.repository.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {

        Object[] user = userRepository.findCredentialsByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User not found"));

        String username = (String) user[0];
        String password = (String) user[1];

        return new org.springframework.security.core.userdetails.User(
                username,
                password,
                Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"))
        );
    }
}
