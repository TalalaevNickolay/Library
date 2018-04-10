package by.htp.library.dao.exception;

public class DAOException extends Exception {
	private static final long serialVersionUID = 4895399225189886058L;

	public DAOException(){
		super();
	}
	
	public DAOException(String msg){
		super(msg);
	}
	
	public DAOException(Exception e){
		super(e);
	}
	
	public DAOException(String msg, Exception e){
		super(msg, e);
	}

}
