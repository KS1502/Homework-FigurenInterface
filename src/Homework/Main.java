package Homework;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        List<FigureInterface> figures = new ArrayList<>();

        FigureInterface figureInterface = (FigureInterface) new Rectangle(3, 3);
        FigureInterface figureInterface1 = (FigureInterface) new Circle(2);
        FigureInterface figureInterface2 = (FigureInterface) new Square(3);
        figures.add(figureInterface);
        figures.add(figureInterface1);
        figures.add(figureInterface2);

        System.out.println("Before sorting \n " + figures);
      /*  Before sorting
 [Rectangle{a=3, b=3}, Circle{r=2}, Square{a=3}] */

        Collections.sort(figures);
        System.out.println(figures);
        System.out.println("After sorting \n  " + figures);
        System.out.println(figures);

        System.out.println("Rectangle  is " + figureInterface.getArea());
        System.out.println("Circle is " + figureInterface1.getArea());
        System.out.println("Square is " + figureInterface2.getArea());

       /* Rectangle  is 9.0
        Circle is 12.56
        Square is 9.0 */

        for (FigureInterface f : figures) {
            System.out.println(f.toString());
            /*
            Rectangle{a=3, b=3}
            Circle{r=2}
            Square{a=3}
            */


            for (FigureInterface s : figures) {
                System.out.println(s.getArea());
                  /*Rectangle{a=3, b=3}
9.0
12.56
9.0
Circle{r=2}
9.0
12.56
9.0
Square{a=3}
9.0
12.56
9.0
*/
            }
        }
    }
}




