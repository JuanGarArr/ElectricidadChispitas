package com.Juangarcia.electricidadchispitas.Domain.UserCases.Customer;

import com.Juangarcia.electricidadchispitas.Data.Customer.CustomerDataStore;
import com.Juangarcia.electricidadchispitas.Domain.Models.Clientes;

import java.util.List;

public class GetCustomersUseCase {

    private CustomerDataStore customerDataStore;

    public GetCustomersUseCase(CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }

    public List<Clientes> execute() {
        return customerDataStore.getAllCustomers();
    }
}
