package Java.c.exception;

public class FinallySample {
    public static void main(String[] args) {
        FinallySample sample = new FinallySample();
        sample.finallySampleMethod();
    }

    public void finallySampleMethod() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[4]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(intArray.length);
        } finally {
            System.out.println("Here is finally");
        }
        System.out.println("This code must run");
    }
}
