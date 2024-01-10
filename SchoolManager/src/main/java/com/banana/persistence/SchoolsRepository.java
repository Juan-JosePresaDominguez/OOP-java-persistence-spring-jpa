package com.banana.persistence;

import com.banana.models.School;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class SchoolsRepository {
    private Set<School> escuelas = new HashSet<>();

    public SchoolsRepository() {
        escuelas.add(new School(1L, "Mariposa"));
    }

}
