package com.mycompany.eva1_6_arreglos2;

/**
 *
 * @author Diego Escarcega // 04/02/25
 */
public class EVA1_6_ARREGLOS2 {

    public static void main(String[] args) {
        int data[] = new int [20];
        System.out.println(data);
        System.out.println(data.length);
        // Llenar arreglo con datos aleatorios.
        for (int i = 0; i < 20; i++) {
            data[i] = (int)(Math.random() * 100); 
       }
        for (int i = 0; i < 20; i++) {
            System.out.print("[" + data[i] + "]");
        }
    }
}
