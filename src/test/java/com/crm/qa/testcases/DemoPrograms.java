package com.crm.qa.testcases;

public class DemoPrograms {

    public void PrimeNumbersInGivenRange(){

        int i,j,count=0;
        System.out.println("Prime numbers between 1 to 100");
        for(i=1;i<=100;i++){
            for(j=1;j<=i/2;j++){

                if(i%j!=0){
                    System.out.println(i);
                    break;
                }

            }

        }
    }

    public void PrintEvenNumbersInRange(){

        int i,j;

        for(i=1;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    public void GivenNumberIsprime(){

        int i, num=30;
        Boolean flag=false;

        for(i=2;i<=num/2;i++) {

            if (num % i == 0) {
                flag = true;
                System.out.println("Given number is not prime");
            }
            break;
        }
        if(flag==false){
            System.out.println("Given number is prime");
        }
    }


    public void ReverseString() {

        String s1 = "Welcome", s2 = "";
        for(int i=s1.length()-1;i>=0;i--){

            s2 = s2 + s1.charAt(i);
        }
        System.out.println(s2);
    }

    public void CharOccuranceInString(){

        String s1 = "Welcome";
        char ch1 = 'e';
        int count = 0;
        char[] arr1 = s1.toCharArray();

        for (int i=0; i<s1.length();i++){
            if(arr1[i]== ch1);
            {
                count++;
            }

        }
        System.out.println(count);

    }

    public static void main(String[] args){

        DemoPrograms t1 = new DemoPrograms();
        //t1.PrimeNumbersInGivenRange();
        //t1.GivenNumberIsprime();
        //t1.PrintEvenNumbersInRange();
        //t1.ReverseString();
        t1.CharOccuranceInString();

    }
}
