package com.image.store.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер для работы с маппингом "/users".
 */

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    // /**
    //  * Регистрация пользователя в приложении.
    //  *
    //  */
    // @PostMapping("/register")
    // public ResponseEntity<?> registerUser(@RequestBody UserRegistrationDto registrationDto) {
    //     // Создать пользователя, сохранить в БД
    //     // Отправить событие в Kafka/RabbitMQ
    // }

}
