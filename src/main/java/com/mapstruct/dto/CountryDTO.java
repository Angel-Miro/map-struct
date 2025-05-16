package com.mapstruct.dto;

import lombok.Data;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@Data
public class CountryDTO {
    private UUID id;
    private String name;
    private URI flag;
    private Integer totalStates;
    private List<LanguageDto> languages;
    private String continent;
    private List<EcosystemsDto> ecosystems;
    private String capital;
}
