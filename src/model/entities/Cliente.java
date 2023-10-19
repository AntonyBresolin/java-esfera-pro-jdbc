package model.entities;

public class Cliente {



    private int clienteid;
    private String name;

    private String cpf;
    private int id_Endereco;

    public Cliente(int clienteid, String name, String cpf, int id_Endereco) {
        this.clienteid = clienteid;
        this.name = name;
        this.cpf= cpf;
        this.id_Endereco = id_Endereco;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public int getId_Endereco() {
        return id_Endereco;
    }

    public void setId_Endereco(int id_Endereco) {
        this.id_Endereco = id_Endereco;
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
}


