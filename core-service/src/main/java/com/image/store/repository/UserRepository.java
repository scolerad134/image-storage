package com.image.store.repository;

import com.image.store.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;


/**
 * Репозиторий для работы с User.
 */
public interface UserRepository extends JpaRepository<User, UUID> {

    /**
     * Метод для поиска пользователя по email.
     *
     * @return пользователь
     */
    Optional<User> findByEmail(String email);
}
