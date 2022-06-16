package MyArrayList;


import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<String>(5);
        System.out.println(list.getSize());
        System.out.println(Arrays.toString(list.getArray()));

        list.add("hello");
        list.add("Nasty");
        list.add("20000");
        list.add("X");
        list.add("X");
        System.out.println(Arrays.toString(list.getArray()));
        list.delete("X");
        System.out.println(list.getSize());
        System.out.println(Arrays.toString(list.getArray()));

        System.out.println(list.contains("fghjk"));
        System.out.println(Arrays.toString(list.getArray()));
        System.out.println(list.get(1));

        list.add("1");
        list.add("2");
        System.out.println(list.getSize());
        System.out.println(Arrays.toString(list.getArray()));
        list.add("gg");
        System.out.println(list.getSize());
        System.out.println(Arrays.toString(list.getArray()));
        list.add("jk");
        list.add("))76");
        System.out.println(list.getSize());
        System.out.println(Arrays.toString(list.getArray()));
        list.add("!!!!");
        System.out.println(list.getSize());
        System.out.println(Arrays.toString(list.getArray()));
        System.out.println(list);
        System.out.println(list.getLength());
        list.delete("gg");
        System.out.println(list.getSize());
        System.out.println(list);
        System.out.println(list.getLength());
        System.out.println(list.get(6));
        list.delete("jk");
        System.out.println(list.getLength());
        System.out.println(list);
    }
}
