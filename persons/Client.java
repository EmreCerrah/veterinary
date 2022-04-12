package persons;
public class Client extends Person{
    String address;

    public Client(long idNo, String name, String address) {
        super(idNo, name);
        this.address= address;
    }

    @Override
    public void personInfo() {
        System.out.println("This person is client. " + super.toString());

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
