public class Solution {

    public static void main(String[] args) {

        int list[]= {5 ,6, 1, 3, 2, 10, 15,4, 13,15,19,29};

        printArr(list);
        insertionSort(list);
        printArr(list);


    }
    public static int[] insertionSort(int[] list){
        for(int i = 1; i < list.length; i++){
            int valueToSort = list[i];
            int key = i;
            while(key > 0 && list[key -1] > valueToSort){
                list[key] = list[key -1];
                key--;
            }
            list[key] = valueToSort;
        }
        return list;
    }
    public static void printArr(int[] list){
        System.out.print("[");
        for (int i = 0; i < list.length-1;i++){
            System.out.print(list[i] + ", ");
        }
        System.out.println(list[list.length-1] + "]");
    }
}
