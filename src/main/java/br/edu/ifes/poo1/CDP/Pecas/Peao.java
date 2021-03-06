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
//O controle verifica se pode podeAndar.
public class Peao extends PecaAbstrata {

    public Peao(Cor cor) {
        super(cor, PecaNome.PEAO);
    }


    @Override
    public boolean podeAndarQuanto(String posicaoAtual, String proximaPosicao ) {
        if ((posicaoAtual.charAt(1) == '2' || posicaoAtual.charAt(1) == '7') && 
           (posicaoAtual.charAt(0) == proximaPosicao.charAt(0))){
            //Sinaliza se ele pode podeAndar a quantidade de casas solicitadas.
            return (Math.abs(proximaPosicao.charAt(1) - posicaoAtual.charAt(1)) <= 2 ); 
        }
        if((posicaoAtual.charAt(1) != '2' || posicaoAtual.charAt(1) != '7') && 
           (posicaoAtual.charAt(0) == proximaPosicao.charAt(0))){
            //Sinaliza q ele soh pode ou nao podeAndar UMA casa.
            return (Math.abs(proximaPosicao.charAt(1) - posicaoAtual.charAt(1)) == '1');
        }
        return false;
    }
    
    @Override
    public boolean podeCapturar(String posicaoAtual, String proximaPosicao){
        //Captura pela diagonal, esquerda.
        //verifica se é as brancas( parte baixa)
        if(proximaPosicao.charAt(0) > posicaoAtual.charAt(0) ){
            
        }
        if(proximaPosicao.charAt(0) < posicaoAtual.charAt(0)){ 
            
        }
        //Captura pela diagonal, a direita.
        return false;
    }    
    
    /*   //Peao ComoAndar incompleto
    public String comoAndar(String posicaoAtual, String proximaPosicao){
        if (podeAndar(posicaoAtual, proximaPosicao)){
        return (posicaoAtual = proximaPosicao);
        }
        return null;
    }  */
}