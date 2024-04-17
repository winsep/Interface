package advance.dev;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
    	Shape[] shapes = new Shape[10];
    	input(shapes);
    	print(shapes);
    }
    	public static void input(Shape[]shapes) {
    		 shapes[0] = new Circle(2);
    	        shapes[1] = new Circle(2);
    	        shapes[2] = new Circle(8);
    	        shapes[6] = new Triangle(2, 0, 2);
    	        shapes[7] = new Triangle(2, 0, 0);
    	        shapes[8] = new Triangle(5, 12, 13);
    	        shapes[9] = new Triangle(8, 22, 17);	
    	}
    	public static void print(Shape[]shapes) {
    		for(Shape shape : shapes) {
    			if(shape != null) {
    				System.out.println("chu vi: "+shape.chuvi());
    				System.out.println("diện tích: "+shape.dientich());
    				System.out.println();
    			}
    		}
    	}
    
}
