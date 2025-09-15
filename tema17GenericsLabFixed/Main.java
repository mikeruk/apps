package tema17GenericsLabFixed;

import tema17GenericsLab.task01JarOfT.Jar;

public class Main {


    public static void main(String[] args) {

        Jar<Integer> integerJar = new Jar<>();
        Jar<String> stringJar = new Jar<>();
        integerJar.add(33);
        integerJar.add(44);
        stringJar.add("dani");
        stringJar.add("Test Passed!");
        System.out.println(integerJar.remove());
        System.out.println(integerJar.remove());
        System.out.println(stringJar.remove());
        System.out.println(stringJar.remove());
    }
}
