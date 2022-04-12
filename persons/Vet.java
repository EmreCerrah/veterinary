package persons;

import java.util.ArrayList;

public class Vet extends Person {
    private String academy;
    private int experience;
    private ArrayList <Client> clients;
    public Vet(long idNo, String name, String academy, int experience) {
        super(idNo, name);
        this.academy = academy;
        this.experience = experience;
        clients= new ArrayList<Client>();
    }
    public void addClient (Client e){
        clients.add(e);
        System.out.println(e.toString()+" added to vet's list");
    }
    public void deleteClient (Client e){
        clients.remove(e);
        System.out.println(e.toString()+" remove to vet's list");
    }
    

    @Override
    public void personInfo() {
        System.out.println("This person is veterinary. " + 
        super.toString()+" Graduated School: "+academy+" Experience: "+experience);

    }
    public String getAcademy() {
        return academy;
    }
    public void setAcademy(String academy) {
        this.academy = academy;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    
}