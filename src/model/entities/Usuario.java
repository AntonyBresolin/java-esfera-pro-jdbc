package model.entities;

public abstract class Usuario {
    private String login;
    private String senha;
    private String nome;
    private int nivelAcesso;

    public Usuario(String login, String senha, String nome, int nivelAcesso) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.nivelAcesso = nivelAcesso;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
