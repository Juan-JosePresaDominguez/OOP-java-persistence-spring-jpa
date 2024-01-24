package com.myshoppingcart.persistence;

import com.myshoppingcart.model.Compra;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Getter
@Setter
@Repository
public class CompraRepositoyJPA implements ICompraRepository {

    @PersistenceContext // Accede al emf; emf.createEntityManager();
    EntityManager em;

    @Override
    public Compra insertCompra(Compra nuevaCompra) throws Exception {
        return null;
    }
}
