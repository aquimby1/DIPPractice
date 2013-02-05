/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

import java.util.Scanner;

/**
 *
 * @author aquimby1
 */
public class ConsoleInputStrategy implements InputStrategy {
    
    @Override
    public String inputMessage() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type Your Message Here");
        String msg = keyboard.nextLine();
        if(msg==null || msg.length()==0){
            msg="No Input";
        }
        return msg;
    }


}
