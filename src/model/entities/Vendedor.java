package model.entities;

public class Vendedor extends Usuario{
    private int id_Vendedor;
    private Gerente gerente;

    public Vendedor(int id_Vendedor, Gerente gerente, String login, String senha, String nome, int nivelAcesso) {
        super(login, senha, nome, nivelAcesso);
        this.id_Vendedor = id_Vendedor;
        this.gerente = gerente;
    }

    public int getId_Vendedor() {
        return id_Vendedor;
    }

    public void setId_Vendedor(int id_Vendedor) {
        this.id_Vendedor = id_Vendedor;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
