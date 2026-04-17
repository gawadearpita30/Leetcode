class Solution {
    public boolean backspaceCompare(String s, String t) {
                char[] s1 = new char[s.length()];
                char[] s2 = new char[t.length()];
                int top1 = -1, top2 = -1;
            // for String s
            for (int i = 0; i < s.length(); i++) 
            {
               char c = s.charAt(i);

                 if (c != '#') 
                 {
                   s1[++top1] = c;   // push
                 } 
                 else 
                 {
                if (top1 != -1) top1--;   // pop
                 }
            }
            //for String t
            for (int i = 0; i < t.length(); i++)
            {
              char c = t.charAt(i);

                if (c != '#') 
                {
                s2[++top2] = c;   // push
                } 
                else 
                {
                if (top2 != -1) top2--;   // pop
                }
            }
            //compare both stack
        if (top1 != top2) return false;
        for (int i = 0; i <= top1; i++) 
        {
            if (s1[i] != s2[i]) return false;
        }

        return true;
    }
}