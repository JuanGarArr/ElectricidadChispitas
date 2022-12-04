package com.Juangarcia.electricidadchispitas.Domain.UserCases.Factura;

import com.Juangarcia.electricidadchispitas.Data.Factura.FacturaDataStore;
import com.Juangarcia.electricidadchispitas.Domain.Models.Factura;

public class DeleteFacturaUseCase {

    private FacturaDataStore facturaDataStore;

    public DeleteFacturaUseCase(FacturaDataStore facturaDataStore){
        this.facturaDataStore=facturaDataStore;

    }

    public void execute(Factura factura){
        facturaDataStore.deleteFacture(factura);
    }


}

