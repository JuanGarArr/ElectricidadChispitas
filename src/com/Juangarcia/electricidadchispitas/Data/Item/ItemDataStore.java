package com.Juangarcia.electricidadchispitas.Data.Item;

import com.Juangarcia.electricidadchispitas.Domain.Models.ProductoServicio;


import java.util.List;

public interface ItemDataStore {

        void saveItem(ProductoServicio productoServicio);

        void deleteItem(ProductoServicio productoServicio);

        void updateItem(ProductoServicio productoServicio);

        List<ProductoServicio> getAllItems();

        ProductoServicio findById (Integer idItem);
    }
