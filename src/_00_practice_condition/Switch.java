package src._00_practice_condition;

public class Switch {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;

        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            default:
                coupon = 0;

        }
        System.out.println("coupon = " + coupon);

//        삼항연산자
        int a = 1000;
        int b = 2000;
        String status = (a > b) ? "true" : "false";
        System.out.println("status = " + status);




    }
}
