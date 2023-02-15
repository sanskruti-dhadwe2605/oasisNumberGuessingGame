package numberDao;

import java.util.*;
class NumberGuessingGame
{
    public static int guessing(int x,int r)
    {
        Scanner sc = new Scanner(System.in) ;
            int guess=sc.nextInt();
            if(x==guess)
            {
                System.out.println("That's awesome,your guess is correct..!!");  
                return 1;
            } 
            else if(guess>x)
            {
                System.out.println("Guess a Lesser Number than this..!!");
            
            }
            else if(guess<x)
            {
                System.out.println("Guess a Greater Number than this..!! ");
            
            }
        
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            int score=100,ch=0,r=0;
            Random random = new Random();   
            int x = random.nextInt(101); 
      System.out.println("Are you ready to start the game..??\n if yes type 1 else 0");
int start=sc.nextInt();
            System.out.println("Hello ,Dear Player,Best of Luck to You");
            System.out.println("Guess the number between 1 to 100 and you have 10 chances");
            if(start==1){
            while(ch<=9){
            r=guessing(x,r);
            if(r==1){
System.out.println("Your Score is "+score);
            break;
             }
            score=score-10;
            ch++;
            }
            if(score<=0){
                System.out.print("Best Luck Next Time\n");
                System.out.println("The number is "+x);
            }
}

else
{
System.out.println("play the game next time");
   }
        }
}