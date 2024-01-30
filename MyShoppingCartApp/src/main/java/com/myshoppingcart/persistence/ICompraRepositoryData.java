package com.myshoppingcart.persistence;

import com.myshoppingcart.model.Compra;

public interface ICompraRepositoryData {
    public Compra insertCompra(Compra nuevaCompra) throws Exception;

}
