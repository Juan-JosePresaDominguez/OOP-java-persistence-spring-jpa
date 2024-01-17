package com.banana.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "estudiante")
@NamedQuery(name = "Student.getStudents", query = "SELECT s FROM Student s")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String nombre;

    @Column(name = "surname")
    private String apellido;

    private int curso;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "school_id")
    @ToString.Exclude
    private School mySchool;

    public Student(Long id, String nombre, String apellido, int curso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    }

    public boolean isValid() {
        return this.nombre != null && this.apellido != null && this.curso > 0;
    }
}