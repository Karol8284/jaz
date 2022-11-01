package jaz;

public class CreatePerson {
    String firstName;
    String lastName;
    int age;
    CreatePerson(){
        this.firstName = "firstName";
        this.lastName = "lastName";
        this.age = 0;
    }
    public void setValueToPerson(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void personDataReturn(CreatePerson person){
        System.out.println("Person data return: ");
        System.out.println("firstName: "+person.firstName);
        System.out.println("lastName: "+person.lastName);
        System.out.println("age: "+person.age);
    }

}
