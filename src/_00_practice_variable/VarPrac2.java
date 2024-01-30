package src._00_practice_variable;

public class VarPrac2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        int sum = num1 + num2;

        System.out.println("num1:" + num1 );
        System.out.println("num2:" + num2 );
        System.out.println("num1 + num2: " + sum);

        System.out.println("sum = " + sum);
//        soutv: 현재 선택된 변수의 값을 바로 출력해서 보여준다.
        ++num1;
        System.out.println(num1);
//        증가 연산자
        --num1;
        System.out.println(num1);
//        감소 연산자

//        *** ctrl + shift + enter: 괄호안에서 사용시 문장의 끝으로 가 semi-colon 까지 찍어줌. ***

    }
}
