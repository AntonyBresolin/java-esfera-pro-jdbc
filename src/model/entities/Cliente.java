package model.entities;

public class Cliente {



    private int clienteid;
    private String name;

    private String email;

    private String cpf;

    public cliente(int clienteid, String name, String email, String cpf) {
        this.clienteid = clienteid;
        this.name = name;
        this.email = email;
        this.cpf= cpf;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public void setId(clienteid) {
        this.clienteid = clienteid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}


