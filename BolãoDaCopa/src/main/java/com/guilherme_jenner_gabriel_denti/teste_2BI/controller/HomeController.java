package com.guilherme_jenner_gabriel_denti.teste_2BI.controller;

import com.guilherme_jenner_gabriel_denti.teste_2BI.models.ApostaRepository;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.SelecaoRepository;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.SelecaoModel;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.PartidaRepository;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.PartidaModel;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.RodadaModel;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.RodadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Antonio Ayres ,Guilherme Jenner e Gabriel Denti
 */

@Controller
public class HomeController {

    SelecaoModel qatar = new SelecaoModel();
    SelecaoModel equador = new SelecaoModel();
    SelecaoModel holanda = new SelecaoModel();
    SelecaoModel senegal = new SelecaoModel();
    SelecaoModel inglaterra = new SelecaoModel();
    SelecaoModel usa = new SelecaoModel();
    SelecaoModel ira = new SelecaoModel();
    SelecaoModel wales = new SelecaoModel();
    SelecaoModel argentina = new SelecaoModel();
    SelecaoModel polonia = new SelecaoModel();
    SelecaoModel mexico = new SelecaoModel();
    SelecaoModel arabia_saudita = new SelecaoModel();
    SelecaoModel franca = new SelecaoModel();
    SelecaoModel australia = new SelecaoModel();
    SelecaoModel dinamarca = new SelecaoModel();
    SelecaoModel tunisia = new SelecaoModel();
    SelecaoModel espanha = new SelecaoModel();
    SelecaoModel alemanha = new SelecaoModel();
    SelecaoModel japao = new SelecaoModel();
    SelecaoModel costa_rica = new SelecaoModel();
    SelecaoModel marrocos = new SelecaoModel();
    SelecaoModel croacia = new SelecaoModel();
    SelecaoModel belgica = new SelecaoModel();
    SelecaoModel canada = new SelecaoModel();
    SelecaoModel brasil = new SelecaoModel();
    SelecaoModel servia = new SelecaoModel();
    SelecaoModel suica = new SelecaoModel();
    SelecaoModel camaroes = new SelecaoModel();
    SelecaoModel portugal = new SelecaoModel();
    SelecaoModel uruguai = new SelecaoModel();
    SelecaoModel gana = new SelecaoModel();
    SelecaoModel coreia_sul = new SelecaoModel();

    @Autowired
    RodadaRepository rodadaRepo;
    @Autowired
    SelecaoRepository selecaoRepository;
    @Autowired
    PartidaRepository partidaRepository;

    private void cadastrarSelecoes(){


        qatar.setNome("Qatar");
        equador.setNome("Equador");
        holanda.setNome("Holanda");
        senegal.setNome("Senegal");
        inglaterra.setNome("Inglaterra");
        usa.setNome("Estados Unidos");
        ira.setNome("Irã");
        wales.setNome("País de Gales");
        argentina.setNome("Argentina");
        mexico.setNome("México");
        polonia.setNome("Polônia");
        arabia_saudita.setNome("Arábia Saudita");
        franca.setNome("França");
        australia.setNome("Austrália");
        dinamarca.setNome("Dinamarca");
        tunisia.setNome("Tunísia");
        japao.setNome("Japão");
        espanha.setNome("Espanha");
        alemanha.setNome("Alemanha");
        costa_rica.setNome("Costa Rica");
        marrocos.setNome("Marrocos");
        croacia.setNome("Croácia");
        belgica.setNome("Bélgica");
        canada.setNome("Cánada");
        brasil.setNome("Brasil");
        servia.setNome("Sériva");
        suica.setNome("Suíça");
        camaroes.setNome("Camarões");
        portugal.setNome("Portugal");
        gana.setNome("Gana");
        uruguai.setNome("Uruguai");
        coreia_sul.setNome("Coréia do Sul");


        selecaoRepository.save(qatar);
        selecaoRepository.save(holanda);
        selecaoRepository.save(equador);
        selecaoRepository.save(senegal);
        selecaoRepository.save(inglaterra);
        selecaoRepository.save(ira);
        selecaoRepository.save(usa);
        selecaoRepository.save(wales);
        selecaoRepository.save(argentina);
        selecaoRepository.save(polonia);
        selecaoRepository.save(mexico);
        selecaoRepository.save(arabia_saudita);
        selecaoRepository.save(franca);
        selecaoRepository.save(australia);
        selecaoRepository.save(dinamarca);
        selecaoRepository.save(tunisia);
        selecaoRepository.save(japao);
        selecaoRepository.save(espanha);
        selecaoRepository.save(alemanha);
        selecaoRepository.save(costa_rica);
        selecaoRepository.save(marrocos);
        selecaoRepository.save(croacia);
        selecaoRepository.save(belgica);
        selecaoRepository.save(canada);
        selecaoRepository.save(brasil);
        selecaoRepository.save(servia);
        selecaoRepository.save(suica);
        selecaoRepository.save(camaroes);
        selecaoRepository.save(portugal);
        selecaoRepository.save(uruguai);
        selecaoRepository.save(coreia_sul);
        selecaoRepository.save(gana);
    }

