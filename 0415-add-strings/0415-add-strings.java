class Solution {
    public String addStrings(String num1, String num2) {
    //     int n1  = Integer.valueOf(num1) ;
    //     int n2 = Integer.valueOf(num2);
    //     int ans = n1+n2;
    // return String.valueOf(ans);
    int i = num1.length()-1;
    int j = num2.length()-1;
    int carry = 0 ;
    StringBuilder v = new StringBuilder();
    while(i>=0 || j>=0 || carry !=0){
        int d1=(i>=0)?num1.charAt(i)-'0' : 0;
        int d2=(j>=0)?num2.charAt(j)-'0' : 0;
        int sum = d1+d2+carry;
        carry = sum/10;
        v.append(sum%10);
        i--;
        j--;
    }
    return v.reverse().toString();
    }
}