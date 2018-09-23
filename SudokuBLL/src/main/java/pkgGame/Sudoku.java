package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;;

public class Sudoku extends LatinSquare{

	public Sudoku(int iSize) throws java.lang.Exception{
		super();
	}
	
	public Sudoku(int[][] puzzle) throws java.lang.Exception{
		super(puzzle);
	}
	
	public int[][] getPuzzle()
	{
		return super.getLatinSquare();
	}
	
	public int[] getRegion(int iCol, int iRow)
	{
		return null;
	}	
	public int[] getRegion(int r)
	{
		return null;
	}
	
	public boolean isPartialSudoku()
	{
		return false;
	}
	public boolean isSudoku()
	{
		return false;
	}

	
	public boolean isValidValue(int iCol, int iRow, int iValue)
	{
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
