package com.image.store.models.dtos;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record ImagesParametersDto(List<String> sort, UUID id, Long fileSize, LocalDateTime uploadDate) {}
