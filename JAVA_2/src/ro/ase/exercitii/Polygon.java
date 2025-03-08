package ro.ase.exercitii;

public class Polygon {
    Point[] points;
    public Polygon(int n){
        points = new Point[n];
    }

    public Polygon(float[] vector){
        if(vector.length % 2 == 0){
            int n = vector.length/2;
            this.points = new Point[n];
            int k = 0;
            for (int i = 0; i < vector.length/2; i++){
                this.points[i] = new Point(vector[k++], vector[k++]);
            }
        }
    }
}
