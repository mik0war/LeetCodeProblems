package AverageSalaryExcludingTheMinimumAndMaximumSalary;

import java.util.*;


public class Solution {
    public double average(int[] salary) {
        ArrayList<Integer> salaryList = new ArrayList<>(Arrays.stream(salary).boxed().toList());;
        salaryList.remove(Collections.max(salaryList));
        salaryList.remove(Collections.min(salaryList));

        return salaryList.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }

    public double average_v1(int[] salary){
        int max_salary = salary[0];
        int min_salary = salary[0];
        int sum = 0;
        for (int one_salary : salary){
            sum+= one_salary;
            min_salary = (Math.min(min_salary, one_salary));
            max_salary = (Math.max(max_salary, one_salary));
        }

        return ((double) sum - min_salary - max_salary)/(salary.length-2.0);
    }
}
