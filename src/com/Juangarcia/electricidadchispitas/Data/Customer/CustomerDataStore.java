package com.Juangarcia.electricidadchispitas.Data.Customer;

import com.Juangarcia.electricidadchispitas.Domain.Models.Clientes;

import java.util.List;

public interface CustomerDataStore {

    void saveCustomer(Clientes cliente);

    void deleteCustomer(Clientes clientes);

    void updateCustomer(Clientes clientes);

    List<Clientes> getAllCustomers();

    Clientes findById (Integer codCliente);
}
