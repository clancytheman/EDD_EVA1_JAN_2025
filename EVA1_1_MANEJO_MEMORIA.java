package com.mycompany.eva1_1_manejo_memoria;

/**
 *
 * @author Diego Escarcega // 29/01/25
 */
public class EVA1_1_MANEJO_MEMORIA {

    public static void main(String[] args) {
        // STATIC -> Manejo estatico de la memoria.
        // STACK -> "LIFO" Last in, first out.
        System.out.println("MAIN STARTS.");
        A();
        System.out.println("MAIN ENDS.");
    }
    public static void A(){
        System.out.println("A STARTS.");
        B();
        System.out.println("A ENDS.");
    }
    public static void B(){
        System.out.println("B STARTS.");
        System.out.println("B ENDS.");
    }
}
