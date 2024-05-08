package com.blogapp12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClassWorker {
    public static void main(String[] args) {
//        Consumer<Integer> val = n-> System.out.println(n);
//        val.accept(10);
//
//        Consumer<String> str = n-> System.out.println(n);
//        str.accept("mike");
//
//        Supplier<Double> val1 = ()->Math.random();
//        Double result = val1.get();
//        System.out.println(result);

        List<Worker> data = Arrays.asList(
                new Worker(1, "mike", 2500),
                new Worker(2, "stallin", 6000),
                new Worker(3, "adam", 6000)
        );
//        List<Employee> newData = data.stream().filter(e -> e.getSalary() > 5000).collect(Collectors.toList());
//
//        for (Employee emp:newData){
//            System.out.println(emp.getId());
//            System.out.println(emp.getName());
//            System.out.println(emp.getSalary());

//        List<Integer> newData = data.stream().map(e-> e.getSalary()-500).collect(Collectors.toList());
//        System.out.println(newData);

        List<String> newData = data.stream().map(e-> e.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println(newData);

//        List<String> newData = data.stream().map(Employee::getName).collect(Collectors.toList()); //Method Reference
//        System.out.println(newData);
    }


}
