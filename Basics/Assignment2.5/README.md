## Assignment 2.5: Methods

Below are answers to selected unit questions.

Question 1: What output is printed to the terminal when singOldMacdonald (shown in the assignment notes) is invoked?

    Old MacDonald had a farm, EE-I-EE-I-O,

    And on that farm he had a cow, EE-I-EE-I-O,

    With a moo moo here and a moo moo there

    Here a moo, there a moo, everywhere a moo moo

    Old MacDonald had a farm, EE-I-EE-I-O.
    

    Old MacDonald had a farm, EE-I-EE-I-O,
    
    And on that farm he had a dog, EE-I-EE-I-O,
    
    With a woof woof here and a woof woof there
    
    Here a woof, there a woof, everywhere a woof woof
    
    Old MacDonald had a farm, EE-I-EE-I-O.

Question 2: How would you invoke the verse method if you wanted to sing about a duck that quacks?

    verse("duck", "quack");

Question 3: What is the output of the following program (shown in the assignment notes)? Be precise about where there are spaces and where there are new lines. Hint: Start by describing in words what ping() and baffle() do when they are invoked.

    When invoked, baffle() prints "wug" and invokes ping() while ping() prints ".". The output:


    No, I wug.

    You wugga wug.

    I wug.


Question 4: Draw a stack diagram that shows the state of the program the first time ping() is invoked.
    
    println(".")
       
    ping()
    
    baffle()
    
    zoop()
    
    main (String[] args)

Question 5: What happens if you invoke baffle() at the end of the ping() method? 

    Since main(String[] args) will be called first and the ordering of the other methods does not matter, nothing will change.

Question 6: Write the method displayBox that has two "in" parameters, width and height. The method will print out a box made of '$' characters to the terminal that is as wide and high as the arguments passed to it.

    public static void displayBox(int w, int h) {
         for (int y = 1; y <= h; y++) {
             for (int x = 1; x <= w; x++) System.out.print("$");
             System.out.println("");
         }
    }
