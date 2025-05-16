package com.mapstruct.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ecosystems {
    private String name;
    private String predominantSpecies;
    private String climateType;
    private String terrainType;
}
