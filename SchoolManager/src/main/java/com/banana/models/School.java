package com.banana.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "escuela")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    //@Transient --> Hace que no se tenga que tener en cuenta el campo lista "estudiantes" a nivel de BB.DD., es decir, no se crea este campo.
    @Transient
    private List<Student> estudiantes = new ArrayList<>();

    public School(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addStudent(Student estudiante) {
        estudiantes.add(estudiante);
    }

    public void removeStudent(Student estudiante) {
        estudiantes.remove(estudiante);
    }

}
