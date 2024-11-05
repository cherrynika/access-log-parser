package ru.courses.main;

import ru.courses.geometry.Line;
import ru.courses.geometry.Point;
import ru.courses.geometry.PolyLine;
import ru.courses.geometry.StringWrapper;

public class Main {
    public static void main(String[] args) {
        Line line = new Line(5.0);
        Point[] points = {new Point(0, 0), new Point(3, 4), new Point(7, 1)};
        PolyLine polyLine = new PolyLine(points);
        StringWrapper stringWrapper = new StringWrapper("Hello");

        Measurable[] objects = {line, polyLine, stringWrapper};
        double totalLength = calculateTotalLength(objects);

        System.out.println("Результат: " + totalLength);
    }

    public static double calculateTotalLength(Measurable[] objects) {
        double total = 0;
        for (Measurable obj : objects) {
            total += obj.getLength();
        }
        return total;
    }
}
