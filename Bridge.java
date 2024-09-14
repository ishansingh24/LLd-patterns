interface DrawingAPI {
    void drawCircle(double x, double y, double radius);
}
class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("API1.circle at " + x + "," + y + " radius " + radius);
    }
}

class DrawingAPI2 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("API2.circle at " + x + "," + y + " radius " + radius);
    }
}

abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();
    public abstract void resizeByPercentage(double pct);
}

class CircleShape extends Shape {
    private double x, y, radius;

    public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    @Override
    public void resizeByPercentage(double pct) {
        radius *= (1 + pct / 100.0);
    }
}

public class Bridge {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new CircleShape(5, 10, 20, new DrawingAPI1()),
            new CircleShape(15, 20, 30, new DrawingAPI2())
        };

        for (Shape shape : shapes) {
            shape.resizeByPercentage(10);
            shape.draw();
        }
    }
}

