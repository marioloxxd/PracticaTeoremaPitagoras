package app;
import clases.TrianguloRectangulo;
public class Principal {

	public static void main(String[] args) {
		 
        
		/**
		 * Creamos un triangulo de lados definidos
		 */
        TrianguloRectangulo t1 = new TrianguloRectangulo(2, 7);

         
        /**
         * Creamos un triangulo con valores por defecto
         */
        TrianguloRectangulo t2 = new TrianguloRectangulo();
       
        /**
         * Calculamos area del primer triangulo 
         */
        double area1 = t1.area();
        /**
         * Calculamos perimetro del primer triangulo
         */
        double perimetro1 = t1.perimetro();
        
      
        /**
         * Calculamos el area del segundo triangulo
         */
        double area2 = t2.area();
        /**
         * Calculamos perimetro del segundo triangulo
         */
        double perimetro2 = t2.perimetro();

		

	}

}
