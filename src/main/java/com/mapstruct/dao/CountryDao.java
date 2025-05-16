package com.mapstruct.dao;



import com.mapstruct.model.Country;
import com.mapstruct.model.Ecosystems;
import com.mapstruct.model.Language;
import com.mapstruct.model.Location;

import java.net.URI;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class CountryDao {

    public static final ConcurrentHashMap<UUID, Country> db = new ConcurrentHashMap<>();

    static {
        // United States
        UUID usaId = UUID.randomUUID();
        db.put(usaId, Country.builder()
                .id(usaId)
                .name("United States")
                .flag(URI.create("https://example.com/flags/usa.png"))
                .totalStates(50)
                .languages(List.of(
                        new Language("English", true, 231000000),
                        new Language("Spanish", false, 41000000)
                ))
                .location(new Location("North America", 37.0902, -95.7129))
                .ecosystems(List.of(
                        new Ecosystems("Temperate Deciduous Forest", "Oak", "Temperate", "Forested"),
                        new Ecosystems("Prairie", "Grass", "Continental", "Grassland")
                ))
                .capital("Washington D.C.")
                .president("Donal Trump")
                .build());

        // Brazil
        UUID brazilId = UUID.randomUUID();
        db.put(brazilId, Country.builder()
                .id(brazilId)
                .name("Brazil")
                .flag(URI.create("https://example.com/flags/brazil.png"))
                .totalStates(26)
                .languages(List.of(
                        new Language("Portuguese", true, 211000000)
                ))
                .location(new Location("South America", -14.2350, -51.9253))
                .ecosystems(List.of(
                        new Ecosystems("Amazon Rainforest", "Brazil Nut Tree", "Tropical", "Rainforest"),
                        new Ecosystems("Cerrado", "Pequi", "Tropical Savanna", "Savanna")
                ))
                .capital("Brasília")
                .president("Luiz Inácio Lula da Silva")
                .build());

        // China
        UUID chinaId = UUID.randomUUID();
        db.put(chinaId, Country.builder()
                .id(chinaId)
                .name("China")
                .flag(URI.create("https://example.com/flags/china.png"))
                .totalStates(23)
                .languages(List.of(
                        new Language("Mandarin Chinese", true, 900000000),
                        new Language("Cantonese", false, 80000000)
                ))
                .location(new Location("Asia", 35.8617, 104.1954))
                .ecosystems(List.of(
                        new Ecosystems("Temperate Forest", "Ginkgo", "Temperate", "Forested"),
                        new Ecosystems("Gobi Desert", "Saxaul", "Desert", "Arid")
                ))
                .capital("Beijing")
                .president("Xi Jinping")
                .build());

        // India
        UUID indiaId = UUID.randomUUID();
        db.put(indiaId, Country.builder()
                .id(indiaId)
                .name("India")
                .flag(URI.create("https://example.com/flags/india.png"))
                .totalStates(28)
                .languages(List.of(
                        new Language("Hindi", true, 528000000),
                        new Language("English", true, 125000000)
                ))
                .location(new Location("Asia", 20.5937, 78.9629))
                .ecosystems(List.of(
                        new Ecosystems("Tropical Rainforest", "Teak", "Tropical", "Rainforest"),
                        new Ecosystems("Thar Desert", "Khejri", "Desert", "Arid")
                ))
                .capital("New Delhi")
                .president("Droupadi Murmu")
                .build());

        // Russia
        UUID russiaId = UUID.randomUUID();
        db.put(russiaId, Country.builder()
                .id(russiaId)
                .name("Russia")
                .flag(URI.create("https://example.com/flags/russia.png"))
                .totalStates(85)
                .languages(List.of(
                        new Language("Russian", true, 258000000)
                ))
                .location(new Location("Europe/Asia", 61.5240, 105.3188))
                .ecosystems(List.of(
                        new Ecosystems("Taiga", "Siberian Larch", "Subarctic", "Forested"),
                        new Ecosystems("Steppe", "Feather Grass", "Continental", "Grassland")
                ))
                .capital("Moscow")
                .president("Vladimir Putin")
                .build());

        // Japan
        UUID japanId = UUID.randomUUID();
        db.put(japanId, Country.builder()
                .id(japanId)
                .name("Japan")
                .flag(URI.create("https://example.com/flags/japan.png"))
                .totalStates(47)
                .languages(List.of(
                        new Language("Japanese", true, 125000000)
                ))
                .location(new Location("Asia", 36.2048, 138.2529))
                .ecosystems(List.of(
                        new Ecosystems("Temperate Broadleaf Forest", "Japanese Cedar", "Temperate", "Forested"),
                        new Ecosystems("Alpine", "Japanese Stone Pine", "Alpine", "Mountainous")
                ))
                .capital("Tokyo")
                .president("Fumio Kishida")
                .build());

        // Germany
        UUID germanyId = UUID.randomUUID();
        db.put(germanyId, Country.builder()
                .id(germanyId)
                .name("Germany")
                .flag(URI.create("https://example.com/flags/germany.png"))
                .totalStates(16)
                .languages(List.of(
                        new Language("German", true, 95000000)
                ))
                .location(new Location("Europe", 51.1657, 10.4515))
                .ecosystems(List.of(
                        new Ecosystems("Temperate Deciduous Forest", "European Beech", "Temperate", "Forested"),
                        new Ecosystems("Alpine", "European Larch", "Alpine", "Mountainous")
                ))
                .capital("Berlin")
                .president("Frank-Walter Steinmeier")
                .build());

        // France
        UUID franceId = UUID.randomUUID();
        db.put(franceId, Country.builder()
                .id(franceId)
                .name("France")
                .flag(URI.create("https://example.com/flags/france.png"))
                .totalStates(18)
                .languages(List.of(
                        new Language("French", true, 80000000)
                ))
                .location(new Location("Europe", 46.2276, 2.2137))
                .ecosystems(List.of(
                        new Ecosystems("Mediterranean Forest", "Holm Oak", "Mediterranean", "Forested"),
                        new Ecosystems("Alpine", "European Silver Fir", "Alpine", "Mountainous")
                ))
                .capital("Paris")
                .president("Emmanuel Macron")
                .build());

        // United Kingdom
        UUID ukId = UUID.randomUUID();
        db.put(ukId, Country.builder()
                .id(ukId)
                .name("United Kingdom")
                .flag(URI.create("https://example.com/flags/uk.png"))
                .totalStates(4)
                .languages(List.of(
                        new Language("English", true, 59000000),
                        new Language("Welsh", true, 700000)
                ))
                .location(new Location("Europe", 55.3781, -3.4360))
                .ecosystems(List.of(
                        new Ecosystems("Temperate Broadleaf Forest", "English Oak", "Temperate", "Forested"),
                        new Ecosystems("Moorland", "Heather", "Temperate", "Shrubland")
                ))
                .capital("London")
                .president("Rishi Sunak")
                .build());

        // Canada
        UUID canadaId = UUID.randomUUID();
        db.put(canadaId, Country.builder()
                .id(canadaId)
                .name("Canada")
                .flag(URI.create("https://example.com/flags/canada.png"))
                .totalStates(13)
                .languages(List.of(
                        new Language("English", true, 25000000),
                        new Language("French", true, 7000000)
                ))
                .location(new Location("North America", 56.1304, -106.3468))
                .ecosystems(List.of(
                        new Ecosystems("Boreal Forest", "Black Spruce", "Subarctic", "Forested"),
                        new Ecosystems("Tundra", "Arctic Willow", "Arctic", "Tundra")
                ))
                .capital("Ottawa")
                .president("Justin Trudeau")
                .build());

        // Australia
        UUID australiaId = UUID.randomUUID();
        db.put(australiaId, Country.builder()
                .id(australiaId)
                .name("Australia")
                .flag(URI.create("https://example.com/flags/australia.png"))
                .totalStates(6)
                .languages(List.of(
                        new Language("English", true, 25000000)
                ))
                .location(new Location("Oceania", -25.2744, 133.7751))
                .ecosystems(List.of(
                        new Ecosystems("Outback", "Eucalyptus", "Arid", "Desert"),
                        new Ecosystems("Great Barrier Reef", "Coral", "Tropical", "Marine")
                ))
                .capital("Canberra")
                .president("Anthony Albanese")
                .build());

        // South Africa
        UUID southAfricaId = UUID.randomUUID();
        db.put(southAfricaId, Country.builder()
                .id(southAfricaId)
                .name("South Africa")
                .flag(URI.create("https://example.com/flags/southafrica.png"))
                .totalStates(9)
                .languages(List.of(
                        new Language("Zulu", true, 12000000),
                        new Language("Xhosa", true, 8000000),
                        new Language("Afrikaans", true, 7000000),
                        new Language("English", true, 4900000)
                ))
                .location(new Location("Africa", -30.5595, 22.9375))
                .ecosystems(List.of(
                        new Ecosystems("Savanna", "Acacia", "Subtropical", "Grassland"),
                        new Ecosystems("Fynbos", "Protea", "Mediterranean", "Shrubland")
                ))
                .capital("Pretoria (administrative), Cape Town (legislative), Bloemfontein (judicial)")
                .president("Cyril Ramaphosa")
                .build());

        // Mexico
        UUID mexicoId = UUID.randomUUID();
        db.put(mexicoId, Country.builder()
                .id(mexicoId)
                .name("Mexico")
                .flag(URI.create("https://example.com/flags/mexico.png"))
                .totalStates(32)
                .languages(List.of(
                        new Language("Spanish", true, 130000000),
                        new Language("Nahuatl", false, 1500000)
                ))
                .location(new Location("North America", 23.6345, -102.5528))
                .ecosystems(List.of(
                        new Ecosystems("Desert", "Saguaro Cactus", "Arid", "Desert"),
                        new Ecosystems("Tropical Rainforest", "Mahogany", "Tropical", "Rainforest")
                ))
                .capital("Mexico City")
                .president("La tirania de la 4T")
                .build());

        // Indonesia
        UUID indonesiaId = UUID.randomUUID();
        db.put(indonesiaId, Country.builder()
                .id(indonesiaId)
                .name("Indonesia")
                .flag(URI.create("https://example.com/flags/indonesia.png"))
                .totalStates(34)
                .languages(List.of(
                        new Language("Indonesian", true, 260000000),
                        new Language("Javanese", false, 84000000)
                ))
                .location(new Location("Asia", -0.7893, 113.9213))
                .ecosystems(List.of(
                        new Ecosystems("Tropical Rainforest", "Rafflesia", "Tropical", "Rainforest"),
                        new Ecosystems("Coral Reef", "Coral", "Tropical", "Marine")
                ))
                .capital("Jakarta")
                .president("Joko Widodo")
                .build());
    }

}