package src._00_practice_loop;

public class While01 {
    public static void main(String[] args) {
        int count = 0;

        count = count +1;
        System.out.println("현재 숫자는:" + count);
        count = count +1;
        System.out.println("현재 숫자는:" + count);
        count = count +1;
        System.out.println("현재 숫자는:" + count);
        count = count +1;
        System.out.println("현재 숫자는:" + count);

        while (count < 10) {
            ++count;
            System.out.println("현재 숫자는:" + count);
        }
    }
}
