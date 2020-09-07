package ru.mirea.inbo0519.pr1.ballpack;

public class Ball {
    private int radius;
    private String color;
    private String material;

    public Ball(int radius, String color, String material) {
        this.radius = radius;
        this.color = color;
        this.material = material;
    }

    public Ball(String color, String material) {
        this.color = color;
        this.material = material;
        this.radius = 0;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString()
    {
        return "The ball: radius = " + radius + "   color: " + color + "   material = " + material;
    }

    public void jump()
    {
        System.out.println("The ball jumped");
    }
}
