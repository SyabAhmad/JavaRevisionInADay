public class Arrays {
    public static void main(String []args) {
        String[] fruits = {"Apple", "Orange", "Pine Apple", "Banana"};
        int[] number = {12, 32, 142, 123, 432};
        for (String i : fruits) {
            System.out.println(i);
        }
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        fruits[2] ="grapes";
        System.out.println(fruits[2]);
        System.out.println("\n");
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        System.out.println(fruits.length);
        System.out.println(number.length);
    }
}
