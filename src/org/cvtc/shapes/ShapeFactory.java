package org.cvtc.shapes;

/** Factory for creating Shapes. */
public class ShapeFactory {

    private MessageBox messageBox;

    public ShapeFactory(MessageBox messageBox) {
        setMessageBox(messageBox);
    }

    private void setMessageBox(MessageBox messageBox) {
        this.messageBox = messageBox;
    }

    private MessageBox getMessageBox() {
        return this.messageBox;
    }

    /**
     * Make a new shape.
     * Not sure why this is particularly useful since you can't specify the size
     * of the shape...
     * @param type The type of shape to create.
     * @return Shape with Dialog already set.
     * @throws IllegalArgumentException Requested ShapeType not implemented.
     */
    public IShape make(ShapeType type) throws IllegalArgumentException {
        switch (type) {
            case Cuboid: return new Cuboid(1f, 2f, 3f, getMessageBox());
            case Cylinder: return new Cylinder(1f, 2f, getMessageBox());
            case Sphere: return new Sphere(1f, getMessageBox());
            default: throw new IllegalArgumentException("Requested ShapeType not implemented");
        }
    }

}
