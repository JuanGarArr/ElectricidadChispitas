package com.Juangarcia.electricidadchispitas.Domain;

import com.Juangarcia.electricidadchispitas.Clientes;
import com.Juangarcia.electricidadchispitas.Data.CustomerDataStore;
import com.Juangarcia.electricidadchispitas.Data.MemCustomerDataStore;

public class AddCustomerUseCase {

    public void execute (Clientes customer){
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        customerDataStore.saveCustomer(customer);
    }

}
