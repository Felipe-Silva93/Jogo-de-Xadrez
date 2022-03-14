package boardgame;

public class BoardException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public BoardException(String msg) {//construtor que recebe a msg do RuntimeException
		super(msg);
	}
}
