package org.example.Java8.Lambda1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Jack", "Engineer", 10000);
        Employee e2 = new Employee(2, "Henry", "Doctor", 20000);
        Employee e3 = new Employee(3, "Peter", "Engineer", 30000);
        Employee e4 = new Employee(4, "J", "Scientist", 15000);
        Employee e5 = new Employee(5, "H", "Doctor", 25000);
        Employee e6 = new Employee(6, "K", "Scientist", 35000);

        Project p1 = new Project("Car", List.of(e1, e2));
        Project p2 = new Project("Rocket", List.of(e1, e4, e6));
        Project p3 = new Project("Robot", List.of(e1, e3, e6));
        Project p4 = new Project("Robotic Surgery", List.of(e2, e3, e5));

        Company c1 = new Company(List.of(p1, p2, p3, p4));
        System.out.println(
                c1.getEmployeenamesFromGivenDeptEarningMoreThanGivenThreshold("Engineer", 15000));
        System.out.println(
                c1.getEmployeenamesFromEarningMoreThanGivenThreshold(15000)
        );
    }
}
