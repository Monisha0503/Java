class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(newReal, newImaginary);
    }

    public Complex divide(Complex other) {
        // (a+bi)/(c+di) = [(a+bi)(c−di)] / (c² + d²)
        double denominator = (other.real * other.real) + (other.imaginary * other.imaginary);
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(newReal, newImaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0)
            return real + " + " + imaginary + "i";
        else
            return real + " - " + (-imaginary) + "i";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Complex))
            return false;
        Complex other = (Complex) obj;
        return (this.real == other.real) && (this.imaginary == other.imaginary);
    }
}

public class ComplexNumber {
    public static void main(String[] args) {
        System.out.println("Monisha/2024503043");

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, -2);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);
        Complex quotient = c1.divide(c2);
        boolean isEqual = c1.equals(c2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("c1 equals c2: " + isEqual);
    }
}