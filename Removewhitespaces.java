/*
 Q1. Write a java program to remove the space in the given string?
	Input: Ravindra babu ravula
	Output: Ravindrababuravula
 */
package removewhitespaces;

public class Removewhitespaces {

   
    public static void main(String[] args)
    {
        String str = "Ravindra babu ravula";
 
       
 
        String strWithoutSpace = str.replaceAll("\\s", "");
 
        System.out.println(strWithoutSpace);        
        
 
        char[] strArray = str.toCharArray();
 
        StringBuffer sb = new StringBuffer();
 
        for (int i = 0; i < strArray.length; i++)
        {
            if( (strArray[i] != ' ') && (strArray[i] != '\t') )
            {
                sb.append(strArray[i]);
            }
        }
 
        System.out.println(sb);           
}
