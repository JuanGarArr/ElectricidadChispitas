package com.Juangarcia.electricidadchispitas.Domain.UserCases.Item;


import com.Juangarcia.electricidadchispitas.Data.Item.ItemDataStore;
import com.Juangarcia.electricidadchispitas.Domain.Models.ProductoServicio;


import java.util.List;

public class GetItemUseCase {

    private ItemDataStore itemDataStore;

    public GetItemUseCase(ItemDataStore itemDataStore) {
        this.itemDataStore = itemDataStore;
    }

    public List<ProductoServicio> execute() {
        return itemDataStore.getAllItems();
    }

}
