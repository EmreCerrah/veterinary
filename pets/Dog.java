package pets;
public class Dog extends Animal{
    String breeds;
    String type;

    public Dog(String name, String birtday, String breeds) {
        super(name, birtday);
        this.breeds = breeds;
        this.type = "Dog";
    }


    public void showInformation() {
    System.out.println("Your dog's breeds is "+ breeds);
    System.out.println(super.toString());
}

}
