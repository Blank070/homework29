package kz.attractor.java;

import javax.swing.*;
import java.awt.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        cats.sort(Cat::catAge);
        Printer.print(cats);
        cats.sort(Cat::byName);
        Printer.print(cats);
        cats.sort(Cat::Porod);
        Printer.print(cats);
        cats.removeIf(Cat::bto);
        Printer.print(cats);
        //cats.removeIf();


    }


}
