package com.Juangarcia.electricidadchispitas;

public class Autonomos implements Clientes {

    private String dni;
    private String name;
    private String surname;
    private String mailingAddress;
    private String town;
    private String province;
    private String email;
    private String phone;

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
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


