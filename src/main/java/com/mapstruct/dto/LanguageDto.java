package com.mapstruct.dto;

import lombok.Data;

@Data
public class LanguageDto {
    private String name;
    private Boolean isOfficialLanguage;
    private Integer speakersTotal;
}