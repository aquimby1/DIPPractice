/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author aquimby1
 */
public class GuiInputStrategy implements InputStrategy {
    
    @Override
    public String inputMessage() {
       String msg = JOptionPane.showInputDialog ( "Put Your Message Here" );
       if(msg==null || msg.length()==0){
            msg="No Input Entered";
        }
       return msg;
    }
}
