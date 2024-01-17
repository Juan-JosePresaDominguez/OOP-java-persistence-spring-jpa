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
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "proyectos_estudiantes",
            joinColumns = {@JoinColumn(name = "proj_id")},
            inverseJoinColumns = {@JoinColumn(name = "std_id")}
    )
    private List<Student> estudiantes = new ArrayList<>();
}
