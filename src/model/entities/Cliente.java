package model.entities;

public class Cliente {
    private int id_Cliente;
    private String name;
    private String cpf;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(int id_Cliente, String name, String cpf, Endereco endereco) {
        this.id_Cliente = id_Cliente;
        this.name = name;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
