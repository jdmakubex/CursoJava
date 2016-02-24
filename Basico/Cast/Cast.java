/*cast es una operacion en java que:

-Da como resultado una variable con tipo de datos diferente a su fuente.

Puede usarse entre tipos de datos primitivos, instancias de una clase y tipos de objetos primitivos


Es ejecutar una operacion para que se cambie el tipo de dato*/

public class Cast{

	public static void main(String[] args){
		System.out.println("Ejemplo de  un Cast");

		double d=10;
		System.out.println(d); //Esto imprime 10.0 y ya no es compatible con int
		int i = (int)d; //Así casteamos
		System.out.println(i);
		d=10.999;
		i = (int)d; //Así casteamos
		System.out.println(i);
	}

}