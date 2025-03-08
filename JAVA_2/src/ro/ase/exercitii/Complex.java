package ro.ase.exercitii;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(){
        this(0,0);
    }

    public Complex(Complex complex){
        this.real = complex.real;
        this.imaginary = complex.imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex(Complex complex){
        this.real += complex.real;
        this.imaginary += complex.imaginary;
    }

    public void showNumber() {
        if (imaginary > 0) {
            System.out.println(real + " + " + imaginary + "i");
        }
        if (imaginary < 0) {
            System.out.println(real + " - " + imaginary + "i");
        }
        if (imaginary == 0) {
            System.out.println(real);
        }
    }
}
