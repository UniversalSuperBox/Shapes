package org.cvtc.shapes;

import java.awt.Dialog;

import javax.swing.JOptionPane;

/** A dialog box with a title, can be shown with a message. */
public class MessageBox extends Dialog {
    public static final long serialVersionUID = 1l;

    private Dialog owner;

    /** Create a MessageBox with an owner (can be null) and title
     * @param owner MessageBox parent dialog
     * @param title Title of message boxes shown from this instance
     */
    public MessageBox(Dialog owner, String title) {
        super(owner, title);
        this.owner = owner;
    }

    /** Shows a message box with string message
     *
     * @param message Message to place in message box
     * @return JOptionPane.OK_OPTION, always
     */
    public int show(String message) {
        JOptionPane.showMessageDialog(owner, message);
        return JOptionPane.OK_OPTION;
    }
}
