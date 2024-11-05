package ru.courses.geometry;

import ru.courses.main.Measurable;

public class StringWrapper implements Measurable {
    private String str;

    public StringWrapper(String str) {
        this.str = str;
    }

    public double getLength() {
        return (double) str.length();
    }
}
