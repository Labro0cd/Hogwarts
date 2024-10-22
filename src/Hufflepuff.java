public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int right;
    private int honest;

    public Hufflepuff(String firstName, String lastName,int thePowerOfMagic, int toTransgress, int hardworking, int right, int honest) {
        super(lastName,firstName,thePowerOfMagic,toTransgress);
        this.hardworking = hardworking;
        this.right = right;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    public String toString() {
        return "Hogwarts Hufflepuff " +super.toString()+
                "hardworking: " + hardworking +
                ", right: " + right +
                ", honest:" + honest;
    }
    public String compareStudentInFaculty(Hufflepuff person1, Hufflepuff person2){
        int sumPerson1 = person1.getHardworking()+person1.getHonest()+person1.getRight();
        int sumPerson2 = person2.getHardworking()+person2.getHonest()+person2.getRight();
        if (sumPerson1 > sumPerson2) {
            return "The best "+person1.toString();
        }else return "The best "+person2.toString();
    }
}
