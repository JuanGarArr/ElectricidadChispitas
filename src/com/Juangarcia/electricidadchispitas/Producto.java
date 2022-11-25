package com.Juangarcia.electricidadchispitas;


public class Producto implements ProductoServicio {
    private Integer idProduct;
    private String name;
    private String brand;
    private String model;
    private Integer price;
    private Integer ivaType;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }


    @Override
    public Integer getId() {
        return this.idProduct;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public Integer getIvaType() {
        return this.ivaType;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setIvaType(Integer ivaType) {
        this.ivaType = ivaType;
    }
}

