package com.mycompany.eva1_5_arreglos;

/**
 *
 * @author Diego Escarcega // 04/02/25
 */
public class EVA1_5_ARREGLOS {

    public static void main(String[] args) {
        int[] data = new int[10];
        //int[] a, b, c; <- Define que las tres variables son arreglos.
        //int a, b[], c; <- Solo "b" es un arreglo
        // Acceso aleatorio (por indices).
        data[0] = 100;
        data[1] = 200;
        // data[10] = 1000; // <- Progama falla "Array Index out of bounds" 
        //                      El limite de este arreglo llega hasta 9, "0 hasta N-1" donde N = 10
        data[9] = 1000;
        // Uso de ciclos para manejar arreglos.
        for (int i = 0; i < 10; i++) { // <- Asignación de datos.
            data[i] = 100;
        }
        for (int i = 0; i < 10; i++) { // <- Lee datos.
            System.out.print("[" + data[i] + "]");
        }
    }
}
