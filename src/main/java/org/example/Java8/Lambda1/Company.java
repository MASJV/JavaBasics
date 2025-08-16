package org.example.Java8.Lambda1;

import java.util.List;
import java.util.stream.Collectors;

public class Company {
    private List<Project> projects;

    public Company(List<Project> projects) {
        this.projects = projects;
    }

    public List<String> getEmployeenamesFromGivenDeptEarningMoreThanGivenThreshold(String department, double thresholdSalary) {
        return projects.stream()
                .flatMap(p -> p.getEmployees().stream())
                .distinct()
                .filter(e -> e.getDepartment().equals(department))
                .filter(e -> e.getSalary() > thresholdSalary)
                .map(Employee::getName)
                .collect(Collectors.toList());

    }

    public List<String> getEmployeenamesFromEarningMoreThanGivenThreshold(double thresholdSalary) {
        return projects.stream()
                .flatMap(p -> p.getEmployees().stream())
                .distinct() // as same name person can be there
                .filter(e -> e.getSalary() > thresholdSalary)
                .map(Employee::getName)
                .collect(Collectors.toList());
    }
}
