/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmatika;

import java.util.Scanner;

/**
 *
 * @author shandy
 */
public class Aritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bilangan1, bilangan2, penjumlahan, pengurangan, perkalian, pembagian, modulus;

        Scanner aritmatika = new Scanner(System.in);

        System.out.println("bilangan 1 =");
        bilangan1 = aritmatika.nextInt();
        System.out.println("bilangan 2 =");
        bilangan2 = aritmatika.nextInt();

        penjumlahan = bilangan1 + bilangan2;
        pengurangan = bilangan1 - bilangan2;
        perkalian = bilangan1 * bilangan2;
        pembagian = bilangan1 / bilangan2;
        modulus = bilangan1 % bilangan2;

        System.out.println("penjumlahan = " + penjumlahan);
        System.out.println("pengurangan = " + pengurangan);
        System.out.println("perkalian = " + perkalian);
        System.out.println("pembagian = " + pembagian);
        System.out.println("moduluss = " + modulus);
    }

}
