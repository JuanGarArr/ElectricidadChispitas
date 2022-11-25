package com.Juangarcia.electricidadchispitas;

public class Sociedad implements Clientes {
    private String cif;
    private String enterpriseName;
    private String town;
    private String address;
    private String province;
    private String email;
    private String phone;


    @Override
    public String getId() {
        return this.cif;
    }

    @Override
    public String getName() {
        return this.enterpriseName;
    }

    @Override
    public String getMailingAddress() {
        return this.email;
    }


    @Override
    public String getTown() {
        return this.town;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getProvince() {
        return this.province;
    }

    @Override
    public String getEmail() {
        return this.email;
    }


    @Override
    public String getPhone() {
        return this.phone;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

