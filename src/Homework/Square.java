package Homework;

public class Square implements FigureInterface {

    @Override
    public double getArea() {
        return a*a;
    }
    int a;

    public Square(int a){
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }


   // @Override
   // public int compareTo(FigureInterface o) {
    //    return 0;
  // }
}

