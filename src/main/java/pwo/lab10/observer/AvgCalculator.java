/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;

/**
 *
 * @author pawelp
 */
public class AvgCalculator implements Subscriber {

    Double avg = null;
    int number = 0;

    @Override
    public void action(int x) {
        number++;
        avg = avg == null ? x : avg + x;
    }

    public Double getAvg() {
        return avg/number;
    }
}
