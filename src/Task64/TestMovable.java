package Task64;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(0, 0, 2, 3);
        System.out.println(p1);
        p1.moveUp();
        p1.moveRight();
        System.out.println("After move: " + p1);

        MovableCircle c1 = new MovableCircle(1, 1, 2, 2, 5);
        System.out.println(c1);
        c1.moveLeft();
        c1.moveDown();
        System.out.println("After move: " + c1);
    }
}

