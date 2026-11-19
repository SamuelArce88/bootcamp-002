package com.bootcamp.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TaxCalculatorTest {

    private static final double DELTA = 0.0001;

    // El valor del producto es un valor mayor a cero y se regresa el número correspondiente al valor del IVA
    @Test
    void shouldCalculateIvaWhenPriceIsGreaterThanZero() {
        double valorProducto = 100.0;
        TaxCalculator calculator = new TaxCalculator(16.0);

        double ivaCalculado = calculator.calculateIva(valorProducto);

        assertEquals(16.0, ivaCalculado, DELTA);
    }

    @Test
    void shouldCalculateIvaCorrectly() {
        double valor_producto = 100.0;
        TaxCalculator helper = new TaxCalculator(16.0);

        double iva_calculado = helper.calculateIva(valor_producto);

        assertEquals(16.0, iva_calculado);
    }

    //El valor del producto es un valor menor a cero y se regresa el 0 como resultado
    @Test
    void shouldCalculateIvaWhenPriceIsLessThanZero() {
        double valorProducto = -100.0;
        TaxCalculator calculator = new TaxCalculator(16.0);

        double ivaCalculado = calculator.calculateIva(valorProducto);

        assertEquals(0.0, ivaCalculado, DELTA);
    }


    //El valor del producto es un valor igual a cero y se regresa el 0 como resultado
    @Test
    void shouldCalculateIvaWhenPriceIsZero() {
        double valorProducto = 0.0;
        TaxCalculator calculator = new TaxCalculator(16.0);

        double ivaCalculado = calculator.calculateIva(valorProducto);

        assertEquals(0.0, ivaCalculado, DELTA);
    }

 }