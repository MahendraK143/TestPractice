package InterviewQuotions;

import java.util.Scanner;

public class FindTheMaxDepthParenthesis {
    public static void main(String org[]){
        FindSetOfTwoElementsEqualsToNum n= new FindSetOfTwoElementsEqualsToNum();
        n.setName("aaaaaaa");
        n.setName("adsfsdfasf");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a parenthesis string");
        String str = scanner.next();
        int leftParenthesis=0,rightParenthesis=0,depthMax=0;
        boolean skipDepth=false;
        for (int i=0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c == '(') {
                ++depthMax;
                ++leftParenthesis;
                if(!str.substring(i+1,str.length()).contains("(")){
                    skipDepth = true;
                }
            }
            if(c == ')' && !skipDepth) {
                --depthMax;
                ++rightParenthesis;
            }else if (c == ')' && skipDepth){
                ++rightParenthesis;
            }
        }
        if (rightParenthesis == leftParenthesis) {
            System.out.println("Max Depth Parenthesis:"+depthMax);
        } else {
            System.out.println("Max Depth Parenthesis:"+-1);
        }

    }
}
