class Solution {
    public String licenseKeyFormatting(String s, int k) {

        String clean = "";

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch != '-') {
                clean += Character.toUpperCase(ch);
            }
        }

        if(clean.length() == 0)
            return "";

        String ans = "";

        int firstGrp = clean.length() % k;
        int index = 0;

        if(firstGrp != 0) {
            ans += clean.substring(0, firstGrp);
            index = firstGrp;
        }

        while(index < clean.length()) {

            if(!ans.equals(""))
                ans += "-";

            ans += clean.substring(index, index + k);

            index += k;
        }

        return ans;
    }
}