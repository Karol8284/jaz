package jaz;

public class Person extends CreatePerson{
    Person(String firstName2,String lastName2,int age2){
        CreatePerson person = new CreatePerson();
        person.setValueToPerson(firstName2,lastName2,age2);
        person.personDataReturn(person);
    }
    public static void main(String[] args) {
        CreatePerson Adam = new CreatePerson();
        System.out.println(Adam.firstName);
        Adam.firstName = "Adam";
        System.out.println(Adam.firstName);

        Adam.lastName = "Kowalski";
        Adam.age = 17;
        System.out.println(Adam.firstName);
        System.out.println(Adam.lastName);
        System.out.println(Adam.age);

        System.out.println("person1 |||");
        CreatePerson person1 = new CreatePerson();
        person1.personDataReturn(person1);
        System.out.println();
        System.out.println("Set data to Person ");
        new Person("Adrian","Nowak",34);
        System.out.println();
    }
}
