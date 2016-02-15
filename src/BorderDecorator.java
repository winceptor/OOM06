public class BorderDecorator extends ShapeDecorator {

    private String color;

    public BorderDecorator(Shape s, String c) {
        super(s);
        color = c;
    }

    public void draw() {
        shape.draw();
        System.out.println("The shape has border with color: " + color);
    }
}
