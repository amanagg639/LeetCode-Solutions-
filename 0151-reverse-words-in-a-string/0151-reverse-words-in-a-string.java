class Solution {
    public String reverseWords(String s) {
        char str[] = s.toCharArray();
        char res[] = new char[s.length() + 1];
        int end = s.length() - 1;
        int j,k = 0;
        while( end >= 0)
        {
            while(end >=0 && str[end] == ' ')
            {
                end--;
            }
            if(end < 0)
              break;
            j = end;
            while(end >=0 && str[end] != ' ')
            {
                end--;
            }
            for(int i = end + 1;i <= j; i++)
            {
                res[k++] = str[i];
            }
            res[k++] = ' ';
        }
        return new String (res , 0 , k - 1);
    }
}