package persons;

import java.util.ArrayList;

import pets.Animal;

public class Client extends Person{
    private String address;
    private ArrayList <Animal> pets;
    public Client (long idNo, String name, String address) {
        super(idNo, name);
        this.address=address;
        pets = new ArrayList<Animal>();
    }
    public void addPet (Animal e){
        pets.add(e);
        System.out.println(e.toString()+" added to client's list");
    }
    public void deletePet (Animal e){
        pets.remove(e);
        System.out.println(e.toString()+" remove to client's list");
    }

    @Override
    public void personInfo() {
        System.out.println("This person is client. " + super.toString()+" City: "+address);

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
