public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String lastName,int thePowerOfMagic, int toTransgress, int nobility, int honor, int bravery) {
        super(lastName, firstName,thePowerOfMagic,toTransgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Hogwarts Gryffindor " +super.toString()+
                "nobility: " + nobility +
                ", honor: " + honor +
                ", bravery:" + bravery;
    }

    public String compareStudentInFaculty(Gryffindor person1, Gryffindor person2){
        int sumPerson1 = person1.getBravery()+person1.getHonor()+person1.getNobility();
        int sumPerson2 = person2.getBravery()+person2.getHonor()+person2.getNobility();
        if (sumPerson1 > sumPerson2) {
            return "The best "+person1.toString();
        }else return "The best "+person2.toString();
    }
}
