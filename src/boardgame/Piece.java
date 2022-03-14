package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {//contendo só mente o tabuleiro pois a pecã quando for estanciada não vai ocupar nem uma posição por tanto tera o valor null
		
		this.board = board;
		position=null;//pode se preferir não colocar nada por que por padrão o java coloca null
	}


	protected Board getBoard() {//está protegito por que ele é de uso interdo da camada de tabuleiro
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
