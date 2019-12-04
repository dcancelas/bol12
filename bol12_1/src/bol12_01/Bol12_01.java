package bol12_01;

import java.util.Scanner;

public class Bol12_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Garaxe obx = new Garaxe();
            obx.rexistrarCoche();
            while (obx.plazas > 0) {
                System.out.println(
                        "\n¿Desexa rexitrar outro vehículo?"+
                        "\n1. Si"+
                        "\n2. Non");
                int select = sc.nextInt();
                switch (select) {
                    case 1:
                        obx.rexistrarCoche();
                        break;
                    case 2:
                        obx.plazas = 0;
                        break;
                    default:
                        System.out.println("ERROR: O número introducido non é correcto");
                }
            }
            sc.close();
    }
}
