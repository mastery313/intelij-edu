package com.jilism.codetest;

public class SolutionAtoi {
    public int myAtoi(String s) {
        int index = 0;
        int sign = 1;

        if(s == null || s.length() == 0){
            return 0;
        }

        //1. reading white space
        while(index < s.length() && s.charAt(index) == ' '){
            index++;
        }

        //2. signed
        if(index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')){
            if(s.charAt(index) == '-') sign = -1;
            index++;
        }

        //3. read character
        int result = 0;
        while(index < s.length()){
            char c = s.charAt(index);
            if(Character.isDigit(c)){

                //5.
                if(result > Integer.MAX_VALUE/10 || result == Integer.MAX_VALUE/10 && (c-'0') > 7){
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                //4.
                result = result * 10 + (c-'0');

//                if(sign == 1 && result >= Integer.MAX_VALUE/10){
//                    result = Integer.MAX_VALUE;
//                }else if(sign == -1 && result*sign <= Integer.MIN_VALUE/10){
//                    result = Integer.MIN_VALUE;
//                }else{
//                    //4.
//                    result = result * 10 + (c-'0');
//                }
            }else{
                break;
            }
            index++;
        }
        //System.out.printf("%d %d",2^31,Math.pow(2,31));
        //6.
        return sign*result;
    }

    public static void main(String[] args) {
        System.out.println(new SolutionAtoi().myAtoi("2147483648"));
    }
}
