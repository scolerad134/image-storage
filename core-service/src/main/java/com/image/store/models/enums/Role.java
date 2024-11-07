package com.image.store.models.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, MODERATOR;

    @Override
    public String getAuthority() {
        return name();
    }
}
