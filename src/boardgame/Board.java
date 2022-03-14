package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece [][] pieces;
	
	
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException(" erro: é necessario que aja pelo menos uma linha e uma coluna");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];//a matriz de peças vai ser estanciada na quantidade de linhas e clunas informadas
		
	}

	
	

	public int getRows() {
		return rows;
	}


	


	public int getColumns() {
		return columns;
	}


	


	public Piece piece(int row,int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("posição não existe");
		}
		
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		
		if(!positionExists(position)) {
			throw new BoardException("position  não existe");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece,Position position) {
		if(thereIsAPiece(position)) {
			
			throw new BoardException("já tem uma peca ná posição "+position);
	
		}
		pieces[position.getRow()][position.getColumn()]=piece;
		piece.position=position;
	}
	
	public Piece removePiece(Position position) {
		if(!positionExists(position)) {//programação defenciva gerando uma exeption
			throw new BoardException("essa possição não está no tabuleiro ");
		}
		if(piece(position)==null) {//se a peca nessa possição for iqual a nulu
			return null;
		}
		Piece aux = piece(position);
		aux.position =null;// quer dizer que a peça foi retirada do tabuleiro
		pieces[position.getRow()][position.getColumn()] = null;
		
		return aux;
	}
	
	private boolean positionExists(int row,int column) {
		return row>=0 && row < rows && column >=0 &&column < columns;//ver se a posição existe
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(),position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {//antes de testar esse metodo ele testa primeiro se a pocisão existe
		if(!positionExists(position)) {
			throw new BoardException("position  não existe");
		}
		return piece(position) !=null;
	}
	
}
