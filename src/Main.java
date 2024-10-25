/*
1. Создать класс Employee c полями id, name, age, salary.
2. Сделать его Comparable по salary (по зарплате)
3. Создайте массив объектов Employee и отсортируйте его по зарплате
 */

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     Employee[] arrayEmployee ={
       new Employee(1,"Петров В.",25,new BigDecimal("1750.60")),
       new Employee(2,"Лупкин Ж.",34, new BigDecimal("2250.40")),
       new Employee(3,"Смирнова А.",20,new BigDecimal("1550.50")),
       new Employee(4,"Карпачов С.",45,new BigDecimal("3350.10")),
       new Employee(5,"Саркисян Л.",30,new BigDecimal("1200.30")),
       new Employee(6,"Белов О.",38,new BigDecimal("4000.65")),
       new Employee(7,"Никитюк Л.",29,new BigDecimal("2350.10")),
       new Employee(8,"Кобейн К .",34, new BigDecimal("1400.50"))
     };
      print(arrayEmployee);
        Arrays.sort(arrayEmployee);
        System.out.println("------------сортировка по зарплате------------------");
        print(arrayEmployee);

        /*System.out.println(Arrays.toString(arrayEmployee));
        Arrays.sort(arrayEmployee);
        System.out.println("------------сортировка по зарплате------------------");
        System.out.println(Arrays.toString(arrayEmployee));
*/
        //mij kod

      }
    public static void print(Employee[] employees){
        for (Employee employee:employees){
            System.out.println(employee);
        }
    }

}