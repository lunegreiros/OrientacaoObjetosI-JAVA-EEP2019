/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrocarMensagens;

import java.util.EventObject;

/**
 *
 * @author GC
 */
public class MessageEvent extends EventObject{
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public MessageEvent(Object source){
        super(source);
    }
}
