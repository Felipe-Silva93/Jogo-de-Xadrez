package Aplicacation;


import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch=new ChessMatch();
		
		while(true) {
			
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Souce: ");
				ChessPosition souce = UI.readChessPosition(sc);
				
				boolean[][]possibleMoves = chessMatch.possibleMoves(souce);
				
				System.out.println();
				System.out.println("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.performChessMove(souce, target);
			}catch (ChessException e) {
				System.out.println(e.getLocalizedMessage());
				sc.nextLine();
			}catch (InputMismatchException e) {
				System.out.println(e.getLocalizedMessage());
				sc.nextLine();
			}
		}
		
	}

}
