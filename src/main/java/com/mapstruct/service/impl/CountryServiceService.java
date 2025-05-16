package com.mapstruct.service.impl;


import com.mapstruct.dao.CountryDao;
import com.mapstruct.dto.CountryDTO;
import com.mapstruct.mapper.CountryMapper;
import com.mapstruct.service.ICountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CountryServiceService implements ICountryService {

    public CountryDTO readById(UUID id){
        if(CountryDao.db.containsKey(id)){
            return CountryMapper.mapper.toCountryDTO(CountryDao.db.get(id));
        }else {
            log.error("Country id not found");
            throw new RuntimeException("Country id: " + id + "not found");
        }
    }

}
