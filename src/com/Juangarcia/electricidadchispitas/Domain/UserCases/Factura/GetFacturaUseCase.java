package com.Juangarcia.electricidadchispitas.Domain.UserCases.Factura;

import com.Juangarcia.electricidadchispitas.Data.Factura.FacturaDataStore;
import com.Juangarcia.electricidadchispitas.Domain.Models.Factura;


import java.util.List;


    public class GetFacturaUseCase {
        private FacturaDataStore facturaDataStore;

        public GetFacturaUseCase(FacturaDataStore facturaDataStore) {
            this.facturaDataStore = facturaDataStore;
        }

        public List<Factura> execute() {
            return facturaDataStore.getAllFactures();
        }

}




