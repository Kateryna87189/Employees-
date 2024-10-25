/*
1. Создать класс Employee c полями id, name, age, salary.
2. Сделать его Comparable по salary (по зарплате)
3. Создайте массив объектов Employee и отсортируйте его по зарплате
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     Employee[] arrayEmployee ={
       new Employee(1,"Петров В.",25,1750.0),
       new Employee(2,"Лупкин Ж.",34,2250.0),
       new Employee(3,"Смирнова А.",20,1550.0),
       new Employee(4,"Карпачов С.",45,3550.0),
       new Employee(5,"Саркисян Л.",30,1200.0),
       new Employee(6,"Белов О.",38,4000.0),
       new Employee(7,"Никитюк Л.",29,2350.0),
       new Employee(8,"Кобейн К .",34,1400.0)
     };
        System.out.println(Arrays.toString(arrayEmployee));

    }
}