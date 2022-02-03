package hw1;

import java.util.Arrays;
import java.util.List;

public class SortEmployeesTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mark Zuckerberg", 37);
        Employee e2 = new Employee("Elon Musk", 50);
        Employee e3 = new Employee("Alan Turning", 41);
        Employee e4 = new Employee("Elon Musk", 5);
        Employee e5 = new Employee("Alan Turning", 0);
        List<Employee> lst = Arrays.asList(e1, e2, e3, e4, e5);
        lst.sort(
                (a, b)-> {
                    int sResult = a.getName().compareTo(b.getName());
                    if (sResult != 0) return sResult;
                    return a.getAge() - (b.getAge());});
        System.out.println(lst);
    }
}
