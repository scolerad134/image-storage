package com.image.store.models;

import com.image.store.models.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class User {

    /**
     * id.
     */
    @Id
    @UuidGenerator
    @Column(name = "id", nullable = false)
    private UUID id;

    /**
     * email пользователя.
     */
    @Column(nullable = false, unique = true)
    private String email;

    /**
     * пароль пользователя.
     */
    @Column(nullable = false)
    private String password;

    /**
     * роль пользователя USER или MODERATOR.
     */
    @Enumerated(EnumType.STRING)
    private Role role;

    /**
     * флаг блокировки или разблокировки пользователя.
     */
    @Column(nullable = false)
    private boolean enabled = true;

    // Связь с таблицей Image
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Image> images;

}
