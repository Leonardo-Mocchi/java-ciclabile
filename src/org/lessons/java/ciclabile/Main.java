package org.lessons.java.ciclabile;

public class Main {

    public static void main(String[] args) {
        ElencoInteri eBicNumbers = new ElencoInteri(new int[] { 42, 69, 420 });

        System.out.println(eBicNumbers.hasAncoraElementi());
        System.out.println(eBicNumbers.getElementoSuccessivo());
        System.out.println(eBicNumbers.hasAncoraElementi());
        System.out.println(eBicNumbers.getElementoSuccessivo());
        System.out.println(eBicNumbers.hasAncoraElementi());
        System.out.println(eBicNumbers.getElementoSuccessivo());
        System.out.println(eBicNumbers.hasAncoraElementi());

        //! questo genera un errore perché ho solo 3 numeri
        System.out.println(eBicNumbers.getElementoSuccessivo());

        eBicNumbers.addElemento(666);

        System.out.println(eBicNumbers.hasAncoraElementi());
        System.out.println(eBicNumbers.getElementoSuccessivo());
        System.out.println(eBicNumbers.hasAncoraElementi());

    }
}
