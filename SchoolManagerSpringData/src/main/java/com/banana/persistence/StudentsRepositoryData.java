package com.banana.persistence;

import com.banana.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentsRepositoryData extends JpaRepository<Student, Long> {
    public List<Student> findByNombre(String nombre);
    public List<Student> findByNombreIgnoreCase(String nombre);
    public List<Student> findByNombreAndApellidoIgnoreCase(String nombre, String apellido);

    //QUERIES NATIVAS
    @Query("SELECT s from Student s WHERE s.nombre LIKE %:name%")
    public List<Student> findByNombreEndsWith(@Param("name") String nombre);

    @Query("SELECT s from Student s WHERE s.nombre LIKE %:name%")
    public List<Student> findByNombreWith(@Param("name") String trozodenombre);

    @Query(value = "SELECT s.* from estudiante s WHERE s.name LIKE %:name%", nativeQuery = true)
    public List<Student> findByNombreWithNative(@Param("name") String trozodenombre);

}
