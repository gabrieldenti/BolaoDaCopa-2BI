package com.guilherme_jenner_gabriel_denti.teste_2BI.reqs;

import com.guilherme_jenner_gabriel_denti.teste_2BI.models.ApostaModel;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.ApostadorModel;

public class Requisicao_Login {
    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ApostadorModel gerarUsuario(){
        ApostadorModel apostadorModel = new ApostadorModel();
        apostadorModel.setSenha(this.senha);
        apostadorModel.setEmail(this.email);
        return apostadorModel;
    }

}
