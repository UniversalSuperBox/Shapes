package org.cvtc.shapes.test;

import javax.swing.JOptionPane;

import org.cvtc.shapes.MessageBox;

/**
 * Class used during testing to validate objects using the MessageBox
 */
public class MessageBoxSub extends MessageBox {
    public static final long serialVersionUID = 1l;

    public MessageBoxSub() {
        super(null, "");
    }

    public int show(String title) {
        return JOptionPane.OK_OPTION;
    }
}
