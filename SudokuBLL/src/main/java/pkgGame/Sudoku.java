package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;;

public class Sudoku extends LatinSquare{
	
	private int iSize;
	private int iSqrtSize;

	public Sudoku(int iSize) throws java.lang.Exception{
		this.iSize = iSize;
		if (iSize % Math.sqrt(iSize)==0) {
			this.iSize = iSqrtSize;
		}	
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
		if (0 <= iCol && iCol<=2) {
			if (0<= iRow && iRow<=2) {
				return Sudoku[0][0];
			}
		}
		return null;
	}	
	
	
	public int[] getRegion(int r)
	{
		int [] reg = new int[super.getLatinSquare().length];
		
		int i = (r%iSqrtSize)*iSqrtSize;
		int j = (r/iSqrtSize)*iSqrtSize;
		int iMax = i + iSqrtSize;
		int jMax = j + iSqrtSize;
		int iCnt = ;
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
