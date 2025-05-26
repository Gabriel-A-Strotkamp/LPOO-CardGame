/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.seuprojeto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author Jennifer Ebertz
 */
@Entity
@Table(name = "tbl_carta")
public class Carta implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_car", sequenceName = "seq_car_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_car", strategy = GenerationType.SEQUENCE)
    @Column(name = "car_id")
    private int id;
    
    @Column(name = "car_nome",nullable=false, length = 100)
    private String nome;
    
    @Column(name = "car_ataque",nullable=false)
    private int ataque;
    
    @Column(name = "car_defesa",nullable=false)
    private int defesa;
     
    @Enumerated( EnumType.STRING)
    private Categoria categoria;
    
    @Column(name = "car_raridade", nullable=true)
    private int raridade;
    
    @ManyToMany(mappedBy = "baralho")
    private List<Jogador> listaJogador;

    public Carta() {
        listaJogador = new ArrayList<>();
    }

    public List<Jogador> getListaJogador() {
        return listaJogador;
    }

    public void setListaJogador(List<Jogador> listaJogador) {
        this.listaJogador = listaJogador;
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

    @Override
    public String toString() {
        return "id: "+id+ " | "+ nome +"("+ categoria+"): A: "+ataque+" - D: " + defesa;
    }
    
    
}
