package com.mapstruct.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URI;
import java.util.List;
import java.util.UUID;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    private UUID id;
    private String name;
    private URI flag;
    private Integer totalStates;
    private List<Language> languages;
    private Location location;
    private List<Ecosystems> ecosystems;
    private String capital;
    private String president;
}
