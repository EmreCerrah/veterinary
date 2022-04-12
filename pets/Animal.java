package pets;

public abstract class Animal {
    private String name;
    private String birtday;
    private static int no;
    private boolean register;

    public Animal(String name, boolean register, String birtday) {
        this.name = name;
        this.birtday = birtday;
        this.no++;
    }

    public abstract void showInformation();

    @Override
    public String toString() {
        /* if (register) { */
        return "Pet Name:" + name + '\n' +
                "Birtday: " + birtday + '\n' +
                "Is it registered: " + isRegister() + " ID Number=" + no;
        /*
         * }else {
         * return "Pet Name: " + name + '\n' +
         * "Birtday: " + birtday + '\n' +
         * "Is it registered: " + isRegister();
         * }
         */
    }

    public String isRegister() {
        if (register) {
            return "registered";
        } else
            return "not registered";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirtday() {
        return birtday;
    }

    public void setBirtday(String birtday) {
        this.birtday = birtday;
    }

    public int getNo() {
        return no;
    }

    public void doRegister() {
        this.register = true;
    }
}