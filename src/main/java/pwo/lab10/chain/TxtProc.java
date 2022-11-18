/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.chain;

/**
 *
 * @author pawelp
 */
public abstract class TxtProc implements Request.RequestHandler {

    protected TxtProc next = null;

    public void add(TxtProc txtProc) {
        if (next == null) {
            next = txtProc;
        } else {
            next.add(txtProc);
        }
    }

    protected String next(Request request) {
        if (next != null) {
            return next.processRequest(request);
        } else {
            return null;
        }
    }
}
