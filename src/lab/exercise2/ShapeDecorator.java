package lab.exercise2;

/**
 *
 * @author mjmersenski
 */
public abstract class ShapeDecorator implements Shape {

    private Shape shapeToBeDecorated;

    public ShapeDecorator(Shape shapeToBeDecorated) {
        this.shapeToBeDecorated = shapeToBeDecorated;
    }

    @Override
    public void draw() {
        shapeToBeDecorated.draw();
    }

}
