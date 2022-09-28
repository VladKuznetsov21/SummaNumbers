/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summanumbers;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class SummaNumbers {
    int number;
    int sum = 0;
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввдите число: ");
        SummaNumbers person = new SummaNumbers();
        int sum = scanner.nextInt();
        int ed = sum%10;
        int sot = sum /100;
        int pik = sum%100;
        int pik2 = pik/10;
        System.out.println(pik2+sot+ed);
        
    
    }
}

