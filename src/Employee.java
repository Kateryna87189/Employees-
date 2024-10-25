/*
Создать класс Employee c полями id, name, age, salary.
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("id работника: %d, Имя: %s, %d года, Зарплата: %.2f "
                , id,name,age,salary)+System.lineSeparator();

    }
}
