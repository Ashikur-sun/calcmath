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
public enum Meses {
    
    JANEIRO(0) {
        @Override
        public String toString() {
            return " / Janeiro / ";
        }
    }, FEVEREIRO(1) {
        @Override
        public String toString() {
            return " / Fevereiro / ";
        }
    }, MARCO(2) {
        @Override
        public String toString() {
            return " / Março / ";
        }
    }, ABRIL(3) {
        @Override
        public String toString() {
            return " / Abril / ";
        }
    }, MAIO(4) {
        @Override
        public String toString() {
            return " / Maio / ";
        }
    }, JUNHO(5) {
        @Override
        public String toString() {
            return " / Junho / ";
        }
    }, JULHO(6) {
        @Override
        public String toString() {
            return " / Julho / ";
        }
    }, AGOSTO(7) {
        @Override
        public String toString() {
            return " / Agosto / ";
        }
    }, SETEMBRO(8) {
        @Override
        public String toString() {
            return " / Setembro / ";
        }
    }, OUTUBRO(9) {
        @Override
        public String toString() {
            return " / Outubro / ";
        }
    }, NOVEMBRO(10) {
        @Override
        public String toString() {
            return " / Novembro / ";
        }
    }, DEZEMBRO(11) {
        @Override
        public String toString() {
            return " / Dezembro / ";
        }
    };
    
    private int indice;
    
    Meses(int indice) {
        this.indice = indice;
    }
    
    public int getIndice() {
        return indice;
    }
}
