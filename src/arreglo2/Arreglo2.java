/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo2;

/**
 *
 * @author isi7
 */
public class Arreglo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[3][3];
        matriz[0][0] = 4;
        matriz[0][1] = 3;
        matriz[0][2] = 4;
        matriz[1][0] = 6;
        matriz[1][1] = 8;
        matriz[1][2] = 9;
        matriz[2][0] = 7;
        matriz[2][1] = 2;
        matriz[2][2] = 1;

        /*for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(" " +matriz[i][j]);
            }
            System.out.println();
        }*/
        for (int[] fila : matriz) {
           for(int col : fila){
               System.out.print(" " + col);
           }
            System.out.println("");
        }
    }
}
