package com.elqessouartariq.hospitalwebjee.security.repository;

import com.elqessouartariq.hospitalwebjee.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}