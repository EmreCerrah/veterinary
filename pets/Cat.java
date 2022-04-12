package pets;
public class Cat extends Animal{
    String breeds;
    String type;

    public Cat(String name, String birtday, String breeds) {
        super(name, birtday);
        this.breeds = breeds;
        this.type = "Cat";
    }


    public void showInformation() {
    System.out.println("Your cat's breeds is "+ breeds);
    System.out.println(super.toString());
}
}
