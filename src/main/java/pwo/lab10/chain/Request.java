/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.chain;

/**
 *
 * @author pawelp
 */
public class Request {

    public interface RequestHandler {

        String processRequest(Request request);
    }
    public final String text;
    public final String action;

    public Request(String text, String action) {
        this.text = text;
        this.action = action;
    }
}
