package Ex01_Inheritance;

class Human{
    String name;
    int age;
    void eat(){}
    void sleep(){}
}

class Student extends Human {
    int studentID;
    void goToSchool() {}
}

class Worker extends Human {
    int WorkerID;
    void goToWork() {}
}

public class Inheritance {
    public static void main(String[] args) {
        // Human 객체 생성
        Human h = new Human();
        h.name = "허동석";
        h.age = 27;
        h.eat();
        h.sleep();

        // Student 객체 생성
        Student s = new Student();
        s.name = "이찬우";
        s.age = 27;
        s.studentID = 2017150050; // 상속이외에 추가로 정의한 멤버
        s.eat();
        s.sleep();
        s.goToSchool(); // 추가로 정의한 맴버

        // worker 객체 생성
        Worker w = new Worker();
        w.name = "최재영";
        w.age = 27;
        w.WorkerID = 555555; //추가로 정의한 맴버
        w.eat();
        w.sleep();
        w.goToWork(); // 추가로 정의한 맴버
    }
}
