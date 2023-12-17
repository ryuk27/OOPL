public class Complex {
private double real;
private double imaginary;

public Complex() {
this.real = 0.0;
this.imaginary = 0.0;
}

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
double denominator = (other.real * other.real) + (other.imaginary * other.imaginary);
double newReal = ((this.real * other.real) + (this.imaginary * other.imaginary)) / denominator;
double newImaginary = ((this.imaginary * other.real) - (this.real * other.imaginary)) / denominator;
return new Complex(newReal, newImaginary);
}

public void display() {
System.out.println(this.real + " + " + this.imaginary + "i");
}

public static void main(String[] args) {
Complex complex1 = new Complex(3.0, 4.0);
Complex complex2 = new Complex(1.0, 2.0);

Complex sum = complex1.add(complex2);
Complex difference = complex1.subtract(complex2);
Complex product = complex1.multiply(complex2);Complex quotient = complex1.divide(complex2);

System.out.println("Sum:");
sum.display();

System.out.println("Difference:");
difference.display();

System.out.println("Product:");
product.display();

System.out.println("Quotient:");
quotient.display();
}
}
