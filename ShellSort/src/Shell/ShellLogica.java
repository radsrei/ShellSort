package Shell;


public class ShellLogica extends AbstractSortStrategy{

	@Override
	public void sort(int[] elementos) {
		// TODO Auto-generated method stub
	    int h = 1;
	    //int[] elementos = this.getElements();
        int tamanho = elementos.length;
		    
	    while(h < tamanho) {
	            h = h * 3 + 1;
	    }
		    
	    h = h / 3;
	    int aux, j;
	    
	    while (h > 0) {
	        for (int i = h; i < tamanho; i++) {
	            aux = elementos[i];
	            j = i;
	            while (j >= h && elementos[j - h] > aux) {
	                elementos[j] = elementos[j - h];
                j = j - h;
	            }
	            elementos[j] = aux;
	        }
	        h = h / 2;
		}
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
}