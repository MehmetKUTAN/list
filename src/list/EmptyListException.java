package list;
public class EmptyListException extends RuntimeException {
	public EmptyListException(String ListName) {
		super(ListName+" \n Listesi bo�tur");	
	}
	
}
