package project6;

public class StuStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        
        // スーパークラスのメソッド
        stu.setName("kkanomata");
        stu.display();

        // サブクラスのメソッド
        stu.setStuNo(1);
        stu.displayStuNo();
    }
    
}
