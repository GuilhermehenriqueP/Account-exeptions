package model.exceptions;

public class BusinessExeption extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public BusinessExeption(String msg) {
		super(msg);
	}
}
