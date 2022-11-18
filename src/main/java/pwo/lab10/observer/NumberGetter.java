/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.observer;

import java.util.Scanner;

/**
 *
 * @author pawelp
 */
public class NumberGetter extends Publisher {

    Scanner scanner = new Scanner(System.in);

    public void getNumbers(int N) {
        int x;
        do {
            System.out.print("Wprowadź liczbę: ");
            try {
                x = scanner.nextInt();
            } catch (Exception ex) {
                scanner.nextLine();
                continue;
            }
            notifySubscribers(x);
            N--;
        } while (N > 0);
        scanner.close();
    }
}
