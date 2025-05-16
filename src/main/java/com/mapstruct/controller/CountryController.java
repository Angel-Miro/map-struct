package com.mapstruct.controller;

import com.mapstruct.dto.CountryDTO;
import com.mapstruct.service.ICountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "country/")
@RequiredArgsConstructor
public class CountryController {

    private final ICountryService countryService;

    @GetMapping(path = "id/{id}")
    public ResponseEntity<CountryDTO> getById(@PathVariable UUID id){
        return ResponseEntity.ok(this.countryService.readById(id));
    }

}
