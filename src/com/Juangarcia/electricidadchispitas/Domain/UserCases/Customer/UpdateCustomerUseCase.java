package com.Juangarcia.electricidadchispitas.Domain.UserCases.Customer;

import com.Juangarcia.electricidadchispitas.Data.Customer.CustomerDataStore;
import com.Juangarcia.electricidadchispitas.Domain.Models.Clientes;

public class UpdateCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public  UpdateCustomerUseCase (CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute (Clientes clientes){
        customerDataStore.updateCustomer(clientes);
    }

}
