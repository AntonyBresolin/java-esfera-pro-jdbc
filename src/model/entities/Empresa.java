package model.entities;

public class Empresa extends Usuario{
    private int id_Empresa;

    public Empresa(int id_Empresa, String login, String senha, String nome, int nivelAcesso) {
        super(login, senha, nome, nivelAcesso);
        this.id_Empresa = id_Empresa;
    }

    public int getId_Empresa() {
        return id_Empresa;
    }

    public void setId_Empresa(int id_Empresa) {
        this.id_Empresa = id_Empresa;
    }
}
