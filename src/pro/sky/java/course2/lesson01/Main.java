package pro.sky.java.course2.lesson01;

public class Main {
    public static void main(String[] args) {
        Integer [] a = {3,4};
        changeValue(a);
        System.out.println("" + a[0] + " " + a[1]);
    }
    public static void changeValue(Integer[] aa){
        aa[0]=99;
    }
}
