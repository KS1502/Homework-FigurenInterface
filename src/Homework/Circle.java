package Homework;

public class Circle implements FigureInterface{
    int r;

    @Override
    public double getArea() {
        return 3.14 * r * r ;
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }


  //  @Override
    //public int compareTo(FigureInterface o) {
      //  return 0;
    //}
}

