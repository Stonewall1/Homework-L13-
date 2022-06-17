package MyArrayList;

import java.util.Arrays;

public class MyArrayList<T> {
    private int size;
    private Object[] array;
    private int length = 0;

    public MyArrayList(int size) {
        this.size = size;
        this.array = new Object[size];
    }
    public MyArrayList() {
        this.size = 10;
        this.array = new Object[size];
    }

    public void add(T element){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){
                array[i] = element;
                length++;
                return;
            }
        }
        grow();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null){
                array[i] = element;
                length++;
                return;
            }
        }
    }

    private void grow() {
        int newSize = (int) (size*1.5) + 1;
        Object[] newArray = Arrays.copyOf(array , newSize);
        array = newArray;
        size = newSize;
    }

    public void delete(T element){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == element){
                array[i] = null;
                length--;
            }
        }
    }
    public boolean contains(T element){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == element){
               return true;
            }
        }
        return false;
    }
    public T get(int index){
        return (T) array[index];
    }
    public void clearAll(){
        Arrays.fill(array, null);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        System.out.print("MyArrayList {");
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                System.out.print(array[i] + " , ");
            }
        }
        return "}";
    }
}
