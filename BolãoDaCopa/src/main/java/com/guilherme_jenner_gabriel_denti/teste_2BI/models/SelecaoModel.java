/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guilherme_jenner_gabriel_denti.teste_2BI.models;

import javax.persistence.*;
import java.util.List;



/**
 *
 * @author Antonio Ayres ,Guilherme Jenner e Gabriel Denti
 */



@Entity
@Table(name = "Selecao")
public class SelecaoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    private String nomeTecnico;
    @OneToMany
    @JoinColumn(name = "jogadores_id", referencedColumnName = "id")
    private List<PessoasModel> jogadores;
    @OneToOne
    @JoinColumn(name = "tecnico_id", referencedColumnName = "id")
    private PessoasModel tecnico;

    private String continente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String nomeTecnico) {
        this.nomeTecnico = nomeTecnico;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public Long getId() {
        return id;
    }
    
}
