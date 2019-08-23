package Java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class TransactionTest {
    public static void main(String arg[]){
//        List<Transaction> transactions = Arrays.asList(new Transaction(1,123,"USD","Credit"),
//                new Transaction(2,222,"INR","Debit"),
//                new Transaction(3,333,"INR","Net"),
//                new Transaction(4,444,"INR","Credit"),
//                new Transaction(5,555,"USD","Debit"));
//        Map<String,List<Transaction>> map = new HashMap<>();
//
//        for (Transaction transaction:transactions) {
//            if(transaction.getPrice()>300) {
//                String curr = transaction.getCurrency();
//                List<Transaction> transactionsForCurrency = map.get(curr);
//                if(transactionsForCurrency == null) {
//                    transactionsForCurrency = new ArrayList<>();
//                    map.put(curr,transactionsForCurrency);
//                }
//                transactionsForCurrency.add(transaction);
//            }
//        }
//        System.out.println(map);
//        map = transactions.stream().filter((Transaction transaction) -> transaction.getPrice()>220)
//                .collect(Collectors.groupingBy(Transaction::getCurrency));
//        System.out.println(map);
//        double value = 1.125879D;
//        double valueRounded = Math.round(value * 100D) / 100D;
//        System.out.println(valueRounded);
        System.out.println(LocalDate.parse("2019-05-20T00:00:00+01:00",DateTimeFormatter.ISO_OFFSET_DATE_TIME));
//        private static final String DATE_PATTERN = "dd-MMM-yyyy”;
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
//        LocalDate.parse("31-May-2019 05.17.48.000", dateTimeFormatter)
    }
}
