package Shell;

public interface IStrategy {
	   /**
	    * Realiza a ordena��o
	    */
	   public abstract void sort();
	   /**
	    * Retorna o array com os dados
	    * @return
	    */
	   public int[] getElements();
	   /**
	    * Registra os elementos que ser�o ordenados
	    * @param elements
	    */
       public void setElements(int[] elements);
		
}
