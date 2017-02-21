/*
 Q2. Write a java program to count the number of times token string appeared in given target string? 
	Input: TargetString : java is a programming language. It is mostly used in big data applications
	       TokenString: is
	Output: 2
 
 */
package frequencycount;
import java.io.*;

public class Frequencycount {

    
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        String s=br.readLine();
        System.out.println("Enter substring: ");
        String sub=br.readLine();
        int ind,count=0;
        for(int i=0; i+sub.length()<=s.length(); i++)    
        {
            ind=s.indexOf(sub,i);
            if(ind>=0)
            {
                count++;
                i=ind;
                ind=-1;
            }
        }
        System.out.println("Occurence of '"+sub+"' in String is "+count);

    }
}
