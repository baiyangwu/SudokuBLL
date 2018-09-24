package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;;

public class Sudoku extends LatinSquare
{
	
	
	private int iSize;
	private int iSqrtSize;
	
	
	public Sudoku(int iSize) throws java.lang.Exception
	{
		this.iSize = iSize;
		if (iSize % Math.sqrt(iSize)==0) 
		{
			iSqrtSize = (int) Math.sqrt(iSize);
		}	
		else {
			throw new Exception("Error");
			}
		}

	
	
	public Sudoku(int[][] puzzle) throws java.lang.Exception
	{
		super(puzzle);
		this.iSize = puzzle.length;
		if (iSize % Math.sqrt(iSize)==0) 
		{
			iSqrtSize = (int) Math.sqrt(iSize);
		}	
		else {
			throw new Exception("Error");
			}
		}
	
	
	
	public int[][] getPuzzle()
	{
		return super.getLatinSquare();
	}
	
	
	
	public int[] getRegion(int iCol, int iRow)
	{
		int a = (iCol/iSqrtSize)+((iRow/iSqrtSize)*iSqrtSize);
		return getRegion(a);
	}	
	
	
	
	public int[] getRegion(int r)
	{
		int [] reg = new int[super.getLatinSquare().length];
		int i = (r%iSqrtSize)*iSqrtSize;
		int j = (r/iSqrtSize)*iSqrtSize;
		int iMax = i + iSqrtSize;
		int jMax = j + iSqrtSize;
		int iCnt = 0;
		
		for (;j<jMax;j++) 
		{
			for (i=(r%iSqrtSize)*iSqrtSize; i<iMax;i++) 
			{
				reg[iCnt = iCnt+1]= super.getLatinSquare()[j][i];
			}
		}	
		return reg;
	}
	
	
	
	public boolean isPartialSudoku()
	{
		if (!super.isLatinSquare()) 
		{
			return false;
		}
		for (int k=0 ; k< this.getPuzzle().length;k++) 
		{
			if (super.hasDuplicates(getRegion(k)))
			{
				return false;
			}
			if (!hasAllValues(getRow(0),getRegion(k))) 
			{
				return false;
			}
		}
		return true;
	}
	
	
	
	public boolean isSudoku()
	{
		if (isPartialSudoku())
		{
			return true;
		}
		return false;
	}

	
	
	public boolean isValidValue(int iCol, int iRow, int iValue)
	{
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
