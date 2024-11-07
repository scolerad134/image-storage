package com.image.store.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "images")
public class Image {

    /**
     * id.
     */
    @Id
    @UuidGenerator
    @Column(name = "id", nullable = false)
    private UUID id;

    /**
     * имя файла изображения.
     */
    @Column(nullable = false)
    private String fileName;

    /**
     * URL или путь к файлу в хранилище.
     */
    @Column(nullable = false)
    private String fileUrl; // URL ссылки на хранилище или путь к файлу на диске

    /**
     * размер файла в байтах.
     */
    @Column(nullable = false)
    private Long fileSize; // Размер файла в байтах

    /**
     * дата и время загрузки файла.
     */
    @Column(nullable = false)
    private LocalDateTime uploadDate;

    /**
     * id.
     */
    // Связь с таблицей User
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
