package clases;

/**
 * Hemos creado una clase sobre un triangulo rectangulo para tener varias funciones como el perimetro la hipotenusa y el area
 */

public class TrianguloRectangulo {
	
	//Cateto a
	public double a;
	//Cateto b
	public double b;
	//Hipotenusa c
	public double c;
	
	
	
	//Constructor por defecto
	/**
	 * Constructor que crea un triagulo por defecto
	 */
	public TrianguloRectangulo() {
        this.a = 1.0;
        this.b = 1.0;
        this.c = hipotenusa();
    }

	
	//Constructor normal
	/**
	 * Constructor para crear un triagulo con los datos que introducimos
	 * @param a
	 * @param b
	 */
	public TrianguloRectangulo (double a, double b) {
        
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Los catetos deben ser mayores que 0.");
        }else {
            this.a = a;
            this.b = b;
            this.c = hipotenusa();
        }

	}
	
	//Metodo para calcular area 
	/**
	 * Metodo para calcular el area de nuestro triangulo
	 * @return Area del triangulo
	 */
	public double area () {
		return (a*b)/2;
		
	}
	
	//Metodo para calcular la Hipotenusa
	
	/**
	 * Metodo para calcular la hipotenusa del triangulo
	 * @return Hipotenusa del triangulo en cm
	 */
	public double hipotenusa () {
        
        return  Math.sqrt((a*a) + (b*b));
        
    }
	
	//Perimetro
	/**
	 * Metodo para calcular el perimetro del triangulo
	 * @return Perimetro del triangulo
	 */
	public double perimetro() {
		return a+b+hipotenusa();
	}
	
	//Getter
	/**
	 * Metodo gett para obtener el dato de a
	 * @return informacion de a
	 */
	public double getA() {
		return this.a;
	}
	
	/**
	 * Metodo para obtener el dato de b
	 * @return informacion de b
	 */
	public double getB() {
		return this.b;
	}
	
	//toString
	 @Override
	    public String toString() {
	        return "TrianguloRectangulo [a=" + a + ", b=" + b + ", c=" + c + "]";
	 }
}
