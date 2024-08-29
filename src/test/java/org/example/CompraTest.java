package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveAplicarDescontoPercentual() {
        Compra compra = new Compra(100.0f);
        compra.aplicarDesconto(new DescontoPercentual(10.0f));
        assertEquals(90.0f, compra.getValorFinal());
    }

    @Test
    void deveAplicarDescontoFixo() {
        Compra compra = new Compra(100.0f);
        compra.aplicarDesconto(new DescontoFixo(15.0f));
        assertEquals(85.0f, compra.getValorFinal());
    }

    @Test
    void deveAplicarDescontoEmDinheiro() {
        Compra compra = new Compra(120.0f);
        compra.aplicarDesconto(new DescontoEmDinheiro(100.0f, 20.0f));
        assertEquals(100.0f, compra.getValorFinal());
    }

    @Test
    void naoDeveAplicarDescontoEmDinheiroAbaixoDoValorMinimo() {
        Compra compra = new Compra(80.0f);
        compra.aplicarDesconto(new DescontoEmDinheiro(100.0f, 20.0f));
        assertEquals(80.0f, compra.getValorFinal());
    }
}
