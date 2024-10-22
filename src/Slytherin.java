public class Slytherin extends Hogwarts{
    private int tricky;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String firstName, String lastName,int thePowerOfMagic, int toTransgress, int tricky, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(lastName, firstName,thePowerOfMagic,toTransgress);
        this.tricky = tricky;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getTricky() {
        return tricky;
    }

    public void setTricky(int tricky) {
        this.tricky = tricky;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    public String toString() {
        return "Hogwarts Slytherin " +super.toString()+
                "ambition: " + ambition +
                ", determination: " + determination +
                ", tricky:" + tricky+
                ", resourcefulness:" + resourcefulness+
                ", thirstForPower:" + thirstForPower;
    }
    public String compareStudentInFaculty(Slytherin person1, Slytherin person2){
        int sumPerson1 = person1.getAmbition()+person1.getDetermination()+person1.getTricky()+person1.getResourcefulness()+person1.getThirstForPower();
        int sumPerson2 = person2.getAmbition()+person2.getDetermination()+person2.getTricky()+person2.getResourcefulness()+person2.getThirstForPower();
        if (sumPerson1 > sumPerson2) {
            return "The best "+person1.toString();
        }else return "The best "+person2.toString();
    }
}
