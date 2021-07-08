package tictactoe;

public class TictacToeGame {
	
	public static  char[] CreateEmptyBoard ()
    {
        char[] board = new char[10];
        for(int i=0; i < board.length ; i++)
        {
            board[i] = ' ';
        }
         return board;
    }
    
    
    
           static void main(String[] args)
           {
            
               System.out.println("Welcome to tic tac toe game");
               char[] board = CreateEmptyBoard();
        
           }

}

}
