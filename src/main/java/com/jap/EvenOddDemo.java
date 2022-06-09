package com.jap;

public class EvenOddDemo {

    public boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isPalindrome(int number){
        int remainder,sum=0,temp;
        temp=number;
        while(number>0){
            remainder=number%10;  //getting remainder
            sum=(sum*10)+remainder;
            number=number/10;
        }
        if(temp==sum)
           return true;
        else
           return false;
    }
}

