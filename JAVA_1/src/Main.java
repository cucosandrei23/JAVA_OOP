//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        Student s = new Student();
        Student s1 = new Student();
        Student s2 = new Student("ionel", 9.5F);
        Student s3 = s2.myClone();
        s3.setName("Gigel");
        System.out.println(s2.getName());

    }
}