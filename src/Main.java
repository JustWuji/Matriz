/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author luisc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[][] matriz = {
            { 11, 24, 39, 48, 50 },
            { 61, 73, 88, 92, 106 },
            { 111, 127, 132, 145, 154 },
            { 158, 175, 177, 179, 184 },
            { 186, 190, 201, 212, 223 }
        };

        int n = matriz.length;

        System.out.println("Matriz definida:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.printf("%4d ", elemento);
            }
            System.out.println();
        }

        
       
    }
    
}
