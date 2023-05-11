package com.hadasim.assignment2.HMOMember;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class HMOMemberConfig {

    @Bean
    CommandLineRunner commandLineRunner (HMOMemberRepository repository) {
        return args -> {
            HMOMember michal = new HMOMember(
                314841339L,
                "Michal",
                "Shlezinger",
                "Jerusalem",
                "Or Elchanan",
                19,
                LocalDate.of(1996, Month.JANUARY, 8),
                "025374247",
                "0533383715",
                LocalDate.of(2020, Month.DECEMBER, 27),
                "Pfizer",
                LocalDate.of(2021, Month.JANUARY, 19),
                "Pfizer",
                LocalDate.of(2021, Month.SEPTEMBER, 20),
                "Pfizer",
                null,
                null,
                LocalDate.of(2022, Month.JANUARY, 22),
                LocalDate.of(2021, Month.FEBRUARY, 1)
            );
            HMOMember itamar = new HMOMember(
                206308587L,
                "Itamar",
                "Shlezinger",
                "Jerusalem",
                "Or Elchanan",
                19,
                LocalDate.of(1994, Month.JUNE, 21),
                "025374247",
                "0533383715",
                LocalDate.of(2020, Month.DECEMBER, 27),
                "Pfizer",
                LocalDate.of(2021, Month.JANUARY, 19),
                "Pfizer",
                LocalDate.of(2021, Month.SEPTEMBER, 20),
                "Pfizer",
                null,
                null,
                LocalDate.of(2022, Month.JANUARY, 22),
                LocalDate.of(2021, Month.FEBRUARY, 1)
            );

            repository.saveAll(
                List.of(michal, itamar)
            );
        };
    }
}
