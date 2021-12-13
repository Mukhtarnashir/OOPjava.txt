public class PersonApp {
public static void main(String[] args) {

var person1 = new Person();
person1.name = "Nashir";
person1.address = "Losari";
// person1.country = "TEGAL";//

System.out.println(person1.name);
System.out.println(person1.address);
System.out.println(person1.country);

person1.sayHello ("Mukhtar");

Person person2 = new Person();
person2.name = "Mukhtar";
person2.sayHello("Nashir");


Person person3;
person3 = new Person();

System.out.println(person2);
System.out.println(person3);

    
}
    
}
