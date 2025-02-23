package PERSON;

class PersonNPCs {
    private String name;
    private int age;
    private String address;

    public PersonNPCs(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getInfo() {
        return String.format("Name: %-10s Age: %d", name, age);     
        
    }

    public static void main(String[] args) {
        PersonNPCs[] people = {   
                new PersonNPCs("Uno", 18, "1 Spain St."),
                new PersonNPCs("Dos", 19, "2 Spin St"),
                new PersonNPCs("Tres", 20, "3 Sain St"),
                new PersonNPCs("Quatro", 28, "4 Span St"),
                new PersonNPCs("Sinco", 111, "5 Pain St")
        };

        for (PersonNPCs person : people) {  
            System.out.println(person.getInfo());
        }
    }
}
