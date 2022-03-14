package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {//contendo s� mente o tabuleiro pois a pec� quando for estanciada n�o vai ocupar nem uma posi��o por tanto tera o valor null
		
		this.board = board;
		position=null;//pode se preferir n�o colocar nada por que por padr�o o java coloca null
	}


	protected Board getBoard() {//est� protegito por que ele � de uso interdo da camada de tabuleiro
		return board;
	}

	public abstract boolean[][] possibleMoves();
		
		public boolean possibleMove(Position position) {
			return possibleMoves()[position.getRow()][position.getColumn()];
	}
		
	public boolean isThereAnyPossibleMove() {
		boolean[][]mat = possibleMoves();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

	
	
}
