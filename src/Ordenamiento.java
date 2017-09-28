import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ordenamiento {
	int [] vec;
	int cantelem;
	
	public Ordenamiento(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		this.cantelem = sc.nextInt();
		vec = new int[this.cantelem];
		
		for(int i=0; i<this.cantelem; i++) {
			vec[i] = sc.nextInt();
		}
		
		sc.close();
	}
	
	public void ordenarBurbuja() {
		int aux;
		
		for(int i=0; i<this.cantelem; i++)
			for (int j=1; j<(this.cantelem - i); j++) {
	            if (this.vec[j - 1] > this.vec[j]) {
	                aux = this.vec[j - 1];
	                this.vec[j - 1] = this.vec[j];
	                this.vec[j] = aux;
	            }
	        }
	}
	
	public void ordenarSeleccion() {
		  int i, j, menor, pos, aux;
		  
          for (i = 0; i < this.cantelem - 1; i++) {
                menor = this.vec[i];
                pos = i;
                
                for (j = i + 1; j < this.cantelem; j++){
                      if (this.vec[j] < menor) {
                          menor = this.vec[j];
                          pos = j;
                      }
                }
                if (pos != i){ // si hay alguno menor se intercambia
                    aux = this.vec[i];
                    this.vec[i] = this.vec[pos];
                    this.vec[pos] = aux;
                }
          }
	}
	
	public void ordenarInsercion() {
		int i, j;
		int aux;
		/* desde el segundo elemento hasta el final, guardamos el elemento y empezamos
		 * a comprobar con el anterior. Mientras queden posiciones y el valor de aux sea
		 * menor que los de la izquierda, se desplaza a la derecha*/
		for (i=1; i<this.cantelem; i++){ // 
			aux = this.vec[i];
			j = i - 1;
			while ((j >= 0) && (aux < this.vec[j])){
				this.vec[j + 1] = this.vec[j];
				j--;
			}
			this.vec[j + 1] = aux; // pongo aux en su lugar
		}
	}
	
	public void ordenarShell() {
		
	}

	public void ordenarQuickSort() {
	
	}

	public void ordenarFusion() {
	
	}
	
	@Override
	public String toString() {
		for(int i = 0; i<this.cantelem; i++)
			System.out.println(this.vec[i]);
		return super.toString();
	}
}
