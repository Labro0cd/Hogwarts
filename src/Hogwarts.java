public class Hogwarts {
    private String firstNameStudents;
    private String lastNameStudents;
    private int thePowerOfMagic;
    private int toTransgress;

    public Hogwarts(String firstNameStudents, String lastNameStudents, int thePowerOfMagic, int toTransgress){
        this.firstNameStudents = firstNameStudents;
        this.lastNameStudents = lastNameStudents;
        this.thePowerOfMagic = thePowerOfMagic;
        this.toTransgress = toTransgress;
    }

    public String getLastNameStudents() {
        return lastNameStudents;
    }

    public String getFirstNameStudents() {
        return firstNameStudents;
    }

    public void setFirstNameStudents(String firstNameStudents) {
        this.firstNameStudents = firstNameStudents;
    }

    public void setLastNameStudents(String lastNameStudents) {
        this.lastNameStudents = lastNameStudents;
    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public int getToTransgress() {
        return toTransgress;
    }

    public void setToTransgress(int toTransgress) {
        this.toTransgress = toTransgress;
    }

    @Override
    public String toString() {
        return "firstName: " + firstNameStudents + '\n'+
                ", lastName: " + lastNameStudents;
    }
    public String compareStudentInHogwarts(Hogwarts person1, Hogwarts person2) {
        int sumPerson1 = person1.getThePowerOfMagic()+person1.getToTransgress();
        int sumPerson2 = person2.getThePowerOfMagic()+person2.getToTransgress();
        if (sumPerson1 > sumPerson2) {
            return "The best "+person1.toString();
        }else return "The best "+person2.toString();
    }
}
