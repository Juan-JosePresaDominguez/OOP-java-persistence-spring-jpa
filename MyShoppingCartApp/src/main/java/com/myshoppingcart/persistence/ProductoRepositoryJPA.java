package com.myshoppingcart.persistence;

import com.myshoppingcart.model.Producto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Getter
@Setter
@Repository
public class ProductoRepositoryJPA implements IProductoRepository {

    @PersistenceContext // Accede al emf; emf.createEntityManager();
    EntityManager em;

    @Override
    public Producto getProduct(int id) throws Exception {
        return null;
    }

    @Override
    public List<Producto> getProducts() throws Exception {
        return null;
    }

    @Override
    public List<Producto> getUserProducts(int uid) throws Exception {
        return null;
    }

    @Override
    public Producto insertarProducto(Producto prod) throws Exception {
        return null;
    }

    @Override
    public Producto actualizarProducto(Producto prod) throws Exception {
        return null;
    }

    @Override
    public boolean borrarProducto(Producto prod) throws Exception {
        return false;
    }
}
