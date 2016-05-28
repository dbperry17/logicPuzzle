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
public class LogicPuzzle
{
    /*******************************
    *	0: False
    *	1: True
    *	2: Undecided
    *******************************/
    public int getStatus(String type1, String type2)
    {
	
	
	return 0;
    }
    public int[] findIndex(String type)
    {
	int[] index = {0,0};
	for(int i = 0; i < list.length; i++)
	    for(int j = 0; j < list[i].length; j++)
		if(list[i][j].equalsIgnoreCase(type))
		{
		    index[0] = i;
		    index[1] = j;
		    break;
		}
	return index;
    }

    String[] country = {"German", "Swede", "Dane", "Norwegian", "Brit"};
    String[] animal = {"horse", "dog", "cat", "bird", "fish"};
    String[] drink = {"milk", "water", "tea", "coffee", "root beer"};
    String[] cigar = {"Pall Mall", "Blue Masters", "Prince", "Dunhills", "Blends"};
    String[] color = {"Red", "Blue", "Green", "Yellow", "White"};
    String[] num = {"1", "2", "3", "4", "5"};
    String[][] list = {country, animal, drink, cigar, color, num};
}
