package com.Juangarcia.electricidadchispitas.Domain.UserCases.Customer;

import com.Juangarcia.electricidadchispitas.Data.Customer.CustomerDataStore;
import com.Juangarcia.electricidadchispitas.Domain.Models.Clientes;


public class AddCustomerUseCase {


        private CustomerDataStore customerDataStore;

        public AddCustomerUseCase(CustomerDataStore customerDataStore) {
            this.customerDataStore = customerDataStore;
        }

        public void execute(Clientes customer) {
            customerDataStore.saveCustomer(customer);
        }
    }

