package model.entities;

public class Vendedor extends Usuario{
    private int id_Vendedor;
    private int id_Gerente;

    public Vendedor(int id_Vendedor, int id_Gerente, String login, String senha, String nome, int nivelAcesso) {
        super(login, senha, nome, nivelAcesso);
        this.id_Vendedor = id_Vendedor;
        this.id_Gerente = id_Gerente;
    }

    public int getId_Vendedor() {
        return id_Vendedor;
    }

    public void setId_Vendedor(int id_Vendedor) {
        this.id_Vendedor = id_Vendedor;
    }

    public int getId_Gerente() {
        return id_Gerente;
    }

    public void setId_Gerente(int id_Gerente) {
        this.id_Gerente = id_Gerente;
    }
}
