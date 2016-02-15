public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape s) {
        shape = s;
    }

    public void draw() {
        shape.draw();
    }
}
