package pkgGame;

import pkgHelper.LatinSquare;

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
		int a = ((iRow/iSqrtSize)*iSqrtSize+(iCol/iSqrtSize));
		return getRegion(a);
	}	
	
	
	
	public int[] getRegion(int r)
	{
		int Counter = 0;
		int [] region = new int[super.getLatinSquare().length];
		int i = (r%iSqrtSize)*iSqrtSize;
		int j = (r/iSqrtSize)*iSqrtSize;
		int iMax = i + iSqrtSize;
		int jMax = j + iSqrtSize;

		for (;j<jMax;j++) 
		{
			for (i=(iSqrtSize*(r%iSqrtSize));i<iMax;i++) 
			{
				region[Counter++]= super.getLatinSquare()[j][i];
			}
		}	
		return region;
	}
	
	
	
	public boolean isSudoku()
	{
		for (int i=0 ; i< this.getPuzzle().length;i++) 
		{
			if (super.hasDuplicates(getRegion(i)))
			{
				return false;
			}
			if (!hasAllValues(getRow(0),getRegion(i))) 
			{
				return false;
			}
		}
		if (!super.isLatinSquare()) 
		{
			return false;
		}

		return true;
	}
	
	
	
	public boolean isPartialSudoku()
	{
		if (isSudoku())
		{
			if (super.ContainsZero()) 
			{
				return true;
			}
		}
		return false;
	}

	
	
	public boolean isValueValid(int iCol, int iRow, int iValue)
	{
		for (int a = 0; a < iSize; a++) 
		{
			for (int b = 0; b < iSize; b++) 
			{
				if (iValue==iRow||iValue==iCol) 
				{
					return false;
				}
			}	
		}
		return true;
	}
	
	
	
}
