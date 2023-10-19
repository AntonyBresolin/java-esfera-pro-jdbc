package model.entities;

import java.util.ArrayList;

public class Contato {
    private int id_Contato;
    private int tipoContato;
    private String valor;
    private ArrayList<Cliente> clientes;


    public Contato() {
    }

    public Contato(int id_Contato, int tipoContato, String valor, ArrayList<Cliente> clientes) {
        this.id_Contato = id_Contato;
        this.tipoContato = tipoContato;
        this.valor = valor;
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
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
