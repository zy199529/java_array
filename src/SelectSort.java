public class SelectSort {
    public static void main(String[] args){
        int[] array = new int[]{63,4,24,1,3,15};
        SelectSort sorter = new SelectSort();
        sorter.sort(array);
    }
    public void sort(int[] array){
        int index;
        for(int i=1;i<=array.length;i++){
            index =0;
            for(int j=1;j<=array.length-i;j++) {
                if (array[j] > array[index]) {
                    index = j;
                }
            }
            int temp;
            temp = array[array.length - i];
            array[array.length - i] = array[index];
            array[index] = temp;
        }
        for(int i:array){
            System.out.println(i);
        }
    }
}
