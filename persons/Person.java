package persons;

public abstract class Person {
    private long idNo;
    private String name;

    public Person(long idNo, String name) {
        this.idNo = idNo;
        this.name = name;
    }

    public abstract void personInfo();

    public long getIdNo() {
        return idNo;
    }

    public void setIdNo(long idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person idNo: " + idNo + " Name:" + name;
    }

}
