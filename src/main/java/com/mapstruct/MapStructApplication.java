package com.mapstruct;

import com.mapstruct.dao.CountryDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MapStructApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MapStructApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        CountryDao.db.entrySet().forEach(System.out::println);
    }
}
