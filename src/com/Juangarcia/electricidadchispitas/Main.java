package com.Juangarcia.electricidadchispitas;
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
        System.out.print("");
//Productos
        System.out.println("DATOS PRODUCTOS");

        Producto producto = new Producto();
        producto.setIdProduct(sc.nextInt());
        System.out.print("Nombre:");
        producto.setName(sc.next());
        System.out.print("Marca:");
        producto.setBrand(sc.next());
        System.out.print("Modelo:");
        producto.setModel(sc.next());
        System.out.print("Precio:");
        producto.setPrice(sc.nextInt());
        System.out.print("Tipo IVA:");
        producto.setIvaType(sc.nextInt());
        System.out.print("");

//Servicios
        System.out.println("DATOS SERVICIOS");

        Servicios servicio = new Servicios();
        System.out.print("Id:");
        servicio.setIdService(sc.nextInt());
        System.out.print("Nombre:");
        servicio.setName(sc.next());
        System.out.print("Precio:");
        servicio.setPrice(sc.nextInt());
        System.out.print("Tipo IVA:");
        servicio.setIvaType(sc.nextInt());
        System.out.print("");

//FacturaAutonomo
        System.out.println("DATOS FACTURA DE AUTONOMOS");

        Factura factura1 = new Factura();
        System.out.print("Id:");
        factura1.setId(sc.nextInt());
        System.out.print("Fecha:");
        factura1.setDate(sc.next());
        factura1.setClient(sociedad);
        factura1.setProduct(producto);
        factura1.setService(servicio);
        System.out.print("Base Imponible:");
        factura1.setTaxableBase(sc.next());
        System.out.print("Total:");
        factura1.setTotal(sc.next());
        System.out.print("");

//FacturaSociedad
        System.out.println("DATOS FACTURA DE SOCIEDAD");

        Factura factura2 = new Factura();
        factura2.setId(2);
        System.out.print("Fecha:");
        factura2.setDate(sc.next());
        factura2.setClient(sociedad);
        factura2.setProduct(producto);
        factura2.setService(servicio);
        System.out.print("Base Imponible:");
        factura2.setTaxableBase(sc.next());
        System.out.print("Total:");
        factura2.setTotal(sc.next());
        System.out.print("");

        //FACTURA

        System.out.println("");
        System.out.println("  FACTURA" + factura1.getId());
        System.out.println("");
        System.out.println("Fecha: " + factura1.getDate());
        System.out.println("Client:");
        System.out.println("cif/nif: " + factura1.getClient().getId());
        System.out.println("");
        System.out.println("nombre: " + factura1.getClient().getName());
        System.out.println("direccion: " + factura1.getClient().getMailingAddress());
        System.out.println("poblacion: " + factura1.getClient().getTown());
        System.out.println("provincia: " + factura1.getClient().getProvince());
        System.out.println("email: " + factura1.getClient().getEmail());
        System.out.println("Telefono: " + factura1.getClient().getPhone());
        System.out.println("");
        System.out.println("  VENTA");
        System.out.println("");
        System.out.println("codigo: " + factura1.getService().getId());
        System.out.println("nombre: " + factura1.getService().getName());
        System.out.println("precio: " + factura1.getService().getPrice());
        System.out.println("tipo IVA: " + factura1.getService().getIvaType());
        System.out.println("");
        System.out.println("codigo: " + factura1.getProduct().getId());
        System.out.println("nombre: " + factura1.getProduct().getName());
        System.out.println("precio: " + factura1.getProduct().getPrice());
        System.out.println("tipo IVA: " + factura1.getProduct().getIvaType());
        System.out.println("TOTAL:");
        System.out.println("Total: " + (factura1.getProduct().getPrice())+factura1.getService().getPrice());
        System.out.println("");



    }
}