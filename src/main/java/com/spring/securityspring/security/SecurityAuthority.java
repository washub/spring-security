package com.spring.securityspring.security;

import com.spring.securityspring.entities.Authority;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {
    private Authority authority;
    @Override
    public String getAuthority() {
        return authority.getName();
    }
}
