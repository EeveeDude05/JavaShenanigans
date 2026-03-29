// Create the above Pet class as shown in the UML Class Diagram. The id is to be the last 4 digits of
// the owner’s phone number. The type attribute of pet can be “Dog” or “Cat”. The toString()
//output should combine the Pet id, name and type, such as 9968 – Emma – Cat.
//Also, create a test program to test every attribute and method. Do not test your class within the
//class by using main(). You must import the class into a test file to test the entire functionality of
//your class. You must use the appropriate setters and getters of the class. Test every function by
//creating and changing at least 5 different Pet’s. 

public class pet {
    private String name;
    private String type;
    private int id;

    public pet(String name, String type, int id) {
        this.name = name;
        this.type = type;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + type;
    }

}
