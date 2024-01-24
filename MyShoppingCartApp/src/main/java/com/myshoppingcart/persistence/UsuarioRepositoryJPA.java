package com.myshoppingcart.persistence;

import com.myshoppingcart.exception.UsuarioNotFoundException;
import com.myshoppingcart.model.Usuario;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Getter
@Setter
@Repository
public class UsuarioRepositoryJPA implements IUsuarioRepository {

    @PersistenceContext // Accede al emf; emf.createEntityManager();
    EntityManager em;

    @Override
    public boolean existeUsuario(String email, String pass) throws Exception {
        return false;
    }

    @Override
    public Usuario getUsuario(String email, String pass) throws UsuarioNotFoundException, Exception {
        return null;
    }

    @Override
    public List<Usuario> getUsuarios(String iniciales) throws Exception {
        return null;
    }

    @Override
    public Usuario insertUsuario(Usuario nuevoUsuario) throws Exception {
        return null;
    }

    @Override
    public Usuario updateUsuario(Usuario unUsuario) throws Exception {
        return null;
    }

    @Override
    public boolean deleteUsuario(Integer uid) throws Exception {
        return false;
    }
}
