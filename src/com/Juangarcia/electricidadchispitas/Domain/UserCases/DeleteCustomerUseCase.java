package com.Juangarcia.electricidadchispitas.Domain.UserCases;

import com.Juangarcia.electricidadchispitas.Data.CustomerDataStore;
import com.Juangarcia.electricidadchispitas.Data.MemCustomerDataStore;
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
