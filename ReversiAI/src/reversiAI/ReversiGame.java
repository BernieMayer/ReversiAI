package reversiAI;

public class ReversiGame 
{
	public enum PlayerTokens
	{
		EMPTY((byte) 0), BLACK((byte) 1), WHITE((byte) 2);
		
		private byte value;
		
		private PlayerTokens(byte value)
		{
			this.value = value;
		}
		
	}
	
	byte[][] gameBoard = new byte[8][8];
	boolean isGameOver;
	ReversiGame()
	{
		gameBoard[3][3] = PlayerTokens.BLACK.value;
		gameBoard[4][3] = PlayerTokens.WHITE.value;
		gameBoard[3][4] = PlayerTokens.WHITE.value;
		gameBoard[4][4] = PlayerTokens.BLACK.value;
		
		
	}
	
	public byte[][] getGameBoard()
	{
		return gameBoard;	
	}
	
	private boolean checkMove(int x, int y, byte player)
	{
		return false;
		
	}
	
	public boolean tryBlackMove(int x, int y)
	{
		return false;
		
	}
	
	public boolean tryWhiteMove(int x, int y)
	{
		return false;
	}
	
	private void flipPieces(int x, int y, byte playerMove)
	{
		
	}
	
	public boolean isGameOver()
	{
		return false;
	}
	
	public byte[][] generateAllValidWhiteMoves()
	{
		return new byte[1][2];
	}
	
	public byte[][] generateAllValidBlackMoves()
	{
		return new byte[1][2];
	}

}
