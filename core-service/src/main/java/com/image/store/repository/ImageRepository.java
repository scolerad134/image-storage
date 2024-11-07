package com.image.store.repository;

import com.image.store.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;


/**
 * Репозиторий для работы с Image.
 */
public interface ImageRepository extends JpaRepository<Image, UUID> {

    /**
     * Метод для получения всех изображений конкретного пользователя.
     *
     * @return список изображений
     */
    List<Image> findByUserId(UUID userId);
}
