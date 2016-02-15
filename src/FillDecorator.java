public class FillDecorator extends ShapeDecorator {

    private String color;

    public FillDecorator(Shape s, String c) {
        super(s);
        color = c;
    }

    public void draw() {
        shape.draw();
        System.out.println("The shape is filled with color: " + color);
    }
}
