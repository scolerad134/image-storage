package com.image.store.controller;

import com.image.store.models.Image;
import com.image.store.models.dtos.ImagesParametersDto;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

/**
 * Контроллер для работы с маппингом "/images".
 */

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/images")
public class ImageController {

    // /**
    //  * Загрузка списка изображений.
    //  *
    //  */
    // @PostMapping("/upload")
    // public ResponseEntity<?> uploadImages(@RequestParam("files") List<MultipartFile> files, Principal principal) {
    //     // Валидация файлов, загрузка в хранилище
    //     // Отправка информации в очередь для MAIL-сервиса
    // }

    /**
     * Получение списка загруженных пользователем изображений.
     * @param parameters может содержать:
     *                   sort - сортировка по статусу клиента client_condition,
     *                   фамилии last_name, региону region, городу city.
     *                   firstName, lastName, patronymic - поиск по телефону или по имени, фамилии или отчеству .
     *                   country - фильтрация по стране.
     *                   region - фильтрация по региону.
     *                   district - фильтрация по району.
     *                   city - фильтрация по городу.
     *                   street - фильтрация по улице.
     * @return List DTO с изображениями
     */
    @GetMapping("/images")
    public ResponseEntity<List<Image>> getUserImages(@RequestBody ImagesParametersDto parameters) {
        // Получить список изображений с фильтрацией и сортировкой
        return null;
    }

    // /**
    //  * Скачивание изображения.
    //  *
    //  */
    // @GetMapping("/images/{imageId}")
    // public ResponseEntity<Resource> downloadImage(@PathVariable Long imageId, Principal principal) {
    //     // Проверка доступа, загрузка изображения
    //     // Отправка события в очередь
    // }

}
