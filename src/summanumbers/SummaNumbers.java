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
    int count = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввдите число: ");
        SummaNumbers person = new SummaNumbers();
        int sum = scanner.nextInt();
        int i = 100;
        while (sum > i) {
            i = i + 1;
            if (i % 13 == 0) {
                person.sum2();
            }
        }
        System.out.println(person.sum2());
    }

    public int sum2() {
        return count++;
    }
}

