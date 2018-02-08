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
public enum ConstantesMatematicas {
    
    C_PI("PI π ::: ≈3.14159265358979323846264338327950288", 0),
    C_PITAGORAS("Pitagoras ::: √2 ≈1.41421356237309504880168872420969807", 1),
    C_NAPIER("Napier ::: e ≈2.71828182845904523536028747135266249", 2),
    C_I("Raiz Quadra de i(-1) ::: -1", 3), 
    C_EULER("Euler γ ::: ≈0.57721566490153286060651209008240243", 4),
    C_OURO("Ouro φ ::: ≈1.61803398874989484820458683436563811", 5),
    C_EMBREE("Embree β* ::: ≈0.70258", 6), 
    C_FEIGENBAUM1("Feigenbaum δ ::: ≈4.66920160910299067185320382046620161", 7),
    C_FEIGENBAUM2("Feigenbaum α ::: ≈2.50290787509589282228390287321821578", 8),
    C_PRIMOSG("Primos gêmeos C2 ::: ≈0.66016181584686957392781211001455577", 9),
    C_MEISSEL("Meissel M1 ::: ≈0.26149721284764278375542683860869585", 10),
    C_BRUN_GM("Brun B2 ::: ≈1.9021605823", 11), 
    C_BRUN_QD("Brun B4 ::: ≈0.8705883800", 12),
    C_BRUJIN("Brujin Λ ::: > –2.7 · 10^−9", 13),
    C_CATALAN("Catalin K ::: ≈0.91596559417721901505460351493238411", 14), 
    C_LANDAU("Landau K ::: ≈0.7642236535 8922066", 15),
    C_VISWANATH("Viswanath ::: K ≈1.13198824", 16), 
    C_LEGENDRE("Legendre B´L ::: ≈1.08366", 17),
    C_RAMANUJAN("Ramanujan μ ::: ≈1.45136 92348 83381 05028 39684 85892 027", 18),
    C_ERDOS("Erdos EB ::: ≈1.606695152415291763", 19),
    C_LIOUVILLE("Liouville L ::: ≈0.1100010000 000000000000010", 20);
    
    private String constante;
    private int indice;
    
    ConstantesMatematicas(String constante, int indice) {
        this.constante = constante;
        this.indice = indice;
    }

    public String getConstante() {
        return constante;
    }
    
    public int getIndice() {
        return indice;
    }
}
