package Homework;

public class FigureComparable implements Comparable<FigureInterface> {
    protected double getArea() {
        return 0;
    }



    @Override
    public int compareTo(FigureInterface o) {
        return Integer.compare((int) getArea(), (int) o.getArea());
    }
}
