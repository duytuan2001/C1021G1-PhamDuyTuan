package ss14_sort_algorithm.exercise;

public class InsertSort {
    //C1

//    public static void sort(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            int currentElement = array[i];
//            System.out.println("Tại vị trí i: " + i + " được lưu giá trị là: " + currentElement);
//            int k = i - 1;
//
//            for (; k >= 0 && array[k] > currentElement; k--) {
//                System.out.println("k là: " + k);
////                System.out.println(temp + "<" + array[j]);
//
//                array[k + 1] = array[k];
//            }
//
//            array[k + 1] = currentElement;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] myArray = {2, 9, 5, 4, 8, 1};
//        System.out.println("Mảng ban đầu là: " + Arrays.toString(myArray));
//        sort(myArray);
//        System.out.println("Insertion sort: " + Arrays.toString(myArray));
//    }

    //C2

//    public static void main(String[] args) {
//        int[] array = {6, 5, 3, 1, 8, 7, 4, 2};
//        System.out.println("Mảng ban đầu là: " + Arrays.toString(array));
//
//        for (int i = 1; i< array.length; i++){
//            //Lưu giá trị tại vị trí i
//            int temp = array[i];
//
//            System.out.println("Tại vị trí i: " + i + " được lưu giá trị là: " + temp);
//
//            int j = i -1;
//
//            //Tìm ra giá trị chính xác để chèn
//            while (j >=0 && temp < array[j]){
//                System.out.println("J là: " + j);
//                System.out.println(temp + "<" + array[j]);
//                //Dịch chuyển vị trí lên phía trước
//                array[j+1] = array[j];
//                j--;
//                System.out.println("Mảng khi được chèn: " + Arrays.toString(array));
//            }
//
//            System.out.println("Chèn vào vị trí: " + (j + 1));
//            //Chèn vị trí i vào vị trí (j)
//            array[j+1] = temp;
//        }
//
//        System.out.println("Sau khi sắp xếp: " + Arrays.toString(array));
//        //5 6 3
//
//        //i = 2, temp = 3
//        //j = i-1 = 1, 3 < 6 => 5 6 6, j--
//        //j = 0, 3 < 5 => 5 5 6
//        //array[0] = temp => 3 5 6
//    }
//
//
//
//
//
//    /**
//     * In ra màng hình
//     * @param array Mảng cần in ra
//     */
//    private static void insertSort(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//    }

}
