package models;

public class Person {
    protected String name ;
    protected int age ;

    public Person ( String name , int age){
        this.name = name ;
         this.age = age ;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String whoami(){
        return "Im a person " ;
    }
}
