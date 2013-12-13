/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifes.poo1.CDP.Pecas;

import br.edu.ifes.poo1.CDP.PecaAbstrata;
import br.edu.ifes.poo1.util.Cor;
import br.edu.ifes.poo1.util.PecaNome;

/**
 *
 * @author 20121BSI0082
 */
//O controle verifica se pode andar.
public class Peao extends PecaAbstrata {

    public Peao(Cor cor) {
        super(cor, PecaNome.PEAO);
    }

    //Preto ou branco
    //0 = linha,1 = coluna
    @Override
    public boolean andar(String posicaoAtual, String proximaPosicao ) {
        if (posicaoAtual.charAt(0) == 2 || posicaoAtual.charAt(0) == 7){
            //Sinaliza se ele pode andar a quantidade de casas solicitadas.
            return (Math.abs(proximaPosicao.charAt(0) - posicaoAtual.charAt(0)) <= 2); 
        }
        else{
            //Sinaliza q ele soh pode ou nao andar uma casa.
            return (Math.abs(proximaPosicao.charAt(0) - posicaoAtual.charAt(0)) == 1);
        }
    }
    //Peao
    public String comoAndar(String posicaoAtual, String proximaPosicao){
          if (andar(posicaoAtual, proximaPosicao)){
            return (posicaoAtual = proximaPosicao);
    }
        return null;
    }  
    @Override
    public boolean capturar(String posicaoAtual, String proximaPosicao){
        //Captura pela diagonal, esquerda.
        //verifica se é as brancas( parte baixa)
        if(proximaPosicao.charAt(0) > posicaoAtual.charAt(0)){
            
        }
        if(proximaPosicao.charAt(0) < posicaoAtual.charAt(0)){ 
            
        }
        //Captura pela diagonal, a direita.
        return false;
    }    
}   