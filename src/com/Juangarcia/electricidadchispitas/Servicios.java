package com.Juangarcia.electricidadchispitas;

public class Servicios implements ProductoServicio{


    private Integer idService;
    private String name;
    private Integer price;
    private Integer ivaType;

    @Override
    public Integer getId() {
        return this.idService;
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

    public void setIdService(Integer idService) {
        this.idService = idService;
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
