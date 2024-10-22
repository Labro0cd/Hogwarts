public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String firstName, String lastName,int thePowerOfMagic, int toTransgress, int smart, int wise, int witty, int fullOfCreativity) {
        super(lastName, firstName,thePowerOfMagic,toTransgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }
    public String toString() {
        return "Hogwarts Ravenclaw " +super.toString()+
                "smart: " + smart +
                ", wise: " + wise +
                ", witty:" + witty+
                ", fullOfCreativity:" + fullOfCreativity;
    }
    public String compareStudentInFaculty(Ravenclaw person1, Ravenclaw person2){
        int sumPerson1 = person1.getSmart()+person1.getWise()+person1.getWitty()+person1.getFullOfCreativity();
        int sumPerson2 = person2.getSmart()+person2.getWise()+person2.getWitty()+person2.getFullOfCreativity();
        if (sumPerson1 > sumPerson2) {
            return "The best "+person1.toString();
        }else return "The best "+person2.toString();
    }
}
