package com.example.bajogym.services;


import com.example.bajogym.models.User;
import com.example.bajogym.models.UserDetails;
import com.example.bajogym.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
public class UserDetailsService implements
        org.springframework.security.core.userdetails.UserDetailsService {
    @Autowired
    private UserRepository userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws
            UsernameNotFoundException {
        User user = userRepo.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("Korisnik nije pronađen.");
        }
        return new UserDetails(user);
    }
}
