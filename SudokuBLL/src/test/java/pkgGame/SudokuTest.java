package pkgGame;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class SudokuTest 
{
	@Test
	public void getRegion_test1() throws Exception 
	{
		int[][] MySquare = { { 1, 2, 3, 4 }, { 3, 1, 4, 2 }, { 2, 3, 1, 4 }, { 4, 3, 2, 1 } };

		Sudoku Su = new Sudoku(MySquare);
		int [] ExpectedRegion = {2,3,4,3};
		int [] Reg = Su.getRegion(2);
		
		assertTrue(Arrays.equals(ExpectedRegion, Reg));
		System.out.println(Arrays.toString(Reg));
	}
	
	
}
