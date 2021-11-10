
import java.util.Random;
import java.util.Scanner;

class random extends Main {
	public int ran(){
		Random rand = new Random();
		int maxNumber = 6;

		int randomNumber = rand.nextInt(maxNumber)+1;
		return randomNumber;
	}
}
 class Main {
	public static void main(String[] args) {
		 int total = 0,out=0;
		 int total1=0,ot=0;
		 Random random=new Random();
		 random r=new random();
		 Scanner s=new Scanner(System.in);
		 
		
		 System.out.println("Welcome to Game");
		 System.out.println("Rule of the game"); 
		 System.out.println("Choose 1.Bat/2.Bowl");
		 int k=s.nextInt();
		 
		 while(out==0) {
			 int randomint =random.nextInt(7);
		 if (k==1) {
			 System.out.println("You are Batting  ");
				 System.out.println("Enter the value from 1-6");
				 int value=s.nextInt(); 
			 			 if((value>=1 &&value<=6)&&value==randomint) {
			 			   	
			 				 System.out.println("You are Out");	 
			 				 System.out.println("You have scored:"+total);
			 				 System.out.println("Now Its bowling time ");
			 				 while(ot==0) {
			 					int randomint1=r.ran();
			 					if(total<total1) {
			 						 System.out.println("System has won the game");
			 						 ot=1;
				 					 out=1;
				 					 break;
			 					}
			 				 System.out.println("enter a value from 1-6:");
			 				 int val=s.nextInt();
			 				
			 				 if( val==randomint1) 
			 				 {  
			 				     System.out.println("You are out");
			 					 System.out.println("total is:"+total1);
			 					 if(total==total1) {
			 						 System.out.println("Match is draw");
			 		   				 ot=1;
				 					 out=1;
				 					 break;
			 					 }
			 					 else if(total>total1) {
			 						 System.out.println("Player has won the game");
			 						 ot=1;
				 					 out=1;
			 						 break;
			 					 }
			 					 
			 					 
			 				 }
			 				 else if(val!=randomint1){
			 					 System.out.println("You are safe");
			 					 System.out.println("Random value is :"+randomint1);
			 					total1=total1+randomint1;
			 					System.out.println("total is:"+total1);
			 				 }
			 				 else {
			 					 System.out.println("do it again");
			 				 }
			 				 }
        	 }
			 else if((value>=1 &&value<=6) && value!=randomint) {
				 total=total+value;
				 System.out.println("You are safe ");
				 System.out.println("Random value is:"+randomint);
				 System.out.println("total is:"+total);
			 }
}
		 else if(k==2) {
			 System.out.println("You are Bowling  ");
			 System.out.println("Enter the value from 1-6");
			 int value=s.nextInt(); 
		 			 if((value>=1 &&value<=6)&&value==randomint) {
		 			   
		 				 System.out.println("You are Out");	 
		 				 System.out.println("You have scored:"+total);
		 				 System.out.println("Now Its batting time ");
		 				 while(ot==0) {
		 					int randomint1=r.ran();	
		 					if(total<total1) {
		 						 System.out.println("System has won the game");
		 						 ot=1;
			 					 out=1;
		 						 break;
		 					}
		 				 System.out.println("enter a value from 1-6:");
		 				 int val=s.nextInt();
		 				
		 				 if( val==randomint1) 
		 				 {  
		 				     System.out.println("You are out");
		 					 System.out.println("total is :"+total1);
		 					 if(total==total1) {
		 						 System.out.println("Match is draw");
		 						 ot=1;
			 					 out=1;
		 						 break;
		 					 }
		 					 else if(total>total1) {
		 						 System.out.println("Player has won the game");	
		 						 ot=1;
			 					 out=1;
		 						 break;
		 					 }
		 				 }
		 				 else if(val!=randomint1){
		 					 System.out.println("You are safe");
		 					 System.out.println("random number:"+randomint1);
		 					total1=total1+val;
		 					System.out.println("total is:"+total1);
		 				 }
		 				 else {
		 					 System.out.println("do it again");
		 				 }
		 				 }
    	 }
		 else if((value>=1 &&value<=6) && value!=randomint) {
			 total=total+randomint;
			 System.out.println("You are safe ");
			 System.out.println("total is:"+total);
		 }
		 }
		 else {
			 System.out.println("enter the valid choice");
			 break;
		 }
		 }
		 
		 
		 s.close();
		 System.out.println("thank you ");
}
}
