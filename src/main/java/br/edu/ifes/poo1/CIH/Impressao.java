/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo1.CIH;

import br.edu.ifes.poo1.CDP.Jogador;
import br.edu.ifes.poo1.CDP.Tabuleiro;
import br.edu.ifes.poo1.util.Cor;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Impressao {
    public void Impressao(Tabuleiro tab) {

        System.out.println("\t\t\t\t\t\t"+" PRETAS "+"\n");
        int linha = 8;
        while (linha != 0) {
            for (int coluna = 1; coluna <= 8; coluna++) {
                System.out.print("" + coluna + linha + " - ");
                if (tab.retornaPeca("" + coluna + linha) == null) {
                    System.out.print(" [  ] ");
                }else{
                    System.out.print(tab.retornaPeca("" + coluna + linha).getNome().getApelidoPeca());
                    
                    if (tab.retornaPeca("" + coluna + linha).getCor() == Cor.BRANCO) {
                        System.out.print(Cor.BRANCO.getCorPeca());
                    }else {
                        if (tab.retornaPeca("" + coluna + linha).getCor() == Cor.PRETO) {
                            System.out.print(Cor.PRETO.getCorPeca());
                        }
                }   
                }
                System.out.print(" | ");
            }
            System.out.println("\n");
            linha--;
         
        }
        System.out.println("\t\t\t\t\t\t"+" BRANCAS ");   
    }
    public void imprimeJogador(Jogador jog) {

    }
    public void imprimeMenu() {
        System.out.println("##MENU##");
        System.out.println("1 - Inicia Partida");
        System.out.println("2 - Dados da jogadas");
        System.out.println("3 - Sair");
    }

    public void imprimeModoJogo() {
        System.out.println("##    MENU    ##");
        System.out.println("##TIPO DE JOGO##");
        System.out.println("1 - Humano vs Humano");
        System.out.println("2 - Humano vs Computador");
        System.out.println("3 - Sair");
    }
    public void imprimeTipo() {
        System.out.println("##         MENU         ##");
        System.out.println("##  ESCOLHA A INTERFACE ##");
        System.out.println("1 - Textual");
        System.out.println("2 - Gráfica");
        System.out.println("3 - Sair");
    }
}
