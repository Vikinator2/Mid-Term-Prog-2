package DOG;

class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.printf("%-10s | %-15s%n", name, breed);
    }

    public static void main(String[] args) {
        Dog firstDog = new Dog("1) Pipty", "Corgi");
        Dog secondDog = new Dog("2) Ten Ten", "Poodle");

        System.out.println("--ORIGINAL ATTRIBUTES--");
        System.out.printf("%-10s   %-15s%n", "NAME:", "BREED:");
        System.out.println("____________________________");
        firstDog.displayInfo();
        secondDog.displayInfo();

        firstDog.setName("1) Bantay");
        firstDog.setBreed("Alaskan Malamute");

        secondDog.setName("2) Chloe");
        secondDog.setBreed("Miniature Poodle");

        System.out.println("\n--MODIFIED ATTRIBUTES--");
        System.out.printf("%-10s   %-15s%n", "NAME:", "BREED:");
        System.out.println("____________________________");
        firstDog.displayInfo();
        secondDog.displayInfo();
    }
}
