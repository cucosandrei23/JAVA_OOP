package ro.ase.exercitii;

public class Main {
    public static void main (String[] args) {
        Student student1 = new Student (42, "Decebal", "Popescu");
        /*
            noi dorim sa facem o copie a obiectului student1, numita student2
            apoi sa modificam copia respectiva
        */
        Student student2 = new Student(student1);

        student2.setName("Cezar");
        student2.setSurname("Ghiu");
        
        /*
            trebuie sa afiseze
            Name: Decebal
            Surname: Popescu
            Student ID: 42
        */
        student1.show();

        /*
            trebuie sa afiseze
            Name: Cezar
            Surname: Ghiu
            Student ID: 42
        */
        student2.show();

        Point p1 = new Point(1.0F, 2.4F);
        p1.changeChords(33.3F, 44.3F);
        p1.showChords();

        float[] vect = new float[] {1.0F, 2.3F, 3.4F, 5.0F};
        Polygon poly = new Polygon(vect);

        for(int i = 0; i < vect.length/2; i++){
            poly.points[i].showChords();
        }
    }
}