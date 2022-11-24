package com.Juangarcia.electricidadchispitas;

public class Sociedad implements Clientes {
    private String cif;
    private String enterpriseName;
    private String town;
    private String address;
    private String province;
    private String email;
    private String phone;


    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getCif() {
        return cif;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }


    @Override
    public String getMailingAddress() {
        return null;
    }

    @Override
    public void setMailingAddress(String mailingAddress) {

    }

    @Override
    public String getTown() {
        return null;
    }

    @Override
    public void setTown(String town) {

    }

    @Override
    public String getProvince() {
        return null;
    }

    @Override
    public void setProvince(String province) {

    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public String getPhone() {
        return null;
    }

    @Override
    public void setPhone(String phone) {

    }
}

