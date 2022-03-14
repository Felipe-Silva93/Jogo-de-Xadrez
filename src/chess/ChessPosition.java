package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
	
	
	
	
	public ChessPosition(char column, int row) {
		if(column<'a' || column > 'h'|| row < 1 || row >8){//programa��o defenssiva
			throw new ChessException("Erro estanciando chessPosition. valor valido � da a1 at� h8");
		
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
		return ""+ column + row;// o String vazio � um macete para ele concatenar automatico se tirra o "" o compilador n�o vai aceitar, ent�o coloca ele para dizer que � uma contatena��o de string
	}
	
}
