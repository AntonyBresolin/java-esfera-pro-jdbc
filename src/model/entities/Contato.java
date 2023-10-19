package model.entities;

public class Contato {
    private int id_Contato;
    private int tipoContato;
    private String valor;
    private int id_Cliente;


    public Contato() {
    }

    public Contato(int id_Contato, int tipoContato, String valor, int id_Cliente) {
        this.id_Contato = id_Contato;
        this.tipoContato = tipoContato;
        this.valor = valor;
        this.id_Cliente = id_Cliente;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public int getId_Contato() {
        return id_Contato;
    }

    public void setId_Contato(int id_Contato) {
        this.id_Contato = id_Contato;
    }

    public int getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(int tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
