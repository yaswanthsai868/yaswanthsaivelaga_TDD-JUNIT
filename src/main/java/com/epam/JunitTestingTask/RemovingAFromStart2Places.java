package com.epam.JunitTestingTask;

/**
 * Hello world!
 *
 */
public class RemovingAFromStart2Places 
{
    String removingA(String originalString)
    {
    	String finalString="";
    	for(int index=0;index<originalString.length();index++)
    	{
    		if(checkConditionAAtFirstTwoPositions(originalString.charAt(index),index))
    		{
    			finalString+=originalString.charAt(index);
    		}
    	}
    	return finalString;
    }
    boolean checkConditionAAtFirstTwoPositions(Character stringIndexChar,Integer indexOfChar)
    {
    	return (stringIndexChar!='A')||(stringIndexChar=='A' && indexOfChar>1);
    }
}
