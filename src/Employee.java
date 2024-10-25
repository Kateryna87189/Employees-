import java.math.BigDecimal;

/*
Создать класс Employee c полями id, name, age, salary.
 */
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private BigDecimal salary;

    public Employee(int id, String name, int age, BigDecimal salary) {
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

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary;
    }

    @Override
    public int compareTo(Employee o) {
        return salary.compareTo(o.getSalary());
    }



/*mij metod
    @Override
    public int compareTo(Employee o) {
        return salary-o.getSalary();
    }*/
}
