/**package com.Juangarcia.electricidadchispitas.Presentacion;
import com.Juangarcia.electricidadchispitas.Data.CustomerDataStore;
import com.Juangarcia.electricidadchispitas.Data.MemCustomerDataStore;
import com.Juangarcia.electricidadchispitas.Domain.Models.*;
import com.Juangarcia.electricidadchispitas.Domain.UserCases.AddCustomerUseCase;
import com.Juangarcia.electricidadchispitas.Domain.UserCases.DeleteCustomerUseCase;
import com.Juangarcia.electricidadchispitas.Domain.UserCases.GetCustomerUseCase;
import com.Juangarcia.electricidadchispitas.Domain.UserCases.UpdateCustomerUseCase;

import java.util.List;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Autonomos
        System.out.println("DATOS AUTONOMOS");

        Autonomos autonomo = new Autonomos();
        System.out.print("Dni:");
        autonomo.setDni(sc.next());
        System.out.print("Nombre:");
        autonomo.setName(sc.next());
        System.out.print("Apellidos:");
        autonomo.setSurname(sc.next());
        System.out.print("Direccion postal:");
        autonomo.setMailingAddress(sc.next());
        System.out.print("Poblacion:");
        autonomo.setTown(sc.next());
        System.out.print("Provincia:");
        autonomo.setProvince(sc.next());
        System.out.print("Email:");
        autonomo.setEmail(sc.next());
        System.out.print("Telefono:");
        autonomo.setPhone(sc.next());
        System.out.print("");
//Sociedades
        System.out.println("DATOS SOCIEDADES");

        Sociedad sociedad = new Sociedad();
        System.out.print("Cif:");
        sociedad.setCif(sc.next());
        System.out.print("Nombre:");
        sociedad.setEnterpriseName(sc.next());
        System.out.print("Direccion postal:");
        sociedad.setAddress(sc.next());
        System.out.print("Poblacion:");
        sociedad.setTown(sc.next());
        System.out.print("Provincia:");
        sociedad.setProvince(sc.next());
        System.out.print("Email:");
        sociedad.setEmail(sc.next());
        System.out.print("Telefono:");
        sociedad.setPhone(sc.next());
        System.out.println("");
//Producto1
        System.out.println("DATOS PRODUCTO 1");

        Producto producto1 = new Producto();
        producto1.setIdProduct(sc.nextInt());
        System.out.print("Nombre:");
        producto1.setName(sc.next());
        System.out.print("Marca:");
        producto1.setBrand(sc.next());
        System.out.print("Modelo:");
        producto1.setModel(sc.next());
        System.out.print("Precio:");
        producto1.setPrice(sc.nextInt());
        System.out.print("Tipo IVA:");
        producto1.setIvaType(sc.nextInt());
        System.out.println("");

 //Producto2
        System.out.println("DATOS PRODUCTO 2");

        Producto producto2 = new Producto();
        producto2.setIdProduct(sc.nextInt());
        System.out.print("Nombre:");
        producto2.setName(sc.next());
        System.out.print("Marca:");
        producto2.setBrand(sc.next());
        System.out.print("Modelo:");
        producto2.setModel(sc.next());
        System.out.print("Precio:");
        producto2.setPrice(sc.nextInt());
        System.out.print("Tipo IVA:");
        producto2.setIvaType(sc.nextInt());
        System.out.println("");

//Servicio1
        System.out.println("DATOS SERVICIO 1");

        Servicios servicio1 = new Servicios();
        System.out.print("Id:");
        servicio1.setIdService(sc.nextInt());
        System.out.print("Nombre:");
        servicio1.setName(sc.next());
        System.out.print("Precio:");
        servicio1.setPrice(sc.nextInt());
        System.out.print("Tipo IVA:");
        servicio1.setIvaType(sc.nextInt());
        System.out.println("");

//Servicio2
        System.out.println("DATOS SERVICIO 2");

        Servicios servicio2 = new Servicios();
        System.out.print("Id:");
        servicio2.setIdService(sc.nextInt());
        System.out.print("Nombre:");
        servicio2.setName(sc.next());
        System.out.print("Precio:");
        servicio2.setPrice(sc.nextInt());
        System.out.print("Tipo IVA:");
        servicio2.setIvaType(sc.nextInt());
        System.out.println("");

//FacturaAutonomo
        System.out.println("DATOS FACTURA DE AUTONOMOS");

        Factura factura1 = new Factura();
        System.out.print("Id:");
        factura1.setId(sc.nextInt());
        System.out.print("Fecha:");
        factura1.setDate(sc.next());
        factura1.setClient(sociedad);
        factura1.setProduct(producto1);
        factura1.setService(servicio1);
        System.out.print("Base Imponible: " +producto1.getPrice());
        System.out.print("Total: "+producto1.getPrice() +servicio1.getPrice());
        System.out.println("");

//FacturaSociedad
        System.out.println("DATOS FACTURA DE SOCIEDAD");

        Factura factura2 = new Factura();
        factura2.setId(2);
        System.out.print("Fecha:");
        factura2.setDate(sc.next());
        factura2.setClient(sociedad);
        factura2.setProduct(producto2);
        factura2.setService(servicio2);
        System.out.print("Base Imponible: " +producto2.getPrice());
        System.out.print("Total: "+producto2.getPrice() +servicio2.getPrice());
        System.out.println("");


        CustomerDataStore customerDataStore = new MemCustomerDataStore();

        AddCustomerUseCase addCustomerUseCase = new AddCustomerUseCase();
        addCustomerUseCase.execute(Autonomos);
        addCustomerUseCase.execute(Sociedad);

        GetCustomerUseCase getCustomerUseCase = new GetCustomerUseCase();
        List <Clientes> customers = getCustomerUseCase.execute();
        for(int i= 0; i < customers.size(); i++){
            printClientes(customers.get(i));
        }

        System.out.println("----------Eliminado----------");

        DeleteCustomerUseCase deleteCustomerUseCase = new DeleteCustomerUseCase(customerDataStore);
        deleteCustomerUseCase.execute(Autonomos);
        List <Clientes> customers2 = getCustomerUseCase.execute();
        for(int i= 0; i < customers2.size(); i++){
            printClientes(customers2.get(i));
        }

        System.out.println("----------Modificando----------");
        UpdateCustomerUseCase updateCustomerUseCase = new UpdateCustomerUseCase((customerDataStore));
        updateCustomerUseCase.execute(Sociedad);
        List <Clientes> customers3 = getCustomerUseCase.execute();
        for(int i= 0; i < customers3.size(); i++){
            printClientes(customers3.get(i));
        }

//FACTURA

        ImpresionFactura.print(factura1);
        ImpresionFactura.print(factura2);

     }
    }
 }
 **/