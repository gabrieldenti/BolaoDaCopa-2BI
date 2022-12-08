package com.guilherme_jenner_gabriel_denti.teste_2BI.controller;


import com.guilherme_jenner_gabriel_denti.teste_2BI.models.ApostaModel;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.ApostaRepository;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.ApostadorModel;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.PartidaRepository;
import com.guilherme_jenner_gabriel_denti.teste_2BI.reqs.Requisicao_Aposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Antonio Ayres ,Guilherme Jenner e Gabriel Denti
 */
@Controller
public class ApostaController {
    @Autowired
    ApostaRepository apostaRepo;
    @Autowired
    PartidaRepository partidaRepository;

    @GetMapping(value= "/aposta")
    public String aposta(Model model){
        model.addAttribute("partidas", partidaRepository.findAll());
        return "aposta";
    }

    @PostMapping(value = "/aposta")
    public void aposta(Requisicao_Aposta req, Model model){
        model.addAttribute("partidas", partidaRepository.findAll());
        ApostaModel apostaRegistrada = req.gerarAposta();
        apostaRepo.save(apostaRegistrada);
    }
}
