package model.entities;

public class Gerente extends Usuario{
    private int id_Gerente;
    private Empresa empresa;

    public Gerente(int id_Gerente, Empresa empresa, String login, String senha, String nome, int nivelAcesso) {
        super(login, senha, nome, nivelAcesso);
        this.id_Gerente = id_Gerente;
        this.empresa = empresa;
    }

    public int getId_Gerente() {
        return id_Gerente;
    }

    public void setId_Gerente(int id_Gerente) {
        this.id_Gerente = id_Gerente;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
