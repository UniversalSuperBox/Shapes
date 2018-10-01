package org.cvtc.shapes;

/**
 *
 * @author Dalton Durst
 * Abstract class describing three-dimensional shapes
 *
 */
public abstract class Shape {

	protected MessageBox messageBox;

	public Shape(MessageBox messageBox) {
		this.messageBox = messageBox;
	}

}
