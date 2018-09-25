package pkgGame;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class SudokuTest 
{
	@Test
	public void getRegion_test1() throws Exception 
	{
		int[][] Mypuzzle = { { 1, 2, 3, 4 }, { 3, 1, 4, 2 }, { 2, 3, 1, 4 }, { 4, 3, 2, 1 } };

		Sudoku Su = new Sudoku(Mypuzzle);
		int [] ExpectedRegion = {2,3,4,3};
		int [] Reg = Su.getRegion(0,2);
		
		assertTrue(Arrays.equals(ExpectedRegion, Reg));
	}
	
	
	@Test
	public void getRegion_test2() throws Exception 
	{
		int[][] Mypuzzle = { { 1, 2, 3, 4 }, { 3, 1, 4, 2 }, { 2, 3, 1, 4 }, { 4, 3, 2, 1 } };

		Sudoku Su = new Sudoku(Mypuzzle);
		int [] ExpectedRegion = {2,3,4,3};
		int [] Reg = Su.getRegion(2);
		
		assertTrue(Arrays.equals(ExpectedRegion, Reg));
	}
	
	
	@Test
	public void isSudoku_Test1() throws Exception {
		
		int[][] Mypuzzle = { {1,2,3,4,5,6,7,8,9},
		{1,2,3,4,5,6,7,8,9},
		{1,2,3,4,5,6,7,8,9},
		{1,2,3,4,5,6,7,8,9},
		{1,2,3,4,5,6,7,8,9},
		{1,2,3,4,5,6,7,8,9},
		{1,2,3,4,5,6,7,8,9},
		{1,2,3,4,5,6,7,8,9},
		{1,2,3,4,5,6,7,8,9}
		};

		Sudoku Su = new Sudoku(Mypuzzle);
		
		assertFalse(Su.isSudoku());
	}
	
	
	
		@Test
		public void isPartialSudoku_Test1() throws Exception {
			
			int[][] Mypuzzle = { {1,2,3,4,5,0,7,8,9},
			{1,2,3,4,5,0,7,8,9},
			{1,2,3,0,5,6,7,8,9},
			{1,2,3,4,5,6,7,8,9},
			{1,2,3,4,5,6,7,8,9},
			{1,2,3,4,5,0,7,8,9},
			{1,2,0,4,5,6,7,8,9},
			{1,2,3,4,5,6,7,8,9},
			{1,2,3,4,5,6,7,8,9}
			};

			Sudoku Su = new Sudoku(Mypuzzle);
			
			assertFalse(Su.isPartialSudoku());
		}
		
		
			@Test
			public void isValueValid_test1() throws Exception {
				
				int[][] Mypuzzle = { {1,2,3,4,5,6,7,8,9},
				{1,2,3,4,5,6,7,8,9},
				{1,2,3,4,5,6,7,8,9},
				{1,2,3,4,5,6,7,8,9},
				{1,2,3,4,5,6,7,8,9},
				{1,2,3,4,5,6,7,8,9},
				{1,2,3,4,5,6,7,8,9},
				{1,2,3,4,5,6,7,8,9},
				{1,2,3,4,5,6,7,8,9}
				};

				Sudoku Su = new Sudoku(Mypuzzle);
				
				assertFalse(Su.isValidValue(0, 0, 1));
			}
	
	
}
