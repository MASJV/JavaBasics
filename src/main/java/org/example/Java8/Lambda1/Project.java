package org.example.Java8.Lambda1;

import lombok.Data;

import java.util.List;

@Data
public class Project {
    private String projectName;
    private List<Employee> employees;

    public Project(String projectName, List<Employee> employees) {
        this.projectName = projectName;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return projectName + " => " + employees;
    }
}