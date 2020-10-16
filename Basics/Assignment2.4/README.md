# Unit 2.4: Loops

Below are answers to selected unit questions.

Exercise 1: Rewrite the following loop as a while loop:
    
for (i = 100; i >= 10; i--) System.out.println("i is: " + 1);

```
i = 100;
while (i >= 10) {
    System.out.println("i is: " + 1);
    i--;
}
```
Exercise 2: What is the output of the following loop?
       
for (i = 1; i <= 10; i++) { for (j = 1; j <= i; j++) System.out.print(j + " "); System.out.println(" "); }

```
1  (Two spaces after each last number)
1 2  
1 2 3  
1 2 3 4  
1 2 3 4 5  
1 2 3 4 5 6  
1 2 3 4 5 6 7  
1 2 3 4 5 6 7 8  
1 2 3 4 5 6 7 8 9  
1 2 3 4 5 6 7 8 9 10  
```
