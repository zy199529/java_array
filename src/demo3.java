import java.util.Arrays;
public class demo3 {
    public static void main(String[] args){
        String arr[] ={"aa","cc","dd","ff","gg"};
        Arrays.fill(arr,2,3,"bb");
        for(String x:arr){
            System.out.println(x);
        }

    }
}
