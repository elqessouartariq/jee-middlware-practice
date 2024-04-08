package com.elqessouartariq.hospitalwebjee.security.service;

import com.elqessouartariq.hospitalwebjee.security.entities.AppRole;
import com.elqessouartariq.hospitalwebjee.security.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(String username, String password, String email, String confirmedPassword);
    AppRole addNewRole(String role);
    void addRoleToUser(String username, String role);
    void removeRoleFromUser(String username, String role);
    AppUser loadUserByUsername(String username);
}
