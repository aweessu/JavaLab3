package Task65;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle rc = new ResizableCircle(10);
        System.out.println(rc);

        rc.resize(50); // уменьшить радиус на 50%
        System.out.println("After resize 50%: " + rc);

        rc.resize(200); // увеличить радиус в 2 раза
        System.out.println("After resize 200%: " + rc);

        System.out.println("Area: " + rc.getArea());
        System.out.println("Perimeter: " + rc.getPerimeter());
    }
}

