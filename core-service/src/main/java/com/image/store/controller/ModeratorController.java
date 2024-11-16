package com.image.store.controller;

import com.image.store.models.Image;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

/**
 * Контроллер для работы с маппингом "/moderators".
 */
@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/moderators")
public class ModeratorController {


    // /**
    //  * Получение списка загруженных изображений.
    //  *
    //  * @return List изображений
    //  */
    // @GetMapping("/moderators")
    // public ResponseEntity<List<Image>> getUserImages(
    //     @RequestParam Optional<String> sortBy,
    //     @RequestParam Optional<String> filter,
    //     Principal principal) {
    //     // Получить список изображений с фильтрацией и сортировкой
    // }
    //
    // /**
    //  * Блокировка пользователя.
    //  *
    //  */
    // @PutMapping("/users/{userId}/block")
    // public ResponseEntity<?> blockUser(@PathVariable Long userId) {
    //     // Реализация блокировки пользователя
    // }

}
