package org.lessons.java.ciclabile;

public class ElencoInteri {

    private int[] elenco;
    private int currentIndex = 0;

    ElencoInteri(int[] array) {
        this.elenco = array;
    };

    ElencoInteri() {
    };

    public String getElementoSuccessivo() {
        if (elenco.length == 0 || currentIndex >= elenco.length) {
            return "\nFINE ELENCO, per continuare:\n1- avvia una nuova sessione\n2- aggiungi numerio tramite .addElemento()\n";
        }
        int value = elenco[currentIndex];
        currentIndex++;
        return Integer.toString(value);
    }

    public boolean hasAncoraElementi() {
        if ((elenco.length - currentIndex) > 0) {
            return true;
        }
        return false;
    }

    public void addElemento(int elemento) {
        int[] nuovoElenco = new int[elenco.length + 1];

        for (int i = 0; i < elenco.length; i++) {
            nuovoElenco[i] = elenco[i];
        }
        nuovoElenco[nuovoElenco.length - 1] = elemento;

        elenco = nuovoElenco;
    }

}
