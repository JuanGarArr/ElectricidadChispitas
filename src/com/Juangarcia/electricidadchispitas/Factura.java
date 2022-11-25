package com.Juangarcia.electricidadchispitas;

public class Factura {
    private Integer id;
    private String date;
    private Clientes client;
    private Producto product;
    private Servicios service;
    private String taxableBase;
    private String total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Clientes getClient() {
        return client;
    }

    public void setClient(Clientes client) {
        this.client = client;
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }

    public Servicios getService() {
        return service;
    }

    public void setService(Servicios service) {
        this.service = service;
    }

    public String getTaxableBase() {
        return taxableBase;
    }

    public void setTaxableBase(String taxableBase) {
        this.taxableBase = taxableBase;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
