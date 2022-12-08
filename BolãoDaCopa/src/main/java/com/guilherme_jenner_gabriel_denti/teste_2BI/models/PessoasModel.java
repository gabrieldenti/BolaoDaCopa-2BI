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
@Table(name = "Pessoas")
public class PessoasModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "selecao_id", referencedColumnName = "id")
    private SelecaoModel selecao;
    private Tipo_Pessoa tipo;
    private int gols;
    private int assists;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public Tipo_Pessoa getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_Pessoa tipo) {
        this.tipo = tipo;
    }
}
