package Shell;

//import udescpra.sortalgorithms.IStrategy;

/**
 * Implementa a l�gica que deve ser usada pelas classes que realizam as trocas
 * procura diminuir a redund�ncia no c�digo
 * @author 
 *
 */
abstract class AbstractSortStrategy implements IStrategy {
		/**
		 * Dados que ser�o ordenados
		 */
	    private int[] elements;
	    
	    public AbstractSortStrategy() {
	    	super();
	    }
	    
		public AbstractSortStrategy( int[] elements ) {
			this.elements = elements;
		}
		
	    public abstract void sort();

		public int[] getElements() {
			return elements;
		}

		public void setElements(int[] elements) {
			this.elements = elements;
		}
		
		/**
		 * Troca um elemento pelo outro dentro do array - recebe a posicao dos
		 * elementos que ser�o trocados
		 * @param atual posicao do primeiro elemento dentro do array
		 * @param prox  posicao do elemento seguinte dentro do array
		 */
		public void swap(int atual, int prox) {
			int tmp=this.getElements()[atual];
			this.getElements()[atual] = this.getElements()[prox];
			this.getElements()[prox] = tmp;
		}
		
		public void print() {
			for (int i = 0; i < elements.length; i++) {
				int j = elements[i];
				System.out.println(j);
			}
		}

		public void sort(int[] padrao) {
			// TODO Auto-generated method stub
			
		}

}
