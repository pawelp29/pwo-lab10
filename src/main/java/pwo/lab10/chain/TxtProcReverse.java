/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.chain;

/**
 *
 * @author pawelp
 */
public class TxtProcReverse extends TxtProc {

    public static String ACTION = "REVERSE";

    @Override
    public String processRequest(Request request) {
        if (request.action.toUpperCase().equals(ACTION)) {
            return new StringBuilder(request.text).reverse().toString();
        } else {
            return next(request);
        }
    }
}
