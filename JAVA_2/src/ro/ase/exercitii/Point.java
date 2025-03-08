package ro.ase.exercitii;

public class Point {
    float c1;
    float c2;
    public Point(float c1, float c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public Point(){
        float c1 = 0;
        float c2 = 0;
    }

    public void changeChords(float c1, float c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public void showChords(){
        System.out.println("(" + c1 + ", " + c2 + ")");
    }

}
