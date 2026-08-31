# Easy-solved in java

1\. Find the Largest Number in a List 



import java.util.\*;



class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       List<Integer> l=new ArrayList<>();

&#x20;       System.out.println("Enter size of list :");

&#x20;       int c=s.nextInt();

&#x20;       for(int i=0;i<c;i++){

&#x20;           int e=s.nextInt();

&#x20;           l.add(e);

&#x20;       }

&#x20;       int max=l.get(0);

&#x20;       for(int i=0;i<c;i++){

&#x20;           if(l.get(i)>max){

&#x20;               max=l.get(i);

&#x20;           }

&#x20;       }

&#x20;     System.out.println(max);  

&#x20;   }

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

2\. Check if a String is a Palindrome 

import java.util.\*;



class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       System.out.println("Enter string :");

&#x20;       String s1=s.nextLine();

&#x20;       String s2="";

&#x20;       for(int i=0;i<s1.length();i++){

&#x20;           if(s1.charAt(i) != ' '){

&#x20;           s2+=s1.charAt(i);

&#x20;       }

&#x20;       }

&#x20;       System.out.println(s2); 

&#x20;       int c=s2.length(); 

&#x20;       boolean pal=true;

&#x20;       for(int i=0;i<c;i++){

&#x20;           if(s2.charAt(i) != s2.charAt(c-i-1)){

&#x20;               pal=false;

&#x20;               break;

&#x20;           }

&#x20;           }

&#x20;         System.out.println(pal);  

&#x20;       }

&#x20;   }

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

3\. Count the Occurrences of a Substring in a String 

import java.util.\*;



class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       System.out.println("Enter string :");

&#x20;       String s1=s.nextLine();

&#x20;       String s2="";

&#x20;       for(int i=s1.length()-1;i>=0;i--){

&#x20;           s2+=s1.charAt(i);

&#x20;       }

&#x20;       System.out.println(s2);  

&#x20;       }

&#x20;   }

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

4\. Reverse a String

import java.util.\*;



class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       System.out.println("Enter string :");

&#x20;       String s1=s.nextLine();

&#x20;       System.out.println("Enter substring :");

&#x20;       String s2=s.nextLine();

&#x20;       if(s2.isEmpty()){

&#x20;           System.out.println("cant be empty");

&#x20;       }

&#x20;       int c=0;

&#x20;       for(int i=0;i<=s1.length()-s2.length();i+=s2.length()){

&#x20;           if(s1.substring(i,i+s2.length()).equals(s2)){

&#x20;               c++;

&#x20;           }

&#x20;       }

&#x20;       System.out.println(c);  

&#x20;       }

&#x20;   }

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

5\. Count the Number of Vowels in a String 

import java.util.\*;



class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       System.out.println("Enter string :");

&#x20;       String s1=s.nextLine();

&#x20;       int c=0;

&#x20;       for(int i=0;i<s1.length();i++){

&#x20;           if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'){

&#x20;               c++;

&#x20;           }

&#x20;       }

&#x20;       System.out.println(c);  

&#x20;       }

&#x20;   }

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

6\. Sum of First N Natural Numbers 

import java.util.\*;



class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       System.out.println("Enter num :");

&#x20;       int n=s.nextInt();

&#x20;       System.out.println((n\*(n+1))/2);  

&#x20;       }

&#x20;   }

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

7\. Check if a Number is Prime

import java.util.\*;



class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       System.out.println("Enter num :");

&#x20;       int n=s.nextInt();

&#x20;       boolean prime=true;

&#x20;       if(n==1){

&#x20;           System.out.println("neither prime nor constant");

&#x20;           return;

&#x20;       }

&#x20;       for(int i=2;i<n;i++)  {

&#x20;           if(n%i == 0){

&#x20;               prime=false;

&#x20;               break;

&#x20;           }

&#x20;       }

&#x20;       System.out.println(prime);

&#x20;       }

&#x20;   }

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

8\. Find the Second Largest Element in an Array 

import java.util.\*;



class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       int\[] arr={1,2,3,4,6,5,7,7,6};

&#x20;       int max1=arr\[0];

&#x20;       int max2=arr\[0];

&#x20;       for(int i=0;i<arr.length;i++)  {

&#x20;           if(arr\[i]>max1){

&#x20;               max1=arr\[i];

&#x20;           }

&#x20;       }

&#x20;       for(int i=0;i<arr.length;i++)  {

&#x20;           if(arr\[i]>max2 \&\& arr\[i]<max1){

&#x20;               max2=arr\[i];

&#x20;           }

&#x20;       }

&#x20;       System.out.println(max2);

&#x20;       }

&#x20;   }

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

9\. Find the Factorial of a Number 

import java.util.\*;

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       System.out.println("Enter num :");

&#x20;       int n=s.nextInt();

&#x20;       int fact=1;

&#x20;       for(int i=1;i<=n;i++){

&#x20;           fact\*=i;

