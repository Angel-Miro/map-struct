package com.mapstruct.mapper;

import com.mapstruct.dto.CountryDTO;
import com.mapstruct.dto.LanguageDto;
import com.mapstruct.model.Country;
import com.mapstruct.model.Language;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountryMapper {

    CountryMapper mapper = Mappers.getMapper(CountryMapper.class);

    //Cuando se encuentra una propiedad dentro de un objeto
    @Mapping(target = "continent", source = "location.continent")
    CountryDTO toCountryDTO(Country country);

    //Los nombres no corresponden y solo se especifica
    @Mapping(target = "isOfficialLanguage", source = "isOfficial")
    @Mapping(target = "speakersTotal", source = "speakersCount")
    LanguageDto toLanguageDTO(Language language);



}
