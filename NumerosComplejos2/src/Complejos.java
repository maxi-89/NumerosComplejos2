import static java.lang.Math.*;


public class Complejos {
	private double real;
	private double imag;
	
	//contructor con parametros clase complejos
	
	public Complejos(double real, double imag) {
		
		this.setReal(real);
		this.setImag(imag);
	}
	
	//contructor vacio clase complejos
	
	public Complejos() {
		this(0,0);
		
		// TODO Auto-generated constructor stub
	}





	

//to string objetos class complejos
 @Override
	public String toString() {
		
		String msj="("+this.getReal() +","+this.getImag()+"x)";
		
		return msj;
	}
	//otro metodo EQUALS
	//@OVERLOAD
	public boolean equals (Complejos x) {
		if(this.getReal()==x.getReal() &&this.getImag()==x.getImag()) {
			return true;
		}else return false;
	}
    //metodo modulo
	public double modulo (Complejos x) {
		
		return Math.sqrt(pow(this.getReal(),2)+pow(this.getImag(),2));
	}
	

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejos other = (Complejos) obj;
		if (Double.doubleToLongBits(this.getImag()) != Double.doubleToLongBits(other.getImag()))
			return false;
		if (Double.doubleToLongBits(this.getReal()) != Double.doubleToLongBits(other.getReal()))
			return false;
		return true;
	}
	//METODO SUMA
	public Complejos suma(Complejos  suma) {
		
		return new Complejos(this.getReal()+suma.getReal(), this.getImag()+suma.getImag());
	}

	//METODO RESTA
	public Complejos resta(Complejos resta) {
		
		return new Complejos(this.getReal()-resta.getReal(),this.getImag()-resta.getImag());
	}

	//METODO MULTIPLICACION de dos numeros complejos
	
	public Complejos multiplicar(Complejos multi) {
		double r1=this.getReal();
		double i1=this.getImag();
		double r2=multi.getReal();
		double i2=multi.getImag();
		
		return new Complejos((r1*r2)+(-(i1*i2)), (r1*i2)+(i1*r2));
	}
	
	//metodo multiplicacion de un complejo por un escalar
	//@overload
	public Complejos Multiplicar(int f) {
		
		return new Complejos(this.getReal()*f,this.getImag()*f);
	}
	
}
