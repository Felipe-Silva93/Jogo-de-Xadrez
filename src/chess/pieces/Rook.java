package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
		
	}

	@Override
	public String toString() {
		return "R";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p= new Position(0,0);
		//a cima
		p.setValues(position.getRow()-1, position.getColumn());// p.setRow(p.getRow()-1); faz essa posição andar mais uma para cima
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {//enquanto a posição p existir e não tiver uma peça lá
			mat[p.getRow()][p.getColumn()]=true;
			p.setRow(p.getRow()-1);//anda mais uma para cima
			
			//repira enquato estiver casas vazias
		}
		if(getBoard().positionExists(p) &&  isThereOpponentPiece(p)) {//seexiste uma casa e se a casa possui uma peça adverssaria
			mat[p.getRow()][p.getColumn()]=true;
		}
			
		//a esquerda
		p.setValues(position.getRow()-1, position.getColumn()-1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColumn()]=true;
			p.setColumn(p.getColumn()-1);
			
			   //repira enquato estiver casas vazias
				}
				if(getBoard().positionExists(p) &&  isThereOpponentPiece(p)) {//seexiste uma casa e se a casa possui uma peça adverssaria
					mat[p.getRow()][p.getColumn()]=true;
				}
				//a direita
				p.setValues(position.getRow()-1, position.getColumn()+1);
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat[p.getRow()][p.getColumn()]=true;
					p.setColumn(p.getColumn()+1);
					
					//repira enquato estiver casas vazias
				}
				if(getBoard().positionExists(p) &&  isThereOpponentPiece(p)) {//seexiste uma casa e se a casa possui uma peça adverssaria
					mat[p.getRow()][p.getColumn()]=true;
				}
				//a baixo
				p.setValues(position.getRow()-1, position.getColumn());// p.setRow(p.getRow()-1); faz essa posição andar mais uma para cima
				while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {//enquanto a posição p existir e não tiver uma peça lá
					mat[p.getRow()][p.getColumn()]=true;
					p.setRow(p.getRow()-1);//anda mais uma para cima
					
					//repira enquato estiver casas vazias
				}
				if(getBoard().positionExists(p) &&  isThereOpponentPiece(p)) {//seexiste uma casa e se a casa possui uma peça adverssaria
					mat[p.getRow()][p.getColumn()]=true;
				}
			
		
		
				return mat;
	}
		
	
}
	
		

