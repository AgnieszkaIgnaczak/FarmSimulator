public class Person {
    private String firstName;
    private String lastName;

    Person(String name){
        this.firstName = name.split(" ")[0]; //extract 1st element, before space
        this.lastName = name.split(" ")[1]; //extract 2nd element, after space
    }
}