     private void cadastrarRodada(){
        RodadaModel rodada1 = new RodadaModel();
        rodada1.setNumero(1);
        rodadaRepo.save(rodada1);
    }

    private void cadastrarPartidas(){
        PartidaModel partida1 = new PartidaModel();
        PartidaModel partida2 = new PartidaModel();
        PartidaModel partida3 = new PartidaModel();
        PartidaModel partida4 = new PartidaModel();
        PartidaModel partida5 = new PartidaModel();
        PartidaModel partida6 = new PartidaModel();
        PartidaModel partida7 = new PartidaModel();
        PartidaModel partida8 = new PartidaModel();
        PartidaModel partida9 = new PartidaModel();
        PartidaModel partida10 = new PartidaModel();
        PartidaModel partida11= new PartidaModel();
        PartidaModel partida12 = new PartidaModel();
        PartidaModel partida13 = new PartidaModel();
        PartidaModel partida14 = new PartidaModel();
        PartidaModel partida15 = new PartidaModel();
        PartidaModel partida16= new PartidaModel();
        partida1.setSelecao1(qatar);
        partida1.setSelecao2(equador);
        partida2.setSelecao1(holanda);
        partida2.setSelecao2(senegal);
        partida3.setSelecao1(inglaterra);
        partida3.setSelecao2(ira);
        partida4.setSelecao1(usa);
        partida4.setSelecao2(wales);
        partida5.setSelecao1(argentina);
        partida5.setSelecao2(arabia_saudita);
        partida6.setSelecao1(mexico);
        partida6.setSelecao2(polonia);
        partida7.setSelecao1(franca);
        partida7.setSelecao2(australia);
        partida8.setSelecao1(dinamarca);
        partida8.setSelecao2(tunisia);
        partida9.setSelecao1(alemanha);
        partida9.setSelecao2(japao);
        partida10.setSelecao1(espanha);
        partida10.setSelecao2(costa_rica);
        partida11.setSelecao1(belgica);
        partida11.setSelecao2(canada);
        partida12.setSelecao1(croacia);
        partida12.setSelecao2(marrocos);
        partida13.setSelecao1(brasil);
        partida13.setSelecao2(servia);
        partida14.setSelecao1(suica);
        partida14.setSelecao2(camaroes);
        partida15.setSelecao1(portugal);
        partida15.setSelecao2(gana);
        partida16.setSelecao1(uruguai);
        partida16.setSelecao2(coreia_sul);

        partidaRepository.save(partida1);
        partidaRepository.save(partida2);
        partidaRepository.save(partida3);
        partidaRepository.save(partida4);
        partidaRepository.save(partida5);
        partidaRepository.save(partida6);
        partidaRepository.save(partida7);
        partidaRepository.save(partida8);
        partidaRepository.save(partida9);
        partidaRepository.save(partida10);
        partidaRepository.save(partida11);
        partidaRepository.save(partida12);
        partidaRepository.save(partida13);
        partidaRepository.save(partida14);
        partidaRepository.save(partida15);
        partidaRepository.save(partida16);
    }

    boolean bancoPovoado = false;
    @Autowired
    ApostaRepository apostaRepository;

    @GetMapping(value = "/")
    public String home(Model model){
        if(!bancoPovoado){
            this.cadastrarSelecoes();
            this.cadastrarRodada();
            this.cadastrarPartidas();
            bancoPovoado = true;
        }
        model.addAttribute("apostas", apostaRepository.findAll());
        return "home";
    }

}
