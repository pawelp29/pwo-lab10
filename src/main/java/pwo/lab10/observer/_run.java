/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.observer;

/**
 *
 * @author pawelp
 */
public class _run {

    public static void main(String[] args) {
        NumberGetter numberGetter = new NumberGetter();
        MaxFinder maxFinder = new MaxFinder();
        SumFinder sumFinder = new SumFinder();
        AvgCalculator avgCalculator = new AvgCalculator();
        
        numberGetter.add(maxFinder);
        numberGetter.add(sumFinder);
        numberGetter.add(avgCalculator);
        numberGetter.getNumbers(3);
        
        System.out.println("Max: " + maxFinder.getMax());
        System.out.println("Sum: " + sumFinder.getSum());
        System.out.println("Avg: " + avgCalculator.getAvg());
    }
}
