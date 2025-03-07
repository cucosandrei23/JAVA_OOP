package ro.ase.exercitii.lab1;

public class JobMarket {
    public static void main(String[] args) {
        Student s1 = new Student("Gigel", 2.0);
        Student s2 = new Student("Marcel", 7.0);
        Student s3 = new Student("Ionel", 7.01);

        Student[] vecStud = {s1, s2, s3};

        Internship i1 = new Internship("Facebook", 2.0, vecStud);
        Internship i2 = new Internship("Google", 7.02, vecStud);
        Internship i3 = new Internship("Amazon", 7.0, vecStud);
        Internship i4 = new Internship("Microsoft", 10.0, vecStud);

        i1.chooseCandidatesForInterview();
        i2.chooseCandidatesForInterview();
        i3.chooseCandidatesForInterview();
        i4.chooseCandidatesForInterview();


    }
}
