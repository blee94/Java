package _04_exception;

public class Prac1 {
    public static void main(String[] args) {

        int[] intArray = new int[4];

        try {
            for(int i=0; i <= 5; i++) {
                intArray[i]= i +1;
                System.out.println(i);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 범위를 벗어났습니다");
        }
    }
}
