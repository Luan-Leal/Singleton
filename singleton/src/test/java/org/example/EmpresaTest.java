package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmpresaTest {
    @Test
    public void deveRetornarNomeEmpresa() {
        Empresa.getInstance().setNomeEmpresa("Empresa 1");
        assertEquals("Empresa 1", Empresa.getInstance().getNomeEmpresa());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Empresa.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", Empresa.getInstance().getUsuarioLogado());
    }
}
