package Week5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TestTriangle {

    @Test
    void isosceles_Triangle() {
        Triangle triangle = new Triangle(5, 5, 8);
        assertTrue(triangle.isIsosceles(), "Triangle with sides 5, 5, 8 should be isosceles");
    }


    @Test
    void equilateral_Triangle() {
        Triangle triangle = new Triangle(6, 6, 6);
        assertTrue(triangle.isEquilateral(), "Triangle with sides 6, 6, 6 should be equilateral");
    }

    @Test
    void scalene_Triangle() {
        Triangle triangle = new Triangle(4, 5, 6);
        assertTrue(triangle.isScalene(), "Triangle with sides 4, 5, 6 should be scalene");
    }

    @Test
    void negative_Side_Lengths() {
        Triangle triangle = new Triangle(-3, -4, -5);
        assertTrue(triangle.isScalene(), "Triangle with sides -3, -4, -5 should be scalene after converting to positive lengths");
    }

}
