/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guilherme_jenner_gabriel_denti.teste_2BI.models;


/**
 *
 * @author Antonio Ayres ,Guilherme Jenner e Gabriel Denti
 */

import javax.persistence.*;

@Entity
@Table(name = "Aposta")
public class ApostaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "partida_id", referencedColumnName = "id")
    private PartidaModel partida;
    private float quantia;
    private float odd;
    private String tipo;

    public PartidaModel getPartida() {
        return partida;
    }

    public void setPartida(PartidaModel partida) {
        this.partida = partida;
    }

    public float getQuantia() {
        return quantia;
    }

    public void setQuantia(float quantia) {
        this.quantia = quantia;
    }

    public float getOdd() {
        return odd;
    }

    public void setOdd(float odd) {
        this.odd = odd;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
