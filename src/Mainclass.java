public class Mainclass {

    public static void main(String[] args) {
        System.out.println("Creating shapes...");
        Shape s1 = new Circle();
        Shape s2 = new BorderDecorator(new Rectangle(), "blue");
        Shape s3 = new BorderDecorator(new Line(), "green");
        System.out.println();
        
        System.out.println("Drawing shapes...");
        s1.draw();
        System.out.println();
        s2.draw();
        System.out.println();
        s3.draw();
    }
}
