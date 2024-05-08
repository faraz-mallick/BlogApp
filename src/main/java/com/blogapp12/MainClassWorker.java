package com.blogapp12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClassWorker {
    public static void main(String[] args) {

        List<Worker> data = Arrays.asList(
                new Worker(1, "mike", 5000),
                new Worker(2,"stallin",7000),
                new Worker(3,"adam",5000),
                new Worker(4,"sam",7000),
                new Worker(5,"thyson",3000)
        );


        Map<Integer, List<Worker>> newdata= data.stream().collect(Collectors.groupingBy(e->e.getSalary()));
        System.out.println(newdata);


//       Map<Integer, List<Employee>> newdata= data.stream().collect(Collectors.groupingBy(e->e.getSalary()));
//       for (Map.Entry<Integer, List<Employee>>entry:newdata.entrySet()) {
//           System.out.println(entry.getKey());
//          List<Employee> emp = entry.getValue();
//          for (Employee e:emp) {
//              System.out.println(e.getId());
//              System.out.println(e.getName());
//              System.out.println(e.getSalary());
//          }
       }

}
