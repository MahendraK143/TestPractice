package InterviewQuotions;

import java.util.*;

public class MinimumSwaps {
    public static void main(String arg[]) {
        Map<String, Integer> names = new HashMap<String, Integer>();
        names.put("Anne", 10);
        names.put("John", 35);
        names.put("Bob", 2);
        Set<Map.Entry<String, Integer>> set11 = names.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set11);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> order1, Map.Entry<String, Integer> order2)
            {
                return (order2.getValue()).compareTo( order1.getValue() );
            }
        });
        for(Map.Entry<String, Integer> entry:list){
            System.out.print(" "+entry.getKey());
        }


        Scanner scanner = new Scanner(System.in);
        int noTestCases = scanner.nextInt();
        int rows = 0;
        int cols = 0;
        int centerOfRow = 0;
        int centerOfCol = 0;
        int arr[][] = null;
        int minimumSwaps = 0;
        int largestElement = 0;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < noTestCases; i++) {
            rows = scanner.nextInt();
            cols = scanner.nextInt();
            centerOfRow = rows/2;
            centerOfCol = cols/2;
            arr = new int[rows][cols];
            for (int j = 0 ; j < rows ; j++) {
                for (int k = 0 ; k < cols ; k++) {
                    arr[j][k] = scanner.nextInt();
                }
            }
            for (int j = 0 ; j < rows ; j++) {
                for (int k = 0 ; k < cols ; k++) {
                    if(largestElement < arr[j][k]){
                        largestElement = arr[j][k];
                    }
                }
            }
            for (int j = 0 ; j < rows ; j++) {
                for (int k = 0 ; k < cols ; k++) {
                    if(largestElement == arr[j][k]){
                        map.put(j+""+k,arr[j][k]);
                    }
                }
            }

            Set<String> set = map.keySet();
            String rowCols[] = null;
            if (set.size() == rows+cols) {
                System.out.println(0);
            } else {
                for (String s: set) {
                    rowCols = s.split("");
                    int tempMinSwaps = 0;
                    if ( ((Integer.parseInt(rowCols[0]) <= centerOfRow))) {
                        tempMinSwaps+=(centerOfRow-Integer.parseInt(rowCols[0]));
                    } else {
                        tempMinSwaps+=(Integer.parseInt(rowCols[0])-centerOfRow);
                    }
                    if ( ((Integer.parseInt(rowCols[1]) <= centerOfCol))) {
                        tempMinSwaps+=(centerOfCol-Integer.parseInt(rowCols[1]));
                    } else {
                        tempMinSwaps+=(Integer.parseInt(rowCols[1])-centerOfCol);
                    }


                    if(minimumSwaps == 0) {
                        minimumSwaps = tempMinSwaps;
                    } else if(minimumSwaps > tempMinSwaps) {
                        minimumSwaps = tempMinSwaps;
                    }
                }
                System.out.println(minimumSwaps);
            }
        }
    }
}
