package ru.courses.geometry;

import ru.courses.main.Measurable;

public class Line implements Measurable {
    private double length;

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
}
