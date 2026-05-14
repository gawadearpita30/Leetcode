class Solution {
    public String reorderSpaces(String text) {

        int spaceCount = 0, wordCount = 0;

        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) != ' ' && (i == 0 || text.charAt(i-1) == ' '))
            {
                wordCount++;
            }

            if(text.charAt(i) == ' ')
            {
                spaceCount++;
            }
        }

        int s = 0;
        int extra = 0;

        if(wordCount == 1)
        {
            s = 0;
            extra = spaceCount;
        }
        else
        {
            s = spaceCount / (wordCount - 1);
            extra = spaceCount % (wordCount - 1);
        }

        String ans = "";
        String word = "";
        int usedWords = 0;

        for(int i = 0; i < text.length(); i++)
        {
            char ch = text.charAt(i);

            if(ch != ' ')
            {
                word += ch;
            }
            else
            {
                if(word.length() > 0)
                {
                    ans += word;
                    usedWords++;

                    if(usedWords < wordCount)
                    {
                        for(int j = 1; j <= s; j++)
                        {
                            ans += " ";
                        }
                    }

                    word = "";
                }
            }
        }

        if(word.length() > 0)
        {
            ans += word;
        }

        for(int i = 1; i <= extra; i++)
        {
            ans += " ";
        }

        return ans;
    }
}