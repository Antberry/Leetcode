// Day 2
//Problem 3
//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int beforeNum = x;
        int newNum = 0;
        while(x != 0){
          newNum = (newNum * 10) + (x % 10);
          x /= 10; //I missed this part of the code. I was suppose to get rid of the last number before it loops again.
        }
        return beforeNum == newNum;
    }
}

//Problem 4
// Struggled on I was thinking too much into it.
// I got the HashMap right.
// I tried to break down the problem. I was able to loop thru the Romans and add them
// I spent like 3 hours trying tp figure out how to check and see if is a 4 or a 9.
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>(); // I got th Hashmap Right
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        
        int length = s.length(); 
        int result = roman.get(s.charAt(length-1));
        
        for(int i = length -2 ; i >= 0; i--){
            if(roman.get(s.charAt(i)) >= roman.get(s.charAt(i + 1))){
                result += roman.get(s.charAt(i));
            }
            else{
                result -= roman.get(s.charAt(i));
            }
        }
        return result;
    }
}
//Today was another bust. I almost got the first one though. smh.......