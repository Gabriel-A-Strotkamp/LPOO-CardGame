/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.seuprojeto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Jennifer Ebertz
 */
@Entity
@Table(name = "tbl_jogador")
public class Jogador implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_jog", sequenceName = "seq_jog_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_jog", strategy = GenerationType.SEQUENCE)
    @Column(name = "jog_id")
    private int id;
    
    @Column(name = "nickname", nullable=false, length = 100)
    private String nickname;
    
    @Column(name = "level", nullable=false)
    private int levelJogador;
    
    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable(
           name = "tbl_baralho_jogador",
           joinColumns = @JoinColumn(name = "jogador"),
           inverseJoinColumns = @JoinColumn(name = "carta")
            )
    private List<Carta> baralho;

    public Jogador() {
        baralho = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevelJogador() {
        return levelJogador;
    }

    public void setLevelJogador(int levelJogador) {
        this.levelJogador = levelJogador;
    }

    public List<Carta> getBaralho() {
        return baralho;
    }

    public void addCarta(Carta c){
        baralho.add(c);
    }

    public void removeCarta(Carta c){
        baralho.remove(c);
    }
    @Override
    public String toString() {
        return nickname;
    }
    
}
