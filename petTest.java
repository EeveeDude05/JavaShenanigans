// this is the test file for the pet class. It will import the pet class and test all of its functionality by creating and changing at least 5 different pets.
// Create the above Pet class as shown in the UML Class Diagram. The id is to be the last 4 digits of
// the owner’s phone number. The type attribute of pet can be “Dog” or “Cat”. The toString()
//output should combine the Pet id, name and type, such as 9968 – Emma – Cat.
//Also, create a test program to test every attribute and method. Do not test your class within the
//class by using main(). You must import the class into a test file to test the entire functionality of
//your class. You must use the appropriate setters and getters of the class. Test every function by
//creating and changing at least 5 different Pet’s. 

public class petTest {
    public static void main(String[] args) {
        pet pet1 = new pet("Emma", "Cat", 9968);
        pet pet2 = new pet("Max", "Dog", 1234);
        pet pet3 = new pet("Bella", "Cat", 5678);
        pet pet4 = new pet("Charlie", "Dog", 4321);
        pet pet5 = new pet("Lucy", "Cat", 8765);

        System.out.println(pet1.toString());
        System.out.println(pet2.toString());
        System.out.println(pet3.toString());
        System.out.println(pet4.toString());
        System.out.println(pet5.toString());

        // Changing the name of pet1
        pet1.setName("Emily");
        System.out.println(pet1.toString());

        // Changing the type of pet2
        pet2.setType("Cat");
        System.out.println(pet2.toString());

        // Changing the id of pet3
        pet3.setId(4321);
        System.out.println(pet3.toString());

        // Changing the name and type of pet4
        pet4.setName("Charlie Brown");
        pet4.setType("Cat");
        System.out.println(pet4.toString());

        // Changing the name, type and id of pet5
        pet5.setName("Lucy Liu");
        pet5.setType("Dog");
        pet5.setId(1234);
        System.out.println(pet5.toString());
    }
}
