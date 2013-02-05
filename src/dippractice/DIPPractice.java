/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author aquimby1
 */
public class DIPPractice {

    /**
     * @param args the command line arguments
     */
    //psvm main method    
    public static void main(String[] args) {
        InputStrategy msg = new GuiInputStrategy();
        OutputStrategy out = new GuiOutputStrategy();
        
        MessageService service = new MessageService(out,msg);
        service.outputMessage();
    }
}
