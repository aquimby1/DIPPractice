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
public class GuiOutputStrategy implements OutputStrategy {
    @Override
    public void outputMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
