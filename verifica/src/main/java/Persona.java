public class Persona {

    private String firstName;
    private String lastName;
    private int age;

    public Persona(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Persona(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 18;
    }

    public int getAge(){
        return this.age;
    }

}
