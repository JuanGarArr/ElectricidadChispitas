package com.Juangarcia.electricidadchispitas;

public class ImpresionFactura {

   public static void print(Factura factura1) {
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
       System.out.println(" ");
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
       System.out.println("Total: " + (factura1.getProduct().getPrice()) + factura1.getService().getPrice());
       System.out.println(" ");
   }
       public  static void println (Factura factura2){
       System.out.println(" ");
       System.out.println("  FACTURA" + factura2.getId());
       System.out.println(" ");
       System.out.println("Fecha: " + factura2.getDate());
       System.out.println("Client:");
       System.out.println("cif/nif: " + factura2.getClient().getId());
       System.out.println(" ");
       System.out.println("nombre: " + factura2.getClient().getName());
       System.out.println("direccion: " + factura2.getClient().getMailingAddress());
       System.out.println("poblacion: " + factura2.getClient().getTown());
       System.out.println("provincia: " + factura2.getClient().getProvince());
       System.out.println("email: " + factura2.getClient().getEmail());
       System.out.println("Telefono: " + factura2.getClient().getPhone());
       System.out.println("");
       System.out.println("  VENTA");
       System.out.println(" ");
       System.out.println("codigo: " + factura2.getService().getId());
       System.out.println("nombre: " + factura2.getService().getName());
       System.out.println("precio: " + factura2.getService().getPrice());
       System.out.println("tipo IVA: " + factura2.getService().getIvaType());
       System.out.println(" ");
       System.out.println("codigo: " + factura2.getProduct().getId());
       System.out.println("nombre: " + factura2.getProduct().getName());
       System.out.println("precio: " + factura2.getProduct().getPrice());
       System.out.println("tipo IVA: " + factura2.getProduct().getIvaType());
       System.out.println("TOTAL:");
       System.out.println("Total: " + (factura2.getProduct().getPrice())+factura2.getService().getPrice());
       System.out.println(" ");

   }
 }
