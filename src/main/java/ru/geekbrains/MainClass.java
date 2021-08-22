package ru.geekbrains;

/*
Задача:
1.  Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;

2.  Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

3.  Для хранения фруктов внутри коробки можно использовать ArrayList;

4.  Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

5.  Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
    которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;

6.  Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про
    сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов
    не остается, а в другую перекидываются объекты, которые были в первой;

7.  Не забываем про метод добавления фрукта в коробку.

 */

public class MainClass {

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>("Box #1 for apple");
        Box<Orange> orangeBox = new Box<>("Box #1 for orange");
        Box<Orange> orangeBox1 = new Box<>("Box #2 for orange");

        Apple apple = new Apple();
        Orange orange = new Orange();

        appleBox.putFruit(apple, 4);
        System.out.printf(" \nВес коробки %s равен %.1f\n", appleBox.getName(), appleBox.getWeight());
        orangeBox.putFruit(orange, 3);
        System.out.printf(" \nВес коробки %s равен %.1f\n", orangeBox.getName(), orangeBox.getWeight());
        orangeBox1.putFruit(orange, 1);
        System.out.printf(" \nВес коробки %s равен %.1f\n", appleBox.getName(), orangeBox1.getWeight());

        System.out.printf("\nСравним коробки %s и  %s - %s\n", appleBox.getName(), orangeBox.getName(), appleBox.compareBox(orangeBox));

        System.out.println();

        orangeBox.shiftBox(orangeBox1);
        System.out.println(orangeBox);
        System.out.println(orangeBox1);


    }

}
