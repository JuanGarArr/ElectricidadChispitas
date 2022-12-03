package com.Juangarcia.electricidadchispitas.Domain.UserCases.Customer;

import com.Juangarcia.electricidadchispitas.Data.Customer.CustomerDataStore;
import com.Juangarcia.electricidadchispitas.Domain.Models.Clientes;

public class DeleteCustomerUseCase {

    private  CustomerDataStore customerDataStore;

    public DeleteCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore=customerDataStore;

    }

    public void execute(Clientes clientes){
        customerDataStore.deleteCustomer(clientes);
    }
}
