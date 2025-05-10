/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.seuprojeto.model;

import java.util.List;

/**
 *
 * @author Jennifer Ebertz
 */
public class Jogador {
    private int id;
    private String nickname;
    private int levelJogador;
    private List<Carta> baralho;

    public Jogador() {
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

    public void setBaralho(List<Carta> baralho) {
        this.baralho = baralho;
    }
    
    
}
