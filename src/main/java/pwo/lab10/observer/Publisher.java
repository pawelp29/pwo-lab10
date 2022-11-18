/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pawelp
 */
public class Publisher {

    public interface Subscriber {

        void action(int x);
    }
    List<Subscriber> subscribers = new ArrayList<>();

    public void add(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void remove(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(int x) {
        subscribers.forEach(subscriber -> subscriber.action(x));

    }
}
