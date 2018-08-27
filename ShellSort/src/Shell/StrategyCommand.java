package Shell;

//import udescpra.sortalgorithms.IStrategy;

/**
 * Associado a uma a��o de interface ou de neg�cio realiza a ordena��o
 * @author udesc
 *
 */
public class StrategyCommand {
	
	/**
	 * Ordena o array usando o algoritmo definido
	 * @param elements
	 * @param strategy
	 */
    public static void execute(int[] elements, IStrategy strategy) {
    	strategy.setElements(elements);
        strategy.sort();
    }
}