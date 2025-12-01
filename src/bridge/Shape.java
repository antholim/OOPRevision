package bridge;

import decorator.Beverage;

import java.util.List;

public abstract class Shape {
    protected String name;
    protected Color color;
    public Shape(String name, Color color) {
        this.name = name;
        this.color = color;
    }
}
