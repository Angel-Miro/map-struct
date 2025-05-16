package com.mapstruct.service;

import com.mapstruct.dto.CountryDTO;

import java.util.UUID;

public interface ICountryService {

    CountryDTO readById(UUID id);
}
