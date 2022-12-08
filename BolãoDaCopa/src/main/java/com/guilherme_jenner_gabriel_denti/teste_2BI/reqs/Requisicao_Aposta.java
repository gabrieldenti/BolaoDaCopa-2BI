package com.guilherme_jenner_gabriel_denti.teste_2BI.reqs;


import com.guilherme_jenner_gabriel_denti.teste_2BI.models.ApostaModel;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.PartidaModel;
import com.guilherme_jenner_gabriel_denti.teste_2BI.models.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 *
 * @author Antonio Ayres ,Guilherme Jenner e Gabriel Denti
 */

public class Requisicao_Aposta {

    private PartidaModel partida_id;
    private float quantia;
    private float odd;
    private String tipo;

    public PartidaModel getPartida() {
        return partida_id;
    }

    public void setPartida(PartidaModel partida) {
        this.partida_id = partida;
    }

    public void setOdd(float odd) {
        this.odd = odd;
    }

    public float getOdd() {
        return odd;
    }

    public void setQuantia(float quantia) {
        this.quantia = quantia;
    }

    public float getQuantia() {
        return quantia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public ApostaModel gerarAposta(){

        ApostaModel aposta = new ApostaModel();
        aposta.setOdd(this.odd);

        aposta.setPartida(partida_id);
        aposta.setQuantia(this.quantia);
        aposta.setTipo(this.tipo);
        return aposta;
    }
}
