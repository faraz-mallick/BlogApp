package com.blogapp12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("mike");

        Employee e2 = new Employee();
        e1.setId(2);
        e1.setName("stallin");

        List<Employee> emp = Arrays.asList(e1, e2);
        List<EmployeeDto> empDto = emp.stream().map(e -> mapToDto(e)).collect(Collectors.toList());


    }

   static EmployeeDto mapToDto(Employee e10){
        EmployeeDto dto = new EmployeeDto();
        dto.setId(e10.getId());
        dto.setName(e10.getName());
        return dto;
    }


}
