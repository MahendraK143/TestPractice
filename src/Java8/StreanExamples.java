package Java8;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreanExamples {
    public static void main(String s[]){
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        boolean matchedResult = memberNames.stream()
                .anyMatch(s1 -> s1.equals("Amitabh"));

        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .allMatch((s1) -> s1.startsWith("A"));

        System.out.println(matchedResult);

        matchedResult = memberNames.stream()
                .noneMatch((s1) -> s1.startsWith("Addd"));

        System.out.println(matchedResult);

        long totalMatched = memberNames.stream()
                .filter((s1) -> s1.startsWith("A"))
                .count();

        System.out.println(totalMatched);
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        //Here creating a parallel stream
        Stream<Integer> stream = list.parallelStream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        System.out.print(evenNumbersArr);

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee(1, "A", 100),
                new Employee(2, "A", 200),
                new Employee(3, "B", 300),
                new Employee(4, "B", 400),
                new Employee(5, "C", 500),
                new Employee(6, "C", 600)));

/*
        Map<Long, Employee> employeesMap = employeeList.stream()
                .collect( Collectors.toMap(Employee::empid,
                        Function.identity()) );
*/
/*
        Map<Long, List<Employee>> employeesMap = employeeList.stream()
                .collect( Collectors.groupingBy(Employee::getName));

*/
        //System.out.println(Timestamp.valueOf("05-Jun-2019 01:17:41"));
       // DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //LocalDate.parse("2018-06-20T00:00:00-07:00",DateTimeFormatter.ISO_OFFSET_DATE_TIME)



        Timestamp t= Timestamp
                .valueOf(LocalDateTime.parse("2019-06-18T14:17:42.000-07:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME));
        double value =  240.98999999999998;
        //System.out.println(Math.round(value * 100D) / 100D);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");


        //System.out.println( LocalDate.parse("2019-07-11T00:00:00-08:00",DateTimeFormatter.ISO_OFFSET_DATE_TIME));
    //    LocalDate localDate = LocalDateTime.parse("2019-06-18T14:17:42.000-07:00",DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        System.out.println(LocalDate.parse("2019-06-18T14:17:42.000-07:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME));

        //LocalDate s2= LocalDate.parse("2019-06-18T14:17:42.000-07:00",DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        //System.out.println(LocalDate.parse("2018-06-23 00:00:00.000-0700",DateTimeFormatter.ISO_OFFSET_DATE_TIME).toString());


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS XXXX");

        System.out.println((LocalDate.parse("2019-07-14 00:00:00.000 +0200", dateTimeFormatter)));
    }
}
