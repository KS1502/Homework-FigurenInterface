package Homework;

public class Rectangle implements FigureInterface{
    int a;
    int b;


    public Rectangle(int a,int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }


  //  @Override
    //public int compareTo(FigureInterface o) {
      //  return 0;
    //}
}

