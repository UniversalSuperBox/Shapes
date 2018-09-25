package org.cvtc.shapes;

/** Class which can show a message box using a render() method */
public interface IRenderer {

    /** Shows a message box with details about the object it is called on
     * @return result of rendering, normally JOptionPane.OK_OPTION
     */
    public int render();

}
