/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author aquimby1
 */
public class MessageService {
    private InputStrategy msg;
    private OutputStrategy out;
    
    public MessageService(OutputStrategy out,InputStrategy MSG){
        this.out = out;
        this.msg = MSG;
    }

    public void outputMessage() {
            out.outputMessage(msg.inputMessage());
    }
}
