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
public class MaxFinder implements Subscriber {

    Integer max = null;

    @Override
    public void action(int x) {
        if (max == null || max < x) {
            max = x;
        }
    }

    public int getMax() {
        return max;
    }
}
