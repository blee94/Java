package src._05_class;

public class Person {
//    필드 (private)

    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

        public static void main(String[]args){
            Person codee = new Person();
            codee.age = 10;
            codee.setName("codee"); // getter,setter 사용을 권장

            System.out.println(codee.age); // 권장 x
            System.out.println((codee.getAge())); // 권장 o

    }
}
