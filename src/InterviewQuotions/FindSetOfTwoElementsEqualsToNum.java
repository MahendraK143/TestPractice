package InterviewQuotions;

import java.util.Scanner;

public final class FindSetOfTwoElementsEqualsToNum {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String []org){
        new FindSetOfTwoElementsEqualsToNum().name = "9999";
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[]{4,6,1,3,8,7,9};
        System.out.println("Enter some of number from any two elements from the given array");
        int num = scanner.nextInt();
        for(int i=0; i < arr.length ; i++) {
            for(int j=i+1; j < arr.length ; j++) {
                if ((arr[i]+arr[j]) == num){
                    System.out.println("{"+arr[i]+","+arr[j]+"}");
                }
            }
        }
    }

}
