package ru.mirea.inbo0519.pr1.ballpack;

public class TestBall {
    public static void main(String[] args)
    {
        Ball ball1 = new Ball(5, "red", "rubber");
        System.out.println(ball1);

        Ball ball2 = new Ball("yellow", "leather");
        ball2.setRadius(15);
        ball2.jump();
        System.out.println(ball2);
    }
}
