public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Garry", "Potter",100,100,50,40,30),
                new Gryffindor("Germiona","Greinger",50,40,80,100,90),
        };
        System.out.println(gryffindors[0].compareStudentInFaculty(gryffindors[0], gryffindors[1]));
        System.out.println(gryffindors[0].compareStudentInHogwarts(gryffindors[0], gryffindors[1]));
    }
}