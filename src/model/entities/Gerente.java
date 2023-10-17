package model.entities;

public class Gerente extends Usuario{
    private int id_Gerente;
    private int id_Empresa;

    public Gerente(int id_Gerente, int id_Empresa, String login, String senha, String nome, int nivelAcesso) {
        super(login, senha, nome, nivelAcesso);
        this.id_Gerente = id_Gerente;
        this.id_Empresa = id_Empresa;
    }

    public int getId_Gerente() {
        return id_Gerente;
    }

    public void setId_Gerente(int id_Gerente) {
        this.id_Gerente = id_Gerente;
    }

    public int getId_Empresa() {
        return id_Empresa;
    }

    public void setId_Empresa(int id_Empresa) {
        this.id_Empresa = id_Empresa;
    }
}
