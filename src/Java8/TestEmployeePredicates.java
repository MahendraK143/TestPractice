package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class TestEmployeePredicates {
    public static void main(String[] args)
    {
        Employee1 e1 = new Employee1(1,23,"M","Rick","Beethovan");
        Employee1 e2 = new Employee1(2,13,"F","Martina","Hengis");
        Employee1 e3 = new Employee1(3,43,"M","Ricky","Martin");
        Employee1 e4 = new Employee1(4,26,"M","Jon","Lowman");
        Employee1 e5 = new Employee1(5,19,"F","Cristine","Maria");
        Employee1 e6 = new Employee1(6,15,"M","David","Feezor");
        Employee1 e7 = new Employee1(7,68,"F","Melissa","Roy");
        Employee1 e8 = new Employee1(8,79,"M","Alex","Gussin");
        Employee1 e9 = new Employee1(9,15,"F","Neetu","Singh");
        Employee1 e10 = new Employee1(10,45,"M","Naveen","Jain");

        List<Employee1> Employee1s = new ArrayList<>();
        Employee1s.addAll(Arrays.asList(new Employee1[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
//        Employee1s.sort(Comparator.comparing(e -> e.getFirstName()));

        //OR you can use below
//        Employee1s.sort(Comparator.comparing(Employee1::getFirstName));

        //Let's print the sorted list
//        System.out.println(Employee1s);
        Comparator<Employee1> groupByComparator = Comparator.comparing(Employee1::getFirstName)
            .thenComparing(Employee1::getLastName);
        Employee1s.sort(groupByComparator);

        System.out.println(Employee1s);


        System.out.println( filterEmployee1s(Employee1s, EmployeePredicates.isAdultMale()) );

        System.out.println( filterEmployee1s(Employee1s, EmployeePredicates.isAdultFemale()) );

        System.out.println( filterEmployee1s(Employee1s, EmployeePredicates.isAgeMoreThan(35)) );

        //Employee1s other than above collection of "isAgeMoreThan(35)"
        //can be get using negate()
        System.out.println(filterEmployee1s(Employee1s, EmployeePredicates.isAgeMoreThan(35).negate()));
    }
    public static List<Employee1> filterEmployee1s(List<Employee1> employee1s, Predicate<Employee1> predicate){
        List<Employee1> emps = new ArrayList<>();
        for (Employee1 e:employee1s){
            if(predicate.test(e)){
                emps.add(e);
            }
        }
        return  null;
    }
}
