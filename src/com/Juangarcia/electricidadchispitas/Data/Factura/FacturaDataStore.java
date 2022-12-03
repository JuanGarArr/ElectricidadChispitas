package com.Juangarcia.electricidadchispitas.Data.Factura;


import com.Juangarcia.electricidadchispitas.Domain.Models.Factura;

import java.util.List;

public interface FacturaDataStore {

    void saveFacture(Factura factura);

    void deleteFacture(Factura factura);

    void updateFacture(Factura factura);

    List<Factura> getAllFactures();

    Factura findById (Integer idFactura);
}

