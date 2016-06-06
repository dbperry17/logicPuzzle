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
    /***********************************\
    *	Red:		False		*
    *	Green:		True		*
    *	Yellow:		Possibly true	*
    *	Default:	Undecided	*
    \***********************************/
    
    /*******************************************\
    * HINTS:					*
    *********************************************
    * Brit		Red			*
    * Swede		Dog			*
    * Dane		Tea			*
    * Green		Left of white		*
    * Green		Coffee			*
    * Pall Mall		Bird			*
    * Yellow		Dunhill			*
    * House 3		Milk			*
    * Norwegian		House 1			*
    * Blends		Next to cat owner	*
    * Horse		Next to Dunhill		*
    * Blue Master	Root beer		*
    * German		Prince			*
    * Norwegian		Next to blue walls	*
    * Blends		Next to water		*
    \*******************************************/
    
    
    String[] country = {"German", "Swede", "Dane", "Norwegian", "Brit"};
    String[] animal = {"horse", "dog", "cat", "bird", "fish"};
    String[] drink = {"milk", "water", "tea", "coffee", "root beer"};
    String[] cigar = {"Pall Mall", "Blue Masters", "Prince", "Dunhills", "Blends"};
    String[] color = {"Red", "Blue", "Green", "Yellow", "White"};
    String[] num = {"1", "2", "3", "4", "5"};
    String[][] list = {country, animal, drink, cigar, color, num};
    private int status = DEFAULT;
    
    public int getStatus(String type1, String type2)
    {
	
	
	return 0;
    }
    
    public void setStatus(String type1, String type2, int clicks)
    {
	if(clicks == -1)
	    
	    
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
}
