package project3;

public class StuSample3 {
    public static void main(String[] args) {
        // オブジェクトの生成と値の代入ができている！
        Student3 stu1 = new Student3("菅原");
        Student3 stu2 = new Student3("村山", 75,100);
        Student3 stu3 = new Student3(); // 引数なしのコンストラクタはよびだしされない

        stu1.setScore(90, 80);
        stu1.display();
        stu2.display();
        stu3.display();

    }
}
