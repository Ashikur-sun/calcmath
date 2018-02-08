/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeradores;

/**
 *
 * @author thalyson
 */
public enum Simbolos {
    
    SOMAR("+"),
    SUBTRAIR("-"),
    MULTIPLICAR("*"),
    DIVIDIR("/"),
    PORCENTAGEM("%"), 
    RAIZ_QUADRADA("sqrt"),
    POTENCIA("^"),
    SENO("sen"),
    COSSENO("cos"),
    B_ZERO("0"), 
    B_UM("1"),
    B_DOIS("2"),
    B_TRES("3"),
    B_QUATRO("4"),
    B_CINCO("5"),
    B_SEIS("6"), 
    B_SETE("7"),
    B_OITO("8"), 
    B_NOVE("9"),
    PONTO("."),
    NULO(""),
    RECIPROCO("reciproco"),
    LIMPAR_CE("CE"),
    LIMPAR_C("C"),
    BACKSPACE("bs"),
    TANGENTE("tan"),
    TANGENTE_H("tanh"),
    COSSENO_H("cosh"),
    SENO_H("senh"),
    ELEVA_QUAD("sqr"),
    ELEVA_CUB("cub"),
    FATORIAL("fat"),
    RESTO_DIVISAO_POR2("mod"),
    CONST_PI(String.format("%f", Math.PI)),
    LOGARITMO("log"),
    LOGARITMO_10("log10"),
    EXPOENTE("exp");
       
    private final String simbolo;
    
    Simbolos(String simbolo) {
       this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
