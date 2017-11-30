package lab.exercise2;

/**
 *
 * @author mjmersenski
 */
public class RedShapeDecorator extends ShapeDecorator {
    
    public RedShapeDecorator(Shape shapeToBeDecorated) {
        super(shapeToBeDecorated);
    }
    
    @Override
    public void draw() {
        System.out.println("Border Color: Red");;
    }
    
}
