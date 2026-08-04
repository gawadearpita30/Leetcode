class Solution {
    public String reverseWords(String s) {

        char[] ch = s.toCharArray();
        int start = 0;

        for (int end = 0; end <= ch.length; end++) {

            if (end == ch.length || ch[end] == ' ') {

                int left = start;
                int right = end - 1;

                while (left < right) {
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;

                    left++;
                    right--;
                }

                start = end + 1;
            }
        }

        return new String(ch);
    }
}