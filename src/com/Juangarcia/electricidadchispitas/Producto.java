package com.Juangarcia.electricidadchispitas;

public class Producto implements ProductoServicio{
    private Integer idProduct;
    private String name;
    private String brand;
    private  String model;
    private  String price;
    private  Integer ivaType;

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
    public String getId() {
        return null;
    }

    @Override
    public void setId(Integer id) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPrice() {
        return null;
    }

    @Override
    public void setPrice(String Price) {

    }

    @Override
    public String getIvaType() {
        return null;
    }

    @Override
    public void setIvaType(String ivaType) {

    }
}

