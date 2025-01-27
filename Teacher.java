package models;

public class Teacher extends Person {
    private int salary ;

    public Teacher() {
    }

    public Teacher (String name , int Age , int salary )
    {
        super (name,Age);
        this.salary = salary ;
    }

    public  void  setsalary (int salary){
        this.salary=salary;

    }

    public int getsalary() {
        return salary;
    }
    public String whoami() {
        return  "Im a teacher" ;
    }



}
