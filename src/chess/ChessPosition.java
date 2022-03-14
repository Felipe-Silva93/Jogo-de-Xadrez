package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
	
	
	
	
	public ChessPosition(char column, int row) {
		if(column<'a' || column > 'h'|| row < 1 || row >8){//programação defenssiva
			throw new ChessException("Erro estanciando chessPosition. valor valido é da a1 até h8");
		
		}
		this.column = column;
		this.row = row;
	}
	
	
	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8 - row,column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()),8 - position.getRow());
	}
	@Override
	public String toString() {
		return ""+ column + row;// o String vazio é um macete para ele concatenar automatico se tirra o "" o compilador não vai aceitar, então coloca ele para dizer que é uma contatenação de string
	}
	
}
