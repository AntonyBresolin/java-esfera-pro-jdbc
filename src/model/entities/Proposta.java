package model.entities;

import java.util.Date;

public class Proposta {
    private int id_Proposta;
    private Double valor;
    private Date data;
    private String nome;
    private String descricao;
    private String status;
    private String resposta;
    private String observacao;
    private int id_vendedor;

    public Proposta() {
    }

    public Proposta(int id_Proposta, Double valor, Date data, String nome, String descricao, String status, String resposta, String observacao, int id_vendedor) {
        this.id_Proposta = id_Proposta;
        this.valor = valor;
        this.data = data;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.resposta = resposta;
        this.observacao = observacao;
        this.id_vendedor = id_vendedor;
    }

    public int getId_Proposta() {
        return id_Proposta;
    }

    public void setId_Proposta(int id_Proposta) {
        this.id_Proposta = id_Proposta;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }
}
