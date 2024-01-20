//package _05_class;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//public class Rectangle2 {
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    private int width;
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    private int height;
//
//
//    public Rectangle2(int width, int height) {
//        this.width = width;
//        this.height = height;
//    }
//
//
//    public int area() {
//        return width * height;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Rectangle2> rct = new ArrayList<>();
//        System.out.println("가로 세로 입력");
//        int width = scanner.nextInt();
//        int height = scanner.nextInt();
//
//        Rectangle2 area = new Rectangle2(width, height);
//
//        if (width == 0 && height ==0) {
//            for(Rectangle2 rectangle2 : rct){
//                System.out.println("가로 길이는: " + rectangle2.getWidth());
//                System.out.println("세로 길이는: " + rectangle2.getHeight());
//                System.out.println("넓이는: "+ rectangle2.getWidth() * rectangle2.getHeight());
//            }
//        }
//
//    Rectangle2 rectangle2 = new Rectangle2(width, height);
//        rct.add(rectangle2);
//
//
//    }
//}