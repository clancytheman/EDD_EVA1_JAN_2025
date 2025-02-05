package com.mycompany.eva1_7_arreglote;

/**
 *
 * @author Diego Escarcega // 05/02/25
 */
public class EVA1_7_ARREGLOTE {

    public static void main(String[] args) {
        int data[] = new int [10000000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 100); 
       }
    }
}
