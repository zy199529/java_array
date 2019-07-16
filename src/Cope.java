import java.util.Arrays;

public class Cope {
    public static void main(String[] args){
        int a[]=new int[]{45,12,3};
        int newarr[]= Arrays.copyOf(a,5);
        int newarr1[]=Arrays.copyOfRange(a,0,3);
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<newarr1.length;i++){
            System.out.print(newarr1[i]+" ");
        }
        int ia[] = new int[]{1,8,9,4,5};
        Arrays.sort(ia);
        int index = Arrays.binarySearch(ia,4);
        System.out.println("4的索引位置是："+index);
        int index1 = Arrays.binarySearch(ia,0,2,4);
        System.out.println("4的索引位置是："+index);
    }
}
