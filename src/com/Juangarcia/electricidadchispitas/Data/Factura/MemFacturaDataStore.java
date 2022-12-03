package com.Juangarcia.electricidadchispitas.Data.Factura;


import com.Juangarcia.electricidadchispitas.Domain.Models.Factura;

import java.util.List;
import java.util.TreeMap;

public class MemFacturaDataStore  implements  FacturaDataStore{


    private TreeMap<Object, Factura> datastore = new TreeMap<Object,Factura>();


    @Override
    public void saveFacture(Factura factura) {

    }

    @Override
    public void deleteFacture(Factura factura) {

    }

    @Override
    public void updateFacture(Factura factura) {

    }

    @Override
    public List<Factura> getAllFactures() {
        return null;
    }

    @Override
    public Factura findById(Integer idFactura) {
        return null;
    }
}
