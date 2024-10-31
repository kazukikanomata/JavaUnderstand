package project4;

public class StuSample4 {
    public static void main(String[] args) {
        Student4 stu1 = new Student4("菅原");
        // 変更前：stu1.display();
        // 変更後
        Student4.display();

        Student4 stu2 = new Student4("村山");
        // 変更前：stu2.display();
        // 変更後
        Student4.display();
    }
}
