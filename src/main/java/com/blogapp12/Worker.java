package com.blogapp12;

public class Worker {

    private long id;
    private String name;
    private int salary;

    public Worker(long id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}




