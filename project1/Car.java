package project1;
class Car {
    // メンバ変数
    int no;
    int speed;

    void setNo(int n){
        no = n;
    }
    void run(int s){
        speed = s;
    }
    void stop(){
        speed = 0;
    }
    void display(){
        System.out.println("No." + no + "の速度は" + speed + "です");
    }
}