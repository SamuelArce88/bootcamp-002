package com.bootcamp.helper;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculaDescuentoTest {

    private static final double DELTA = 0.001;

    @Test
    void shouldCalculateDiscountWhenPriceIsGreaterThanZero() {
        double valorProducto = 100.0;
        CalculaDescuento calculator = new CalculaDescuento(10.0);

        double descuentoCalculado = calculator.calcularDescuento(valorProducto);

        assertEquals(10.0, descuentoCalculado, DELTA);
    }

    @Test
    void shouldCalculateDiscountWhenPriceIsLessThanZero() {
        double valorProducto = -100.0;
        CalculaDescuento calculator = new CalculaDescuento(10.0);

        double descuentoCalculado = calculator.calcularDescuento(valorProducto);

        assertEquals(0.0, descuentoCalculado, DELTA);
    }

    @Test
    void shouldCalculateDiscountWhenPriceIsZero() {
        double valorProducto = 0.0;
        CalculaDescuento calculator = new CalculaDescuento(10.0);

        double descuentoCalculado = calculator.calcularDescuento(valorProducto);

        assertEquals(0.0, descuentoCalculado, DELTA);
    }
}