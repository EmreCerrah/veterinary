package pets;

public class Dog extends Animal {
    String breeds;
    String type;
    int vaccines;

    public Dog(String name, boolean register, String birtday, String breeds) {
        super(name, register, birtday);
        this.breeds = breeds;
        this.type = "Dog";
    }

    public void showInformation() {
        System.out.println("Your dog's breeds is " + breeds);
        System.out.println(super.toString());
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVaccines() {
        return vaccines;
    }

    public void setVaccines(int vaccines) {
        this.vaccines = vaccines;
    }

}
