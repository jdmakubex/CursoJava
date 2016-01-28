// Ejemplo del libro de java

public class Welcome
{
	public static void main (String [] args)
	{
		String[] greeting = new String[3];
		greeting[0] = "Bienvenido al Core de Java";
		greeting[1] = "By Juan de Dios";
		greeting[2] = "en los primeros ejercicios de java";

		for (int i=0; i < greeting.length; i++)
			System.out.println(greeting[i]);
	}
}