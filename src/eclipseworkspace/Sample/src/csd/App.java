/*----------------------------------------------------------------------------------------------------------------------
	Complex sınıfı
-----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {
	public static void main(String [] args)	
	{		
		Complex z1 = new Complex(3.4, 5.6);
		Complex z2 = new Complex(7.8, -9.5);
		Complex z;
		
		double re = 7.8, im  = -9.5;
		
		z = z1.subtract(z2);
		z.print();
		
		z = z1.subtract(re, im);
		z.print();
		
		z = z1.subtract(3.4);
		z.print();
		
		z = Complex.subtract(3.4, z1);
		z.print();
	}
}

class Complex {
	public double real;
	public double imag;
	
	public static Complex add(double re1, double im1, double re2, double im2)
	{
		return new Complex(re1 + re2, im1 + im2);
	}
	
	public static Complex subtract(double re1, double im1, double re2, double im2)
	{
		return add(re1, im1, -re2, -im2);
	}
	
	public static Complex multiply(double re1, double im1, double re2, double im2)
	{
		//TODO:
		return new Complex();
	}
	
	public Complex()
	{
	}
	
	public Complex(double re)
	{
		real = re;
	}
	
	public Complex(double re, double im)
	{
		real = re;
		imag = im;
	}
	
	public static Complex add(double val, Complex z)
	{
		return add(val, 0, z.real, z.imag);
	}
	
	public Complex add(double re, double im)
	{
		return add(real, imag, re, im);
	}
	
	public Complex add(double val)
	{
		return add(real, imag, val, 0);
	}
	
	public Complex add(Complex other)
	{
		return add(other.real, other.imag);
	}
	
	public static Complex subtract(double val, Complex z)
	{
		return subtract(val, 0, z.real, z.imag);
	}
	
	public Complex subtract(double re, double im)
	{
		return subtract(real, imag, re, im);
	}
	
	public Complex subtract(double val)
	{
		return subtract(real, imag, val, 0);
	}
	
	public Complex subtract(Complex other)
	{
		return subtract(other.real, other.imag);
	}
	
	public static Complex multiply(double val, Complex z)
	{
		return multiply(val, 0, z.real, z.imag);
	}
	
	public Complex multiply(double re, double im)
	{
		return multiply(real, imag, re, im);
	}
	
	public Complex multiply(double val)
	{
		return multiply(real, imag, val, 0);
	}
	
	public Complex multiply(Complex other)
	{
		return multiply(other.real, other.imag);
	}
	
	public Complex getConjugate()
	{
		return new Complex(real, -imag);
	}
	
	public double getLength()
	{
		return Math.sqrt(real * real + imag * imag);
	}
	
	public double getNorm()
	{
		return getLength();
	}
	
	public void print()
	{
		System.out.printf("(%.2f, %.2f)%n", real, imag);
	}	
}