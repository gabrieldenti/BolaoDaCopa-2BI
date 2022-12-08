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
@Table(name = "Rodada")
public class RodadaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
