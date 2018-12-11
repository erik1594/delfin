import java.util.*;
import java.io.*;

public class DelfinMain{

   public static void main (String[] args)throws Exception{  
      Member member = new Member();
      Scanner scan =  new Scanner(System.in);
      int userInput  = -1;
      boolean stop  = true;
      member.loadMembers();
      
      do{
         System.out.println("Tast 1 for medlems menu");
         System.out.println("Tast 2 for statistik menu");
         System.out.println("Tast 3 kontingents administration");
         System.out.println("Tast 4 for at slutte program");
      
         userInput   =  scan.nextInt(); 
        
         // medlems menu
         if(userInput == 1){
            System.out.println("Du har nu følgende muligheder\n");
            System.out.println("Tast 1 for opret nyt medlem");
            System.out.println("Tast 2 for at søge efter medlem");
            System.out.println("Tast 3 for at redigere medlem");
            System.out.println("Tast 4 for at slette et medlem");
            System.out.println("Tast 5 for at se alle medlemmer");
            System.out.println("Tast 6 for at returnere til hovedmenu");
               
            userInput = scan.nextInt();
               
            //opret nyt medlem
            if (userInput==1){
               System.out.println("Tast 1 for at oprette en ny konkurrence svømmer");
               System.out.println("Tast 2 for at oprette en ny motionist svømmer");
               userInput =  scan.nextInt();
                    
               if(userInput==1){
                  member.registerCompSwim();
                  userInput = -1;
               }
               
               if(userInput==2){
                  member.registerMotSwim();
                  userInput = -1;
               }  
            }
            //søg medlem
            if (userInput==2){
               member.searchMember();
               userInput = -1;    
            }
            
            if (userInput==3){
               System.out.println("IKKE MULIGT I DENNE UDGAVE\n");
               userInput = -1;     
            }
            
            if (userInput==4){
               member.displayMembers();
               member.deleteMember();
               userInput = -1;
            }
            
            if (userInput==5){
               member.displayMembers();
               userInput = -1;  
            }  
            if (userInput==6){
               userInput = -1;  
            }   
         }   
         
         //statistik menu
         if(userInput == 2){
            member.loadTrainingData();
            System.out.println("Tast 1 for se svømme statistikker:");
            System.out.println("Tast 2 for at tilføje til statistikkerne:");
            System.out.println("Tast 3 for at se top 5 træningstider");
            System.out.println("Tast 4 for at returnere til hovedmenu");
              
            userInput=scan.nextInt(); 
               
            if(userInput==1){
               member.displayTrainingData();
               userInput = -1;
            }
               
            if(userInput==2){
               member.addTrainingData();
               userInput = -1;
            }
            
            if(userInput==3){
               member.top5();
               userInput = -1;
            }
            if(userInput==4){
               userInput = -1;
            }
         }
         
         //kontigents administration
         if(userInput == 3){
            System.out.println("Tast 1 for at se restance");
            System.out.println("Tast 2 for at se alle kontigenter");
            System.out.println("Tast 3 for at returnere til hovedmenu");
               
            userInput=scan.nextInt();
               
            if(userInput ==1){
               member.showRestance();
               userInput = -1;
            }
            
            if(userInput==2){
               member.displayAllSubscriptions();
               userInput = -1;
            }
         }
         
         //slutte program
         if(userInput == 4){
            break;
         }    
      }while(stop == true);  
   } 
}
     


     
      
      
      
      
      
     
   
   

   


