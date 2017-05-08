/**
  * file: Into_Darkness.java
  * author: Will Simmons
  * course: CMPT 220
  * assignment: Project 2
  * due date: May 4, 2017
  * version: 5
  *
  * This file is a horror text-adventure game. The program
  * will read out text, and based on the user's decision,
  * will input what their decision is at each part.
**/

import java.util.Scanner;

public class Into_Darkness_v2 {
  public static void main( String[] args ){
    // Creates a scanner for the keyboard inputs
    Scanner keyboard = new Scanner(System.in);
    
    // String names for each if else input from the user
    String Name, Situation, Gate, Hammer, Door, Stairs, Light, Next,
     Fight, Dining, Kitchen, Window, Starvation, Diamond;

    System.out.println("------ Welcome to Into Darkness ------");
    System.out.println("  ");
    // Causes a delay for the next step in the program
    // This will be seen a lot
    try {
      Thread.sleep(1000);
    }
    catch (InterruptedException ex) {
    }
    // Input for user name
    System.out.println("What is your name: ");
    Name = keyboard.next();
    System.out.println("Hello " + Name + " and Welcome to your DOOM!!!!");
    System.out.println("There is an abonded mansion that everyone talks");
    System.out.println("about.");
    System.out.println("It is know that there is a hidden and rare diamond");
    System.out.println("somewhere in the the mansion.");
    System.out.println("However, it is known that a creepy man watches over");
    System.out.println("the diamond and he is not afraid to kill.");
    System.out.println("Your goal is get in, find the diamond, then get the");
    System.out.println("hell out of there!");
    // Delaying the program
    try {
      Thread.sleep(8000);
    }
    catch (InterruptedException ex) {
    }
    // User picks situation for game
    System.out.println("Would you like to play situation 'gate' or");
    System.out.println(" 'backyard'?");
    Situation = keyboard.next();
    
    // First long if statement that holds all other if else statements
    if (Situation.equalsIgnoreCase("gate")) {
      System.out.println("There is a lock on the gate. You see an old hammer");
      System.out.println("on the ground.");
      // Delay the program
      try {
        Thread.sleep(2000);
      }
      catch (InterruptedException ex) {
      } 
      System.out.println("Do you use the 'hammer' to try to break the lock");
      System.out.println("or do you look for another 'way' in?");
      Gate = keyboard.next();

      if (Gate.equalsIgnoreCase("hammer")) {
        System.out.println("You swing the hammer at the lock and break it,");
        System.out.println(" but it makes a loud bang.");
        System.out.println(" This could cause problems later.");
        System.out.println("As you walk through the gate, ");
        System.out.println("you see the front door");
        System.out.println(" of the mansion slightly ajar.");
        // Delay the program
        try {
          Thread.sleep(2000);
        }
        catch (InterruptedException ex) {
        } 
        System.out.println("Do you go in through the front 'door'");
        System.out.println(" or find 'another' way in?");
        Door = keyboard.next();

        if (Door.equalsIgnoreCase("door")) {
          System.out.println("As you walk up to the door,");
          System.out.println("you hear noises inside.");
          System.out.println(" You see a shadow at the top of ");
          System.out.println("the stairs in front of you.");
          // Delay the program
          try {
            Thread.sleep(2000);
          }
          catch (InterruptedException ex) {
          } 
          System.out.println(" Do you go in and go up the 'stairs'");
          System.out.println(" or go into the 'dinning' room to your right?");
          Stairs = keyboard.next();

          if (Stairs.equalsIgnoreCase("stairs")) {
            System.out.println(Name + ", as you creep up the stairs,");
            System.out.println(" you see only two doors open.");
            // Delay the program
            try {
              Thread.sleep(2000);
            }
            catch (InterruptedException ex) {
            } 
            System.out.println(" Do you check out the room with the");
            System.out.println("source of 'light' or");
            System.out.println("the one that is completely 'dark'.");
            Light = keyboard.next();

            if (Light.equalsIgnoreCase("light")) {
              System.out.println("As you peak into the light room,");
              System.out.println(" you see a creepy man");
              System.out.println("sitting in a chair next to a box.");
              System.out.println("You notice a KEY on top of the box,");
              System.out.println(" as well as the knife he is holding");
              System.out.println("in his hand.");
              System.out.println("The man looks up");
              System.out.println(" and notices you, " + Name);
              System.out.println("The man stares at you,");
              System.out.println("slowly bringing up his knife......");
              System.out.println("And points it at you, " + Name + ".");
              // Delay the program
              try {
                Thread.sleep(3000);
              }
              catch (InterruptedException ex) {
              }
              System.out.println(Name + " you wonder what he is doing,");
              System.out.println("until he suddenly starts to get out of");
              System.out.println("his chair with the knife up.");
              System.out.println("QUICK! You need to make a decision.");
              System.out.println("Do you run to the 'next' dark room or");
              System.out.println("run back 'down' the stairs?");
              Next = keyboard.next();

              if (Next.equalsIgnoreCase("next")) {
                System.out.println("You run into the dark room.");
                System.out.println("You try to find the light switch.");
                System.out.println("Yes! You found it,");
                System.out.println("but shit it doesn't work.");
                System.out.println("You try to lock the door,");
                System.out.println("but there isn't a lock.");
                System.out.println("You hear footstep coming your way as");
                System.out.println("you back away from the door in the dark.");
                System.out.println("The door gets thrown open and");
                System.out.println("you see the man");
                System.out.println("standing tall with the knife.");
                // Delay the program
                try {
                  Thread.sleep(6000);
                }
                catch (InterruptedException ex) {
                } 
                System.out.println("Do you try and 'fight' the man or");
                System.out.println("'accept' your fate?");
                Fight = keyboard.next();

                if (Fight.equalsIgnoreCase("fight")) {
                  System.out.println(Name + " lets be honest,");
                  System.out.println("That was a bad choice.");
                  System.out.println("You run up and try to punch the man.");
                  System.out.println("The man dodges your punch and");
                  System.out.println("stabs you over and over again.");
                  System.out.println("As you slowly bleed out he yells");
                  System.out.println("'LONG LIVE THE SIMMONS FAMILY JEWEL!");
                  // Delay the program
                  try {
                    Thread.sleep(7500);
                  }
                  catch (InterruptedException ex) {
                  } 
                  System.out.println("FAILURE!");
                  System.out.println(Name + ": You have died!");
                  System.out.println("Better Luck Next Time");
                } else if (Fight.equalsIgnoreCase("accept")) {
                    System.out.println("The man walks up you, " + Name);
                    System.out.println("He raises the and stabs you");
                    System.out.println("right in the heart.");
                    System.out.println("As you die you hear him yell");
                    System.out.println("'LONG LIVE THE...'");
                    System.out.println("FAILURE!");
                    System.out.println(Name + ": You have died!");
                    System.out.println("Better Luck Next Time");
                }
              } else if (Next.equalsIgnoreCase("down")) {
                  System.out.println("As you run back down the stairs,");
                  System.out.println("you look back and");
                  System.out.println("notice the man isn't following you.");
                  System.out.println("You see the dining room you");
                  System.out.println("saw before and the kitchen.");
                  // Delay the program
                  try {
                    Thread.sleep(2000);
                  }
                  catch (InterruptedException ex) {
                  }
                  System.out.println("Do you go into the 'kitchen' or");
                  System.out.println("go to the 'dining' room?");
                  Dining = keyboard.next();

                  if (Dining.equalsIgnoreCase("dining")) {
                    System.out.println("You notice in the dining room a");
                    System.out.println("KEY and a lighter.");
                    System.out.println("You pick up both of them.");
                    System.out.println("These could be helpful later.");
                    // Delay the program
                    try {
                      Thread.sleep(1000);
                    }
                    catch (InterruptedException ex) {
                    }
                    System.out.println("Do you go back up the 'stairs' or");
                    System.out.println("check out the 'kitchen'?");
                    Kitchen = keyboard.next();

                    if (Kitchen.equalsIgnoreCase("kitchen")) {
                      System.out.println(Name + ", you are");
                      System.out.println("feeling very hungry.");
                      System.out.println("You notice food on the table,");
                      System.out.println("but it looks old and rotten.");
                      System.out.println("Seeing the food makes you even");
                      System.out.println("more hungry and you feel like");
                      System.out.println("you are going to pass out.");
                      // Delay the program
                      try {
                        Thread.sleep(1000);
                      }
                      catch (InterruptedException ex) {
                      }
                      System.out.println("Do you eat the 'food' or 'move on'");
                      System.out.println("and look around the kitchen more?");
                      Starvation = keyboard.next();

                      if (Starvation.equalsIgnoreCase("food")) {
                        System.out.println("After eating the food,");
                        System.out.println("your vision starts to spin.");
                        System.out.println("You evetually pass out...");
                        System.out.println(" and never wake.");
                        // Delay the program
                        try {
                          Thread.sleep(1000);
                        }
                        catch (InterruptedException ex) {
                        }
                        System.out.println("FAILURE!");
                        System.out.println(Name + ": You have died from");
                        System.out.println("the poisonous food!");
                        System.out.println("Better Luck Next Time");
                      } else if (Starvation.equalsIgnoreCase("move")) {
                          System.out.println("As you walk around the");
                          System.out.println("kitchen, you start to sweat");
                          System.out.println("and can't keep your balance.");
                          System.out.println("Eventually you walk into");
                          System.out.println("a table, fall, and hit your");
                          System.out.println("head on the ground hard.");
                          System.out.println("You crack your head open");
                          System.out.println("on the ground and you slowly");
                          System.out.println("start to bleed out.");
                          System.out.println("You now lay there until you");
                          System.out.println("lose too much blood");
                          System.out.println("and evetually die. :(");
                          // Delay the program
                          try {
                            Thread.sleep(2000);
                          }
                          catch (InterruptedException ex) {
                          }
                          System.out.println("FAILURE!");
                          System.out.println(Name + ": You have died");
                          System.out.println("from blood loss!");
                          System.out.println("Better Luck Next Time");
                      }
                    } else if (Kitchen.equalsIgnoreCase("stairs")) {
                        System.out.println("As you go up the stairs again");
                        System.out.println(",you make your way");
                        System.out.println("into the dark room.");
                        System.out.println("You walk in and take out your");
                        System.out.println("lighter seeing whats in there.");
                        System.out.println("The only thing in the is a");
                        System.out.println("giant chest in the");
                        System.out.println("middle of the room.");
                        System.out.println("You walk over to the chest");
                        System.out.println("and open it with the KEY");
                        System.out.println("you had found earlier.");
                        System.out.println("In the chest is what you");
                        System.out.println("have been looking for");
                        System.out.println("all this time.");
                        System.out.println("You reach in the grab");
                        System.out.println("the rare diamond.");
                        System.out.println("There are two ways out.");
                        System.out.println("You can go through the");
                        System.out.println("open window or back down the");
                        System.out.println("stairs and out the front door.");
                        // Delay the program
                        try {
                          Thread.sleep(2000);
                        }
                        catch (InterruptedException ex) {
                        }
                        System.out.println("Do you 'jump' from the two");
                        System.out.println("story window or go back");
                        System.out.println("'down' the stairs?");
                        Diamond = keyboard.next();

                        if(Diamond.equalsIgnoreCase("jump")) {
                          System.out.println("You climb through the window");
                          System.out.println("and make your leap of");
                          System.out.println("faith to freedom.");
                          System.out.println("Welp... again this was");
                          System.out.println("the wrong decision.");
                          System.out.println("You take a hard fall to the");
                          System.out.println("ground and hear a huge crack.");
                          System.out.println("As you are laying on the");
                          System.out.println("cold ground, you look down");
                          System.out.println("at your legs and notice");
                          System.out.println("they are both broken.");
                          // Delay the program
                          try {
                            Thread.sleep(2000);
                          }
                          catch (InterruptedException ex) {
                          }
                          System.out.println("FAILURE!");
                          System.out.println(Name + ": You have lost");
                          System.out.println("from breaking your legs!");
                          System.out.println("Better Luck Next Time");
                        } else if (Diamond.equalsIgnoreCase("down")) {
                            System.out.println("You swing open the door");
                            System.out.println("and start for the stairs.");
                            System.out.println("As you run down the stairs,");
                            System.out.println("you see the man chasing");
                            System.out.println("after you.");
                            System.out.println("You run straight through");
                            System.out.println("the door and");
                            System.out.println("towards the gate.");
                            System.out.println("As you get to the gate,");
                            System.out.println("ou bust right through it");
                            System.out.println("and head down freedom road.");
                            System.out.println("As you look back you");
                            System.out.println("see the man stop in anger.");
                            System.out.println("This is it, you finally");
                            System.out.println("made it free from");
                            System.out.println("the mansion.");
                            // Delay the program
                            try {
                              Thread.sleep(7000);
                            }
                            catch (InterruptedException ex) {
                            }
                            System.out.println("CONGRATULATION!!!!!");
                            System.out.println("You Won!!!!!");
                            System.out.println(Name + ", you have great");
                            System.out.println("decision making skills!");
                            System.out.println("Good luck in life...");
                            System.out.println("like you even need it!");
                        }
                      }
                  } else if (Dining.equalsIgnoreCase("kitchen")) {
                      System.out.println("Sike!");;
                      System.out.println("The man killer is in the kitchen.");
                      // Delay the program
                      try {
                        Thread.sleep(3000);
                      }
                      catch (InterruptedException ex) {
                      }
                      System.out.println("FAILURE!");
                      System.out.println(Name + ": You have died");
                      System.out.println("from the mans knife!");
                      System.out.println("Better Luck Next Time");
                  }
              }
            } else if (Light.equalsIgnoreCase("dark")) {
                System.out.println("You walk into the dark room.");
                System.out.println("You can find a light switch");
                System.out.println("and that really scares you.");
                System.out.println("You hear noise come from the other and");
                System.out.println("it scares you so bad that");
                System.out.println("you piss yourself.");
                // Delay the program
                try {
                  Thread.sleep(2000);
                }
                catch (InterruptedException ex) {
                }
                System.out.println("Traumatized by what just happened,");
                System.out.println("you run out of the room and");
                System.out.println(" out of the mansion...");
                System.out.println("Never to come back again!");
                System.out.println("FAILURE!");
                System.out.println("Better Luck Next Time");
            }
          } else if (Stairs.equalsIgnoreCase("dining")) {
              System.out.println("You walk into the dining room to find a");
              System.out.println("KEY and a lighter on the");
              System.out.println("other side of the room.");
              System.out.println("You walk around the table to grab them");
              System.out.println("when suddenly...");
              // Delay the program
              try {
                Thread.sleep(1000);
              }
              catch (InterruptedException ex) {
              }
              System.out.println("You fall through the wooden floor boards.");
              System.out.println("Your legs break the fall,");
              System.out.println("but they do break in the process.");
              System.out.println("There are hundreds of");
              System.out.println("rats in the basement.");
              System.out.println("All the rats were drawn to the attention");
              System.out.println("of the fall and start feasting on you. :(");
              // Delay the program
              try {
                Thread.sleep(2000);
              }
              catch (InterruptedException ex) {
              }
              System.out.println("FAILURE!");
              System.out.println(Name + ": You have died from rodant attack!");
              System.out.println("Better Luck Next Time");
          }
        } else if (Door.equalsIgnoreCase("another")) {
            System.out.println("You look around the entire front of the");
            System.out.println("house and find nothing,");
            System.out.println("but a weird hole in the ground.");
            System.out.println("Curious by the hole, you walk to see");
            System.out.println("what's inside.");
            System.out.println("As you look at the hole you slip into it");
            System.out.println("and fall down 50 feet.");
            // Delay the program
            try {
              Thread.sleep(2000);
            }
            catch (InterruptedException ex) {
            }
            System.out.println("You land on the ground and die instanly. :(");
            System.out.println("FAILURE!");
            System.out.println(Name + ": You have died from impact!");
            System.out.println("Better Luck Next Time");
        }
      } else if (Gate.equalsIgnoreCase("way")) {
          System.out.println("You look for another way in,");
          System.out.println("but there no other way since the");
          System.out.println("fence is too high.");
          // Delay the program
          try {
            Thread.sleep(2000);
          }
          catch (InterruptedException ex) {
          }
          System.out.println("Oh well guess you will havae to come back");
          System.out.println("another day " + Name);
          System.out.println("Better Luck Next Time");
      }
    } else if (Situation.equalsIgnoreCase("backyard")) {
        System.out.println("As you scan the backyard of the abonded mansion,");
        System.out.println("you see that there are two ways in.");
        System.out.println("Do you try and slip in a back 'window' with");
        System.out.println("sharp glass around it or 'climb' up the");
        System.out.println("old rusty fire escape?");
        Window = keyboard.next();

        if (Window.equalsIgnoreCase("window")) {
          System.out.println("You walk up to the window and see a bunch");
          System.out.println("of broken glass all around the frame.");
          System.out.println("However, you feel you can slip through");
          System.out.println("without cutting yourself on the glass.");
          System.out.println("As you try to climb through the window...");
          // Delay the program
          try {
            Thread.sleep(1000);
          }
          catch (InterruptedException ex) {
          }
          System.out.println("You slice open your entire hand on the");
          System.out.println("window glass.");
          System.out.println("There is soooooooo much blood.");
          System.out.println("You don't think you can go without medical");
          System.out.println("attention so you leave the madnsion");
          System.out.println("for another day.");
          System.out.println("FAILURE!");
          System.out.println("Better Luck Next Time");
        } else if (Window.equalsIgnoreCase("climb")) {
            System.out.println("You walk over to the fire escape.");
            System.out.println("You realize that its is very");
            System.out.println("rusty and unstable.");
            System.out.println("You decide to make the leap anyway as this");
            System.out.println("seems to be the best option.");
            System.out.println("And you jump........");
            // Delay the program
            try {
              Thread.sleep(2000);
            }
            catch (InterruptedException ex) {
            }
            System.out.println("Nice! You landed on the ladder and");
            System.out.println("climb up to the top.");
            System.out.println("When you get to the top you hear raddeling");
            System.out.println("and it doesn't sound good.");
            System.out.println("Bang! The entire fire escape collapses!");
            System.out.println("You hit the deck with a piece of metal");
            System.out.println("going through your heart.");
            System.out.println("FAILURE!");
            System.out.println(Name + ": You have died from being");
            System.out.println("turned into a shish kebab!");
            System.out.println("Better Luck Next Time");
        }
    }
  }
}



