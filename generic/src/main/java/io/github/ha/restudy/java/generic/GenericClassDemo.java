package io.github.ha.restudy.java.generic;

public class GenericClassDemo {
    public static void main(String[] args) {
        GenericClass<String, Integer> map = new GenericClass<>();

        System.out.println(map.put("One", 1));
        System.out.println(map.get("One"));

        System.out.println(map.genericMethod(new Double(1.0)).getClass());
    }
}
