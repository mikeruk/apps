package tema14DefiningClassesExerc.task01OpinionPoll;

public class Person {


    private String name;
    private int age;

    public Person(String passName, int passAge){
        this.name = passName;
        this.age = passAge;
    }


    public String getName(){
        return name;
    }
    public void setName(String passName){
        this.name = passName;
    }

    public int getAge(){
        return  age;
    }
    public void setAge(int passAge){
        this.age = passAge;
    }



}
