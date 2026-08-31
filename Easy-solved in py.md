# Easy-solved in python

**1. Find the Largest Number in a List**



print("How many num :")

n=int(input())

l=\[]

for i in range(n):

&#x20;   e=int(input())

&#x20;   l.append(e)

max=l\[0]

for i in range(n):

&#x20;   if l\[i]>max:

&#x20;       max=l\[i];

print(max)

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**2. Check if a String is a Palindrome**



print("enter string :")

s=input()

s2=""

for i in s:

&#x20;   if i !=' ':

&#x20;       s2+=i

print(s2==s2\[::-1])

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**3. Count the Occurrences of a Substring in a String**



print("enter string :")

s1=input()

print("enter substring :")

s2=input()

c=0

for i in range(0,len(s1)-len(s2)+1):

&#x20;   if(s1\[i:(len(s2)+i)]==s2):

&#x20;       c=c+1

print(c)

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**4. Reverse a String**

print("enter string :")

s=input()

print(s\[::-1])

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**5. Count the Number of Vowels in a String**



print("enter string :")

s=input()

c=0

for i in s:

&#x20;   if i in "aeiou":

&#x20;       c+=1

print(c)

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**6. Sum of First N Natural Numbers**



print("enter num :")

n=int(input())

print((n\*(n+1))/2)

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**7. Check if a Number is Prime**



print("enter num :")

n=int(input())

prime=True

if n==1:

&#x20;   print("neither nor")

else:

&#x20;   for i in range(2,n):

&#x20;       if n%i==0:

&#x20;           prime=False;

&#x20;           break

&#x20;   print(prime)

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**8. Find the Second Largest Element in an Array**

arr=\[1,2,3,4,6,5,7,7,6];

max1=arr\[0]

max2=arr\[0]

for i in arr:

&#x20;   if i>max1:

&#x20;       max1=i

for i in arr:

&#x20;   if i>max2 and i<max1:

&#x20;       max2=i

&#x20;          

print(max2)

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**9. Find the Factorial of a Number**

n=int(input())

fact=1

for i in range(1,n+1):

&#x20;   fact\*=i

print(fact)

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**10. Check if a Year is a Leap Year**

y=int(input())

if((y%4==0 and y%100 != 0)or y%400==0):

&#x20;   print("leap")

else:

&#x20;   print("not leap")

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**11. Find the Length of a String**

y=input()

c=0

for i in y:

&#x20;   c+=1

print(c)

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**12. Count the Number of Words in a String**

y=input()

c=1

y=y.strip()

for i in range(len(y)):

&#x20;   if y\[i]==' ' and y\[i+1] != ' ':

&#x20;       c+=1

print(c)

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**13.Remove Duplicates from a List**



import collections

print("How many num :")

n=int(input())

l=\[]

for i in range(n):

&#x20;   e=int(input())

&#x20;   l.append(e)

l2=collections.OrderedDict.fromkeys(l)

print(l2.keys())

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**14. Find the Sum of All Elements in a List**



print("How many num :")

n=int(input())

l=\[]

for i in range(n):

&#x20;   e=int(input())

&#x20;   l.append(e)

tot=0

for i in l:

&#x20;   tot+=i

print(tot)

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**16. Multiply All Elements in a List**



print("How many num :")

n=int(input())

l=\[]

for i in range(n):

&#x20;   e=int(input())

&#x20;   l.append(e)

pro=1

for i in l:

&#x20;   pro\*=i

print(pro)

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**15. Check if a List Contains a Specific Element**



print("How many num :")

n=int(input())

l=\[]

for i in range(n):

&#x20;   e=int(input())

&#x20;   l.append(e)

print("Enter element")

e=int(input())

found=False

for i in l:

&#x20;   if i==e:

&#x20;       found = True

&#x20;       break

print(found)



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**17. Find the Minimum Value in a List**



print("How many num :")

n=int(input())

l=\[]

for i in range(n):

&#x20;   e=int(input())

&#x20;   l.append(e)

min=l\[0]

for i in range(n):

&#x20;   if l\[i]<min:

&#x20;       min=l\[i];

print(min)

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**18. Find the Average of Numbers in a List**



print("How many num :")

n=int(input())

l=\[]

for i in range(n):

&#x20;   e=int(input())

&#x20;   l.append(e)

t=0

for i in l:

&#x20;   t+=i

print(t/len(l))

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**19. Convert a List to a String**



print("How many num :")

n=int(input())

l=\[]

for i in range(n):

&#x20;   e=input()

&#x20;   l.append(e)

s=""

for i in l:

&#x20;   s+=i

print(s)

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**20. Check if a List is Empty**



print("How many num :")

n=int(input())

l=\[]

for i in range(n):

&#x20;   e=int(input())

&#x20;   l.append(e)

if(l==\[]):

&#x20;   print("Empty")

else:

&#x20;   print("Not Empty")

