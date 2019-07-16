public class ReverseSort {
    public static void main(String[] args){
        int[] array = new int[]{10,20,30,40,50,60};
        ReverseSort sorter = new ReverseSort();
        sorter.sort(array);
    }
    public void sort(int[] array){
        int temp;
        int len = array.length;
        for(int i=0;i<len/2;i++){
            temp=array[i];
            array[i]=array[len-i-1];
            array[len-i-1]=temp;
        }
        for(int i:array){
            System.out.println(i);
        }
    }
}
