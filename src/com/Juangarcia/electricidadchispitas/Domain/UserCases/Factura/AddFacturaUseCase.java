package com.Juangarcia.electricidadchispitas.Domain.UserCases.Factura;

import com.Juangarcia.electricidadchispitas.Data.Factura.FacturaDataStore;
import com.Juangarcia.electricidadchispitas.Domain.Models.Factura;


public class AddFacturaUseCase {

    private FacturaDataStore facturaDataStore;

    public AddFacturaUseCase(FacturaDataStore facturaDataStore) {
        this.facturaDataStore = facturaDataStore;
    }

    public void execute(Factura factura) {
        facturaDataStore.saveFacture(factura);
    }


}

