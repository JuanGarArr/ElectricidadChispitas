package com.Juangarcia.electricidadchispitas.Domain.UserCases.Item;

import com.Juangarcia.electricidadchispitas.Data.Item.ItemDataStore;
import com.Juangarcia.electricidadchispitas.Domain.Models.ProductoServicio;

public class UpdateItemUseCase {

    private ItemDataStore itemDataStore;

    public  UpdateItemUseCase (ItemDataStore itemDataStore){
        this.itemDataStore = itemDataStore;
    }

    public void execute (ProductoServicio productoServicio){
        itemDataStore.updateItem(productoServicio);
    }
}
