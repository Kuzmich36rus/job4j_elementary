package ru.job4j.converter;

public class Converter {
    public static double rubleToEuro(float value) {
        double rsl = value / 70;
        return rsl;
    }

    public static double rubleToDollar(float value) {
        double rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");
    }
}

