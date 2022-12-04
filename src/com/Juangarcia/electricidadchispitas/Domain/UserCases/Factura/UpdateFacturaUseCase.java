package com.Juangarcia.electricidadchispitas.Domain.UserCases.Factura;

import com.Juangarcia.electricidadchispitas.Data.Factura.FacturaDataStore;
import com.Juangarcia.electricidadchispitas.Domain.Models.Factura;


public class UpdateFacturaUseCase {

    private FacturaDataStore facturaDataStore;

    public  UpdateFacturaUseCase(FacturaDataStore facturaDataStore){
        this.facturaDataStore = facturaDataStore;
    }

    public void execute (Factura factura){
        facturaDataStore.updateFacture(factura);
    }
}

