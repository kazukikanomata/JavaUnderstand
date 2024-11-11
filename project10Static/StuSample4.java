package project10Static;

import project4.Student4;
import project6.Student;

class StuSample4 {
    public static void main(String[] args) {
        Student4 stu1 = new Student4("菅原");
        Student4.display(); // 菅原さんをインスタンス化しました

        Student4 stu2 = new Student4("村山");
        Student4.display(); // 村山さんをインスタンス化しました
    }    
}
