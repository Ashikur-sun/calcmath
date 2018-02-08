/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author thalyson
 */
public interface Operacoes {
    
    public abstract void somatorioArray(boolean controle);
    public abstract void soma();
    public abstract void subtracaoArray(boolean controle);
    public abstract void subt();
    public abstract void multiplicArray(boolean controle);
    public abstract void mult();
    public abstract void dividirArray(boolean controle);
    public abstract void divi();
    public abstract void porcentagem();
    public abstract void raizQuadrada();
    public abstract void potenciacao();
    public abstract void cosseno();
    public abstract void seno();
    public abstract void tangente();
    public abstract void cossenoH();
    public abstract void senoH();
    public abstract void tangenteH();
    public abstract void reciproco();
    public abstract void elevaQuad();
    public abstract void elevaCubo();
    public abstract int fatorial(int num);
    public abstract void logaritmo();
    public abstract void logaritmo10();
    public abstract void expoente();
    public abstract void restoDivisaoPorDois();
    public abstract double convertePositivoOuNegativo(double valor);
    public abstract boolean inteiroOuReal(double valor);
}
