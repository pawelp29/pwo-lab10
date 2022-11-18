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
public class SumFinder implements Subscriber {

    Integer sum = null;

    @Override
    public void action(int x) {
        sum = sum == null ? x : sum + x;
    }

    public int getSum() {
        return sum;
    }
}
