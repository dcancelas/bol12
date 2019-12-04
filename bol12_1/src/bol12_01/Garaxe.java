package bol12_01;

import java.util.Scanner;

class Garaxe {

    private int numeroCoches = 0;
    int plazas = 5;
    private String matricula;
    private int tempo;
    private float precio;
    private float cartosRecibidos;
    private float cartosDevoltos;
    private Scanner sc = new Scanner(System.in);

    void rexistrarCoche() {
        if(plazas == 0) System.out.println("COMPLETO");
        else {
            System.out.println("PLAZAS DISPOÑIBLES: "+ plazas);
            System.out.print("Introduzca a matrícula: ");
                matricula = sc.next();
            numeroCoches++;
            plazas--;
            retirarCoche();
        }
    }
    private void retirarCoche() {
        System.out.print("\n¿Cantas horas leva aparcado? ");
            tempo = sc.nextInt();
        precio = (float) (tempo * 0.20);
        System.out.println("Importe a pagar: "+precio);
        System.out.print("Introduza os cartos: ");
            cartosRecibidos = sc.nextFloat();
        if((cartosRecibidos-precio) < 0) System.out.println("\nCantidade insuficiente");
        else {
            cartosDevoltos = (cartosRecibidos-precio);
            System.out.println("Pago realizado correctamente");
            factura();
        }
    }
    private void factura() {
        System.out.println(
                "\n------------FACTURA------------"+
                "\nMATRÍCULA COCHE: "+matricula+
                "\nTEMPO: "+tempo+" horas"+
                "\nPRECIO: "+precio+" €"+
                "\nCARTOS RECIBIDOS: "+cartosRecibidos+" €"+
                "\nCARTOS DEVOLTOS: "+cartosDevoltos+" €"+
                "\n-------------------------------"+
                "\nGRACIAS POR USAR O NOSO APARCADOIRO");
    }
}
