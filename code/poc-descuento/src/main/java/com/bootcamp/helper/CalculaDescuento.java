package com.bootcamp.helper;

public class CalculaDescuento {

   private double DESCUENTO_RATE;

   public CalculaDescuento(double DESCUENTO_RATE) {
       this.DESCUENTO_RATE = DESCUENTO_RATE;
   }

   public double calcularDescuento(double price) {

       if (price <= 0) {
           return 0.0;
       }

       return price * DESCUENTO_RATE / 100;
   }
}