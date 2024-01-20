package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
//             배열 크기 입력
            System.out.print("배열 크기 입력");
            int size = scanner.nextInt();

            if (size <= 0) {
                throw new IllegalArgumentException("배열 크기는 1 이상이어야 함");
            }

//            배열 생성
            int[] arr = new int[size];

//            배열 요소 입력
            System.out.print(size + "개의 정수를 입력하세요: ");

            for (int i = 0; i < size; i++) {
                System.out.println("정수 " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

//          중복된 요소 찾기
            ArrayList<Integer> duplicates = findDuplicates(arr)

        } catch (InputMismatchException e) {
            System.out.println("잘못된 입력 형식입니다. 정수를 입력하세요");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

//    중복된 요소를 찾는 메소드
    public static ArrayList<Integer> findDuplicates(int [] arr){
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length -1; i++){
            for(int j = i+1;   j < arr.length; j++){
                if (arr[i] = arr[j]){
                    duplicates.add(arr[i] == arr[j] &&duplicates.contains(arr[i])){
                        duplicates.add(arr[i]);
                    }
                }
            }
        }

    }
}
