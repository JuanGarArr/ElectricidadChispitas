package com.Juangarcia.electricidadchispitas.Domain.Models;

public class Autonomos implements Clientes {

    private String dni;
    private String name;
    private String surname;
    private String mailingAddress;
    private String town;
    private String province;
    private String email;
    private String phone;


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }


    @Override
    public String getId() {
        return this.dni;
    }

    @Override
    public String getName() {
        return this.name + surname;
    }

    @Override
    public String getMailingAddress() {
        return this.mailingAddress;
    }

    @Override
    public String getTown() {
        return this.town;
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

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
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