&#x20;       }

&#x20;       System.out.println(fact);

&#x20;   }

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

10\. Check if a Year is a Leap Year 

import java.util.\*;

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       System.out.println("Enter num :");

&#x20;       int y=s.nextInt();

&#x20;       if((y%4==0 \&\& y%100 !=0) || y%400==0){

&#x20;           System.out.println("it is a leap year");

&#x20;       }else{

&#x20;           System.out.println("it is not a  leap year");

&#x20;       }

&#x20;       

&#x20;   }

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

11\. Find the Length of a String

import java.util.\*;

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       System.out.println("Enter string :");

&#x20;       String s1=s.nextLine();

&#x20;       char\[] s2=s1.toCharArray();

&#x20;       int c=0;

&#x20;       for(char ss:s2){

&#x20;           c++;

&#x20;       }

&#x20;       System.out.println(c);

&#x20;       

&#x20;   }

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

12\. Count the Number of Words in a String

import java.util.\*;

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       System.out.println("Enter string :");

&#x20;       String s1=s.nextLine();

&#x20;       s1=s1.trim();

&#x20;       int c=1;

&#x20;       if(s1.isEmpty()){

&#x20;           System.out.print(0);

&#x20;           return;

&#x20;       }

&#x20;       for(int i=0;i<s1.length()-1;i++){

&#x20;           if(s1.charAt(i) != ' ' \&\& s1.charAt(i+1)==' '){

&#x20;               c++;

&#x20;           }

&#x20;       }

&#x20;       System.out.println(c);  

&#x20;   }

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

13.Remove Duplicates from a List 

import java.util.\*;

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       int l\[]={1,2,3,3,6,4,5,5,2,1};

&#x20;       List<Integer> l2=new ArrayList<>();

&#x20;       for(int i=0;i<l.length;i++){

&#x20;           if(!l2.contains(l\[i])){

&#x20;               l2.add(l\[i]);

&#x20;           }

&#x20;       }

&#x20;       System.out.println(l2);  

&#x20;   }

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

14\. Find the Sum of All Elements in a List

import java.util.\*;

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       List<Integer> l=Arrays.asList(1,2,3,4,5);

&#x20;       int t=0;

&#x20;       for(int i=0;i<l.size();i++){

&#x20;           t+=l.get(i);

&#x20;       }

&#x20;       System.out.println(t);  

&#x20;   }

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

16\. Multiply All Elements in a List 

import java.util.\*;

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       List<Integer> l=Arrays.asList(1,2,3,4);

&#x20;       int t=1;

&#x20;       for(int i=0;i<l.size();i++){

&#x20;           t\*=l.get(i);

&#x20;       }

&#x20;       System.out.println(t);  

&#x20;   }

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

15\. Check if a List Contains a Specific Element 

import java.util.\*;

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       List<Integer> l=Arrays.asList(10,20,30);

&#x20;       int e=200;

&#x20;       boolean found=false;

&#x20;       for(int i=0;i<l.size();i++){

&#x20;           if(l.get(i)==e){

&#x20;               found=true;

&#x20;               System.out.println("element found at index "+i);

&#x20;               break;

&#x20;           }

&#x20;       }  

&#x20;       if(found == false){

&#x20;           System.out.println("element not found");

&#x20;       }

&#x20;   }

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

17\. Find the Minimum Value in a List 

import java.util.\*;

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       List<Integer> l=Arrays.asList(10,20,30,5,6,4,7);

&#x20;       int min=l.get(0);

&#x20;       for(int i=0;i<l.size();i++){

&#x20;           if(l.get(i)<min){

&#x20;               min=l.get(i);

&#x20;           }

&#x20;       }  

&#x20;           System.out.println(min);

&#x20;   }

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

18\. Find the Average of Numbers in a List 

import java.util.\*;

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       List<Integer> l=Arrays.asList(10,20,30);

&#x20;       int t=0;

&#x20;       for(int i=0;i<l.size();i++){

&#x20;           t+=l.get(i);

&#x20;       }

&#x20;       int avg=t/l.size();

&#x20;       System.out.println(avg);  

&#x20;   }

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

19\. Convert a List to a String

import java.util.\*;

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       List<Character> l=Arrays.asList('h','i',' ','d','a');

&#x20;       String s1="";

&#x20;       for(int i=0;i<l.size();i++){

&#x20;           s1+=l.get(i);

&#x20;       }  

&#x20;           System.out.println(s1);

&#x20;   }

}

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

20\. Check if a List is Empty

import java.util.\*;

class Main {

&#x20;   public static void main(String\[] args) {

&#x20;       Scanner s=new Scanner(System.in);

&#x20;       List<Integer> l=Arrays.asList();

&#x20;       boolean e=false;

&#x20;       if(l.isEmpty()){

&#x20;           e=true;

&#x20;       }  

&#x20;           System.out.println(e);

&#x20;   }

}



