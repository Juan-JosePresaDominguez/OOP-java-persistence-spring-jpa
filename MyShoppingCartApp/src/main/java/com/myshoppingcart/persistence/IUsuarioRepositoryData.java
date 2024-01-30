package com.myshoppingcart.persistence;

import com.myshoppingcart.exception.UsuarioNotFoundException;
import com.myshoppingcart.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUsuarioRepositoryData extends JpaRepository<Usuario, Integer> {

    public boolean existsByEmailAndPassword(String email, String pass);

    public Usuario findByEmailAndPassword(String email, String pass);

    @Query(value = "SELECT u from Usuario u WHERE u.nombre LIKE ?1% OR u.apellido LIKE ?1%")
    public List<Usuario> getUsuarios(String iniciales);

}
