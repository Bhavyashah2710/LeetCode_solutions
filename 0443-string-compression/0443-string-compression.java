class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int i = 0;
        while(i<chars.length){
            int count=0;
            char now = chars[i];
            while(i<chars.length && now==chars[i]){
                i++;
                count++;
            }
            chars[write++]=now;
            if(count>1)  {
            String s = String.valueOf(count);
            for (char c : s.toCharArray())     chars[write++] = c;
            }
        }
        return write;
    }
}