package com.miempresa.inventario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void pruebaSumaSimple() {
        assertEquals(5, App.sumar(2, 3));
    }
}

