package com.guilherme_jenner_gabriel_denti.teste_2BI.controller;


import com.guilherme_jenner_gabriel_denti.teste_2BI.models.ApostaRepository;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.ApostadorModel;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.ApostadorRepository;
import com.guilherme_jenner_gabriel_denti.teste_2BI.reqs.Requisicao_Cadastro;
import com.guilherme_jenner_gabriel_denti.teste_2BI.reqs.Requisicao_Login;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Antonio Ayres ,Guilherme Jenner e Gabriel Denti
 */

@Controller
public class LoginController {
    @Autowired
    ApostadorRepository apostadorRepository;

    public boolean verificarLogin(ApostadorModel apostador){
        String email_banco;
        String senha_banco;
        String email_form = apostador.getEmail();
        String senha_form = apostador.getSenha();
        boolean resultado;
        List<ApostadorModel> apostadores = apostadorRepository.findAll();
        for(int i = 0; i < apostadores.toArray().length; i++){
            email_banco = apostadores.get(i).getEmail();
            senha_banco = apostadores.get(i).getSenha();
            if(Objects.equals(email_banco, email_form) && Objects.equals(senha_banco, senha_form)){
                return true;
            }
            System.out.println("Conta do Banco - Email: " + email_banco + " Senha: " + senha_banco);
            System.out.println("Conta do Formulário - Email: " + email_form + " Senha: " + senha_form);
        }

        return false;
    }

    @GetMapping(value = "/login")
    public String login(Model model){

        return "login";
    }

    @PostMapping(value = "/login")
    public void login(Requisicao_Login req, Model model){
        ApostadorModel apostador = req.gerarUsuario();
        System.out.println(verificarLogin(apostador));
        model.addAttribute("verificarLogin",verificarLogin(apostador));
        model.addAttribute("conta",apostador);
    }
}
