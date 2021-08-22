package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{

    private String name;
    private List<T> fruits = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public void putFruit(T fruit, int count) {
        for (int i = 0; i < count; i++) {
            fruits.add(fruit);
        }
        System.out.printf("В коробку %s положено %d %s", name, fruits.size(), fruit.getName());
    }

    public String getName() {
        return name;
    }

    //Сравниваем корробки между собой
    public boolean compareBox(Box box) {
        return this.getWeight() == box.getWeight();
    }


    //Вычисляем вес коробки
    public float getWeight() {
        if (!fruits.isEmpty()) {
            return fruits.get(0).getWeight() * fruits.size();
        }
        return 0;
    }

    //Перекладываем фрукты из одной коробки в другую
    public void shiftBox(Box<T> anotherBox) {
        if (!fruits.isEmpty()) {
            System.out.printf("Перекладываем фрукты из коробки %s в %s", name, anotherBox.getName());
            anotherBox.fruits.addAll(this.fruits);
            this.fruits.clear();
        }
    }

    @Override
    public String toString() {
        if (!fruits.isEmpty()) {
            return "В коробке " + name + " находится " + fruits.size() + " " + fruits.get(0).getName();
        }
        else return " \nКоробка " + name + " пустая";
    }
}
