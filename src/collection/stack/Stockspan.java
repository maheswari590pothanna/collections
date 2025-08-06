package collection.stack;

public class Stockspan {
    private static void calculatespan(int[] ar) {
        for(int i=0;i<ar.length;i++){
            int span=1;
            for(int j=i-1;j>=0 && ar[j]<ar[i];j--){
                span++;
            }
            System.out.println(span);
        }
    }
    public static void main(String[] args) {
        int[] ar={23,34,1,7,45,8};
        calculatespan(ar);
    }
}

