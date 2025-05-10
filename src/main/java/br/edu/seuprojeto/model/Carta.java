/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.seuprojeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Jennifer Ebertz
 */
@Entity
@Table(name = "tbl_carta")
public class Carta {
    @Id
    @SequenceGenerator(name = "seq_car", sequenceName = "seq_car_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_car", strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column(name = "car_nome",nullable=false, length = 100)
    private String nome;
    
    @Column(name = "car_ataque",nullable=false, length = 100)
    private int ataque;
    
    @Column(name = "car_defesa",nullable=false, length = 100)
    private int defesa;
     
    @Enumerated( EnumType.STRING)
    private Categoria categoria;
    
    @Column(name = "car_raridade", nullable=true)
    private int raridade;

    public Carta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getRaridade() {
        return raridade;
    }

    public void setRaridade(int raridade) {
        this.raridade = raridade;
    }
    
}
