import java.io.FileNotFoundException;

import org.junit.Test;

public class Tests {
	
	private String path= "C:/Users/Juli/workspace/Ordenamiento/entrada.in";

	@Test
	public void testOrdenarBurbuja() throws FileNotFoundException {
		Ordenamiento vector = new Ordenamiento(path);
		vector.ordenarBurbuja();
		//vector.toString();
	}
	
	@Test
	public void testOrdenarSeleccion() throws FileNotFoundException {
		Ordenamiento vector = new Ordenamiento(path);
		vector.ordenarSeleccion();
		//vector.toString();
	}
	
	@Test
	public void testOrdenarInsercion() throws FileNotFoundException {
		Ordenamiento vector = new Ordenamiento(path);
		vector.ordenarSeleccion();
		vector.toString();
	}

}
