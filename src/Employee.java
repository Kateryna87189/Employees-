/*
Создать класс Employee c полями id, name, age, salary.
 */
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee(int id, String name, int age, int salary) {
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

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("id работника: %d, Имя: %s, %d года, Зарплата: %d "
                , id,name,age,salary)+System.lineSeparator();

    }


    @Override
    public int compareTo(Employee o) {
        return salary-o.getSalary();
    }
}
