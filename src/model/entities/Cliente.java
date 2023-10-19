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
}
