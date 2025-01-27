package models;

public class Student extends Person {
    private int grade ;


    public Student (String name , int Age , int grade )
    {
        super (name , Age);
        this.grade = grade ;
    }

    public  void  setgrade (int grade){
        this.grade=grade;

    }



    public int getgrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
}
