package _05_class;

import java.util.Scanner;

public class Rectangle {

    public int width;
    public int height;

    public Rectangle(int width, int height) {
//        지역변수와 필드의 변수명이 동일하기 때문에 this 사용해서 필드값에 접근
        this.width = width;
        this.height = height;
    }
   public int area(){
        return width * height;
   }

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("가로 세로 입력");
        int width = scanner.nextInt();
        int height = scanner.nextInt();

//        입력 받은 값으로 rectangle 객체를 생성

        Rectangle area = new Rectangle(width,height);

        System.out.println("넓이는 "+ area.area() + "입니다");


    }

}
