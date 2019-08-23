public class ArraySorting {
    public static void main(String []a){
        int n[] = {0,-1,5,34,3,55,123,0};
        for (int i:n) {
            System.out.print(i+"\t");
        }
        System.out.println();
        for(int i=0;i < n.length;i++) {
            for(int j=i;j < n.length;j++) {
                if(n[i]<n[j]){
                    int temp = n[j];
                    n[j] = n[i];
                    n[i]=temp;
                }
            }
        }
        for (int i:n) {
            System.out.print(i+"\t");
        }
        System.out.print(factorial(6));
    }
    public static int factorial(int n){
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
}

