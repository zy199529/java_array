import java.util.Arrays;
public class demo1 {
    public static void main(String[] args){
        int[] arr1=new int[]{1,2,3,4,5,6};
        int[] arr2=Arrays.copyOfRange(arr1,0,3);
        for(int x:arr1){
            System.out.println(x);
        }
        for(int x:arr2){
            System.out.println(x);
        }
    }
}
