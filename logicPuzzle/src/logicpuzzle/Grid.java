/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicpuzzle;

/**
 *
 * @author Denise
 */
public class Grid
{
    int[][] switches = new int[5][5];
    String[] typeA = new String[5];
    String[] typeB = new String[5];
    
    public Grid(String[] type1, String[] type2)
    {	
	for(int i = 1; i < switches.length; i++)
	    for(int j = 1; j < switches[i].length; j++)
		switches[i][j] = 2;
	
	for(int i = 0; i < 1; i++)
	{
	    typeA[i] = type1[i];
	    typeB[i] = type2[i];
	}
    }

    public String print(int gridAmt)
    {
	String output = "\t";
	for(int i = 0; i < typeA.length; i++)
	    output += typeA[i] + "\t";
	
	output += "|\n";
	
	for(int i = 0; i < typeB.length; i++)
	{
//	    output += 
	}
	
	
	
	return output;
    }
    
    
    
    public void setGridItem(String type1, String type2)
    {
	
    }
    
}
