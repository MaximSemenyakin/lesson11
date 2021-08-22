package ru.geekbrains;

/*
1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
2. Написать метод, который преобразует массив в ArrayList;

 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        int[] arr = {4, 5, 45, 34, 4, 3, 32};

        swap(arr, 2, 0);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Задача 2

        String[] arr1 = {"refresh", "manifest", "activity", "xml", "kotlin", "java"};
        int[] arr2 = {4, 5, 45, 34, 32, 13};

        CreateArray createArray = new CreateArray(arr1);
        CreateArray createArray1 = new CreateArray(new Integer[]{4, 4, 45, 32, -1, 23, 22});

        System.out.println(createArray.createArray());
        System.out.println(createArray1.createArray());
    }

    //Метод, который меняет элементы массива местами
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


//Класс для преобразования массива в ArrayList
class CreateArray<T> {
    private T[] tmp;

    public CreateArray(T[] tmp) {
        this.tmp = tmp;
    }

    public List createArray() {
        List<T> array = new ArrayList<>();
        Collections.addAll(array, this.tmp);
        return array;
    }
}