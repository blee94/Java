package _04_exception;

public class Prac1 {
    public static void main(String[] args) {

        int[] arr = new int[4];

        try {
            for(int i=0; i <= 5; i++) {
                arr[i]= i ;
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 범위를 벗어났습니다");
        }
    }
}
