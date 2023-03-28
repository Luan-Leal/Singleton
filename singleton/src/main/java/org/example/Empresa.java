package org.example;

public class Empresa {
    private Empresa() {};
    private static Empresa instance = new Empresa();
    public static Empresa getInstance() {
        return instance;
    }

    private String nomeEmpresa;
    private String usuarioLogado;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
