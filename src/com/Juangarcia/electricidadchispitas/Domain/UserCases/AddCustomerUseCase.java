package com.Juangarcia.electricidadchispitas.Domain.UserCases;

import com.Juangarcia.electricidadchispitas.Domain.Models.Clientes;
import com.Juangarcia.electricidadchispitas.Data.CustomerDataStore;
import com.Juangarcia.electricidadchispitas.Data.MemCustomerDataStore;

public class AddCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public AddCustomerUseCase ( CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }
    public void execute (Clientes customer){
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        customerDataStore.saveCustomer(customer);
    }

}
