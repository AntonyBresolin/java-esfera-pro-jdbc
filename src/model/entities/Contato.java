package model.entities;

public class Contato {
    private int id_Contato;
    private int tipoContato;
    private String Valor;


    public Contato() {
    }

    public Contato(int id_Contato, int tipoContato, String valor) {
        this.id_Contato = id_Contato;
        this.tipoContato = tipoContato;
        Valor = valor;
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
        return Valor;
    }

    public void setValor(String valor) {
        Valor = valor;
    }
}
