package com.guilherme_jenner_gabriel_denti.teste_2BI.controller;



import com.guilherme_jenner_gabriel_denti.teste_2BI.models.ApostadorModel;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.ApostadorRepository;
import com.guilherme_jenner_gabriel_denti.teste_2BI.reqs.Requisicao_Cadastro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


/**
 *
 * @author Antonio Ayres ,Guilherme Jenner e Gabriel Denti
 */

@Controller
public class CadastroController {

    @Autowired
    ApostadorRepository apostadorRepository;


    @GetMapping(value = "/cadastro")
    public String register(Requisicao_Cadastro req, Model model){
        return "cadastro";
    }

    @PostMapping(value="/cadastro")
    public void registrar(Requisicao_Cadastro req, Model model){
        ApostadorModel usuarioCadastrado = req.receberUsuario();
        apostadorRepository.save(usuarioCadastrado);
    }
}
