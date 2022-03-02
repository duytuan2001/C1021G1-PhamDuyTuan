package ss10_DSA_list.exercise.array_list;

import java.util.Arrays;

public class MyArrayList<E> {


    /**
     * Số lượng phần tử có trong MyArrayList
     */
    private int size = 0;

    /**
     * Sức chứa của MyArrayList
     */
    private int DEFAULT_CAPACITY = 10;

    /**
     * Mảng chứa các phần tử
     */
    Object elments[];

    /**
     * Sức chứa mặc định khi khởi tạo bằng contructor không có tham số
     */
    public MyArrayList() {
        elments = new Object[DEFAULT_CAPACITY];
    }

    /**
     * Phương thức contructor với sức chứa được truyền vào
     * @param capacity
     */
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elments = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity" + capacity);
        }
    }

    /**
     * Phương thức trả về số lượng phần tử
     * @return
     */
    public int size(){
        return this.size;
    }

    /**
     * Phương thức clear ArrayList
     */
    public void clear(){
        size = 0;
        for (int i = 0; i< elments.length; i++){
            elments[i] = null;
        }
    }

    /**
     * Phương thức add 1 phần tử vào MyArrayList
     * @param element
     * @return
     */
    public boolean add(E element){
        if (elments.length == size){
            this.ensureCapatity(5);
        }
        elments[size] = element;
        size++;
        return true;
    }


    public void add(E element,int index) {
        if (index > elments.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elments.length == size) {
            this.ensureCapatity(5);
        }

        if (elments[index] == null) {
            elments[index] = element;
            size++;
        } else {
            for (int i = size +1; i >= index; i--){
                elments[i] = elments[i-1];
            }
            elments[index] = element;
            size++;
        }
    }

    /**
     * Phương thức tăng kích thước của MyArrayList
     * @param minCapacity
     */
    public void ensureCapatity(int minCapacity){
        if (minCapacity >= 0){
            int newSize = this.elments.length + minCapacity;
            elments = Arrays.copyOf(elments, newSize);
        }else {
            throw new IllegalArgumentException("minCapatity: " + minCapacity);
        }
    }

    /**
     * Phương thức lấy 1 element tại vị trí i
     * @param index
     * @return
     */
    public E get(int index){
        return (E) elments[index];
    }

    /**
     * Phương thức lấy index của 1 phần tử
     * @param element
     * @return
     */
    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size; i++){
            if(this.elments[i].equals(element)){
                return i;
            }
        }
        return index;
    }

    /**
     * Phương thức kiểm tra 1 phần tử có trong MyArrraylist hay không
     * @param element
     * @return
     */
    public boolean contains(E element){
        return this.indexOf(element) >= 0;
    }

    /**
     * Phương thức tạo ra 1 bản sao của MyArrayList hiện tại
     * @return
     */
    public MyArrayList<E> clone(){
        MyArrayList<E> v = new MyArrayList<>();
        v.elments = Arrays.copyOf(this.elments,this.size);
        v.size = this.size;
        return v;
    }

    public E remove(int index){
        if(index < 0 || index > elments.length){
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elments[index];
        for (int i = index; i < size -1; i++){
            elments[i] = elments[i+1];
        }
        elments[size -1] = null;
        size--;
        return element;
    }
}

