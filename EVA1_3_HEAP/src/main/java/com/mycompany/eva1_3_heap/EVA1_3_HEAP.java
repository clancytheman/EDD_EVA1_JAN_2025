package com.mycompany.eva1_3_heap;

/**
 *
 * @author Diego Escarcega // 31/01/25
 */
public class EVA1_3_HEAP {

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.x);
        // Test test2; // <- Necesito un respaldo de test.x = 100
        // test2 = test; // <- No funciona, se duplica la misma dirección.
        Test test2 = new Test();
        test2.x = test.x;
        System.out.println(test2.x);
        test.x = 200;
        System.out.println(test.x);
        System.out.println(test2.x);
        System.out.println(test);
        System.out.println(test2);
        if (test == test2)
            System.out.println("Same objects.");
        else
            System.out.println("Different objects."); 
   }
    
    public static class Test{
        int x = 100;
    }
}
