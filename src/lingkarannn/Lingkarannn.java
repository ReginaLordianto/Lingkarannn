/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkarannn;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class Lingkarannn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tgs01-b
        Scanner inpt = new Scanner(System.in);
        double r;
        System.out.println("^^ Menghitung Luas Lingkaran ^^");
        System.out.println("Jari-jari = ");
        r = inpt.nextInt();
       System.out.println("Luas lingkaran = " + 3.14*r*r);
    }
    
}
