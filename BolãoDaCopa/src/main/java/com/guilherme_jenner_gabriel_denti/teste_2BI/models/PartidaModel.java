/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guilherme_jenner_gabriel_denti.teste_2BI.models;

import javax.persistence.*;


/**
 *
 * @author Antonio Ayres ,Guilherme Jenner e Gabriel Denti
 */


@Entity
@Table(name = "Partida")
public class PartidaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "selecao1_id", referencedColumnName = "id")
    private SelecaoModel selecao1;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "selecao2_id", referencedColumnName = "id")
    private SelecaoModel selecao2;
    private int gols_m;
    private int gols_v;
    private boolean resultado;

    public int getGols_m() {
        return gols_m;
    }

    public int getGols_v() {
        return gols_v;
    }

    public boolean isResultado() {
        return resultado;
    }

    public String nomePartida() {
        String saida;
        saida  = this.selecao1.getNome() + " x " + this.selecao2.getNome();
        return saida;
    }

    public void setGols_m(int gols_m) {
        this.gols_m = gols_m;
    }

    public void setGols_v(int gols_v) {
        this.gols_v = gols_v;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public SelecaoModel getSelecao1() {
        return selecao1;
    }

    public SelecaoModel getSelecao2() {
        return selecao2;
    }

    public Long getId() {
        return id;
    }

    public void setSelecao1(SelecaoModel selecao1) {
        this.selecao1 = selecao1;
    }

    public void setSelecao2(SelecaoModel selecao2) {
        this.selecao2 = selecao2;
    }
}
