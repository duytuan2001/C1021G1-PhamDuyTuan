package ss14_sort_algorithm.exercise;

public class InstallInsertSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void insertSort(int[] list) {
        int pos, x;
        for(int i = 1; i < list.length; i++){ //đoạn list[0] đã sắp xếp
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }

    }

    public static void main(String[] args) {
        insertSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

}
