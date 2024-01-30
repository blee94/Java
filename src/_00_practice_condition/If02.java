package src._00_practice_condition;

public class If02 {
    public static void main(String[] args) {
        int age = 21;
        
        if (age <= 7) {
            System.out.println("유치원생");

        } else if (age <= 14) {
            System.out.println("중학생");

        } else if (age <= 20) {
            System.out.println("고등학생");
        }else {
            System.out.println("성인");
        }
    }
}
