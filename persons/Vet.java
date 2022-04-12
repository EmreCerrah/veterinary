package persons;
public class Vet extends Person {
    String academy;
    int experience;
    public Vet(long idNo, String name, String academy, int experience) {
        super(idNo, name);
        this.academy = academy;
        this.experience = experience;
    }
    @Override
    public void personInfo() {
        System.out.println("This person is veterinary. " + 
        super.toString());

    }
        
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