package com.Rushikesh;

public class conditionals {

    public static void main(String[] args) {
	// write your code here
        int salary=2000;
        if(salary>1000)
        {
            salary=salary+2000;
        }
        else
        {
            salary=salary+5000;
        }
        // Multiple If else
        if (salary>2000){
            salary-=2000;
        }else if (salary>8000){
            salary-=8000;
        }
        else
        {
            salary+=10000;
        }
        System.out.println(salary);
    }
}
