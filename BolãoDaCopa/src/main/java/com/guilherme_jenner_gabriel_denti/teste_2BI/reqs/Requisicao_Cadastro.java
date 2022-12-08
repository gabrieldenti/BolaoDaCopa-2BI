package com.guilherme_jenner_gabriel_denti.teste_2BI.reqs;

import com.guilherme_jenner_gabriel_denti.teste_2BI.models.ApostadorModel;


/**
 *
 * @author Antonio Ayres ,Guilherme Jenner e Gabriel Denti
 */

public class Requisicao_Cadastro {

    private String nome;
    private String email;
    private String cpf;
    private String endereco;
    private String senha;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public ApostadorModel receberUsuario(){
        ApostadorModel usuario = new ApostadorModel();
        usuario.setEmail(this.email);
        usuario.setNome(this.nome);
        usuario.setCpf(this.cpf);
        usuario.setSenha(this.senha);
        return usuario;
    }
}
