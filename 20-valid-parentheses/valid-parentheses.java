import java.util.*;
class Solution {
    public boolean isValid(String s) {
         char ch[]=s.toCharArray();
		char stack[]=new char[ch.length];
		int top=-1;
		for(int i=0; i<ch.length; i++)
		{  char c=ch[i];
		   if(c=='(' || c=='[' || c=='{')
		   {  top=top+1;
		      stack[top]=c;
		   }
		   else{
			   if(top==-1) 
				   return false;
			   
		   if( (c==')' && stack[top]!='(') || (c==']' && stack[top]!='[')
 			    ||(c=='}' && stack[top]!='{') )
			   { return false;
			   }
			 top=top-1;
		   }
		}	
		return top==-1;
    }
}
