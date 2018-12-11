import java.util.*;
import java.util.Scanner;
import java.io.*;

public class Member{
      
   Scanner input = new Scanner(System.in);
   ArrayList<Statistics> stats   = new ArrayList<Statistics>();
   ArrayList<CompetitiveSwimmer> list = new ArrayList<CompetitiveSwimmer>();
   int info =-1;

   
   public void registerMotSwim() throws Exception{
      
      CompetitiveSwimmer motSwim   =  new CompetitiveSwimmer();
      PrintStream writeToFileMoti = new PrintStream(new FileOutputStream("Motionist.txt", true));

             
      System.out.println("Indtast fornavn: ");
      String fName = input.nextLine();
      
      System.out.println("Indtast efternavn :");
      String lName = input.next();
       
      System.out.println("indtast alder :");
      int alder = input.nextInt();
       
      int restance = 0;
       
      System.out.println("skriv Aktiv for aktivt medlemskab eller Passiv for passivt medlemskab:");
      String pasAkt = input.next();  
      
      motSwim.setFirstName(fName);
      motSwim.setLastName(lName);
      motSwim.setAge(alder);
      motSwim.setUnpaidSub(restance);
      motSwim.setActiveOrPas(pasAkt);
        
      writeToFileMoti.print(fName + " ");
      writeToFileMoti.print(lName + " ");  
      writeToFileMoti.print(alder + " "); 
      writeToFileMoti.print(restance + " ");
      writeToFileMoti.print(pasAkt + "\n");
         
      list.add(motSwim);
      
      System.out.println("\nFølgende medlem er blevet oprettet:\n");
      System.out.println("Fornavn: "+fName);
      System.out.println("Efternavn: "+lName);
      System.out.println("Alder: "+alder+"år");
      System.out.println("Status for medlemskab: "+pasAkt+"\n\n");
   
      
      if (motSwim.getAge() <= 17) {
	      motSwim.setSegment("Junior");
      }
   
      if (motSwim.getAge() >= 18 && motSwim.getAge() <= 59){
	      motSwim.setSegment("Senior");
      }
      
      if (motSwim.getAge() >= 60){
        motSwim.setSegment("Pensionist");
      }
      }   
   
   
   public void getInfo(){
      for(MotionistSwimmer motSwim : list){
         System.out.println(motSwim.getFirstName());
      }
   } 
   
   public void searchMember(){
      System.out.println("Indtast navnet på det medlem du søger:");
      String search = input.nextLine();
      int count = 0;
      for(MotionistSwimmer motSwim : list){
         if(motSwim.getFirstName().equals(search)){
            System.out.println("ID: "+ count);
            count++;
            System.out.println("Fornavn: "  + motSwim.getFirstName());
            System.out.println("EfterNavn: " + motSwim.getLastName());
            System.out.println("Alder: " + motSwim.getAge() + " år");
            System.out.println("Restance: " + motSwim.getUnpaidSub() + " kr.");
            System.out.println("Status: " + motSwim.getIsActive() + "\n");
         }
      }     
   }

   public void registerCompSwim() throws Exception {
      PrintStream writeToFileComp   =  new PrintStream (new FileOutputStream("competitive.txt", true));
      CompetitiveSwimmer compSwim   =  new CompetitiveSwimmer();
      System.out.println("Indtast fornavn: ");
      String fName = input.nextLine();
      
      System.out.println("Indtast efternavn: ");
      String lName = input.next();
       
      System.out.println("Indtast alder: ");
      int alder = input.nextInt();
       
      int restance = 0;
       
      System.out.println("Skriv Aktiv for aktivt medlemskab, eller Passiv for passivt medlemskab");
      String pasAkt = input.next();  
      
      System.out.println("Indtast disciplin;");
      String disc =  input.next();
      
      compSwim.setFirstName(fName);
      compSwim.setLastName(lName);
      compSwim.setAge(alder);
      compSwim.setUnpaidSub(restance);
      compSwim.setActiveOrPas(pasAkt);
      compSwim.setDiscipline(disc);
      
 
      compSwim.getAge();
      if (compSwim.getAge() <= 17) {
   	   compSwim.setSegment("Junior");
      }
      
      if (compSwim.getAge() >= 18 && compSwim.getAge() <= 59){
   	   compSwim.setSegment("Senior");
      }
         
      if (compSwim.getAge() >= 60){
         compSwim.setSegment("Pensionist");
      }
      
      writeToFileComp.print(fName + " ");
      writeToFileComp.print(lName + " ");  
      writeToFileComp.print(alder + " "); 
      writeToFileComp.print(restance + " ");
      writeToFileComp.print(pasAkt + " ");  
      writeToFileComp.print(disc +  "\n"); 
       
      list.add(compSwim);
      
      System.out.println("\nFølgende medlem er blevet oprettet:");
      System.out.println("Fornavn: "+fName);
      System.out.println("Efternavn: "+lName);
      System.out.println("Alder: "+alder+"år");
      System.out.println("Status for medlemskab: "+pasAkt);
      System.out.println("Disciplin: "+disc+"\n\n");        
   }
   
   public void loadMembers ()throws Exception   {
      Scanner scancom   =  new Scanner(new File("competitive.txt"));
      int count = 0;
     
      while (scancom.hasNext()){
         CompetitiveSwimmer compSwim   =  new   CompetitiveSwimmer();
         count++;
         
         String firstname  =  scancom.next();
         compSwim.setFirstName(firstname);
     
         String lastname   =  scancom.next();
         compSwim.setLastName(lastname);
     
         int age  =  scancom.nextInt();
         compSwim.setAge(age);
         
         if ( age <= 17) {
   	      compSwim.setSegment("Junior");
         }
      
         if (age >= 18 && age <= 59){
   	      compSwim.setSegment("Senior");
         }
         
         if (age >= 60){
           compSwim.setSegment("Pensionist");
         }

         int unpaid  =  scancom.nextInt();
         compSwim.setUnpaidSub(unpaid);
    
         String status  =  scancom.next();
         compSwim.setActiveOrPas(status);
      
         String disc =  scancom.next();
         compSwim.setDiscipline(disc);
  
         list.add(compSwim);  
      }
      
      Scanner  scanmot  =  new  Scanner(new File("Motionist.txt"));
      
      while (scanmot.hasNext()){
         CompetitiveSwimmer  motSwim  =  new   CompetitiveSwimmer();
    
         String firstname  =  scanmot.next();
         motSwim.setFirstName(firstname);
      
         String lastname   =  scanmot.next();
         motSwim.setLastName(lastname);
        
         int age  =  scanmot.nextInt();
         motSwim.setAge(age);
         
         if (motSwim.getAge() <= 17) {
   	      motSwim.setSegment("Junior");
         }
      
         if (motSwim.getAge() >= 18 && motSwim.getAge() <= 59){
   	      motSwim.setSegment("Senior");
         }
         
         if (motSwim.getAge() >= 60){
           motSwim.setSegment("Pensionist");
         }
      
         int unpaid  =  scanmot.nextInt();
         motSwim.setUnpaidSub(unpaid);
         
         String status  =  scanmot.next();
         motSwim.setActiveOrPas(status);
         
         list.add(motSwim);   
      }
   }
   
   public void clearList(){
      list.clear();
      System.out.println("Antal medlemmer: "+list.size());    
   }
   
   public void deleteMember()throws Exception{
      System.out.println("Indtast id nr på det medlem der skal slettes:");
      int index=input.nextInt();
      list.remove(index);
      System.out.println("ID: "+index+" er nu slettet \n");
   }
   
   public void displayMembers(){
      int count = 0;
      System.out.println("Antal medlemmer: " + list.size() + "\n");
      for(MotionistSwimmer motSwim : list){
         System.out.println("ID: "+ count);
         count++;
         System.out.println("Fornavn: "  + motSwim.getFirstName());
         System.out.println("EfterNavn: " + motSwim.getLastName());
         System.out.println("Alder: " + motSwim.getAge() + " år");
         System.out.println("Restance: " + motSwim.getUnpaidSub() + " kr.");
         System.out.println("Status: " + motSwim.getIsActive() + "\n");
      }
   }
   
   public void showRestance(){
      for(MotionistSwimmer motSwim : list){
         if(motSwim.getUnpaidSub()>=1){
            System.out.println("Fornavn: " + motSwim.getFirstName());
            System.out.println("Efternavn: "+ motSwim.getLastName());
            System.out.println("Mangler at betale : " + motSwim.getUnpaidSub()+" kr.\n");
         }   
      }  
   }
   
   public void displayAllSubscriptions(){
      for(MotionistSwimmer motSwim : list){
         System.out.println("Fornavn: " + motSwim.getFirstName());
         System.out.println("Efternavn: " + motSwim.getLastName());
         System.out.println("Mangler at betale : " +motSwim.getUnpaidSub()+" kr.");
         System.out.println("Status for medlemskab : " +motSwim.getIsActive());
         System.out.println("Medlemstype : "+motSwim.getSegment()+"\n");
      }  
   }
  
    public void addTrainingData() throws Exception {
      Statistics stat1 = new Statistics();
      PrintStream WriteToFile = new PrintStream(new FileOutputStream("TrainingStats.txt", true));
      
      System.out.println("Indtast personens navn:");
      
      String nName = input.nextLine();
      stat1.setFirstName(nName);
      
      System.out.println("Hvilken disciplin vil du opdatere tiden for?");
      System.out.println("Tast 1 for Crawl");
      System.out.println("Tast 2 for Bryst");
      System.out.println("Tast 3 for Butterfly");
      System.out.println("Tast 4 for Ryg");
      
      info  = input.nextInt(); 
      
      if(info == 1){
         System.out.println("Indtast tiden som et helt tal:");       
         int cCrawl = input.nextInt(); 
         stat1.setCrawlTime(cCrawl);
  
         System.out.println("Du har opdateret "+stat1.getFirstName()+"s Crawl-tid til "+stat1.getCrawlTime()); 
         WriteToFile.println(nName+" Crawl "+cCrawl);                  
      }
      
      if(info == 2){
         System.out.println("Indtast tiden som et helt tal:");
         int bBryst = input.nextInt();
         stat1.setBrystTime(bBryst);
 
         System.out.println("Du har opdateret "+stat1.getFirstName()+"s Bryst-tid til "+stat1.getBrystTime());
         WriteToFile.println(nName+" Bryst: "+bBryst);
      }
      
      if(info == 3){
         System.out.println("Indtast tiden som et helt tal:");
         int bButterfly = input.nextInt();
         stat1.setButterflyTime(bButterfly);
         
         System.out.println("Du har opdateret "+stat1.getFirstName()+"s Butterfly-tid til "+stat1.getButterflyTime());
         WriteToFile.println(nName+" Butterfly "+bButterfly);
      }
      
      if(info == 4){
         System.out.println("Indtast tiden som et helt tal:");
         int rRyg = input.nextInt();
         stat1.setRygTime(rRyg);
         
         System.out.println("Du har opdateret "+stat1.getFirstName()+"s-Ryg tid til "+stat1.getRygTime());
         WriteToFile.println(nName+" Ryg "+rRyg);
      }
   }
   
     public void loadTrainingData() throws Exception {
      Scanner read = new Scanner(new File("TrainingStats.txt"));
      
      while (read.hasNext()){
         Statistics stat1 = new Statistics();
         
         String firstname = read.next();
         stat1.setFirstName(firstname);
                 
         String discipline = read.next();
         stat1.setDiscipline(discipline);
                  
         int time = read.nextInt();
         stat1.setTime(time);
         
         stats.add(stat1);
      }
   }    
           
   public void displayTrainingData(){
      for(Statistics ss : stats){
         System.out.println("Fornavn: "+ss.getFirstName());
         System.out.println("Disciplin: "+ss.getDiscipline());
         System.out.println("tid: "+ss.getTime()+"\n");
      } 
   }
   public void top5(){
      int no1 = 0;
      int no2 = 0;
      int no3 = 0;
      int no4 = 0;
      int no5 = 0;
      String name1 = "...";
      String name2 = "...";
      String name3 = "...";
      String name4 = "...";
      String name5 = "...";
      
      for(Statistics motSwim : stats){
         if(motSwim.getTime() > no1){
            no5 = no4;
            no4 = no3;
            no3 = no2;
            no2 = no1;
            no1 = motSwim.getTime();
            
            name5 = name4;
            name4 = name3;
            name3 = name2;
            name2 = name1;
            name1 = motSwim.getFirstName(); 
         }
         if(motSwim.getTime() < no1 && motSwim.getTime() > no2){
            no5 = no4;
            no4 = no3;
            no3 = no2;
            no2 = motSwim.getTime();
            
            name5 = name4;
            name4 = name3;
            name3 = name2;
            name2 = motSwim.getFirstName();
            
         }
         if(motSwim.getTime() < no2 && motSwim.getTime() > no3){
            no5 = no4;
            no4 = no3;
            no3 = motSwim.getTime();
            
            name5 = name4;
            name4 = name3;
            name3 = motSwim.getFirstName();
            
         }
         if(motSwim.getTime() < no3 && motSwim.getTime() > no4){
            name5 = name4;
            name4 = motSwim.getFirstName();
         }
         if(motSwim.getTime() < no4 && motSwim.getTime() > no5){
            no5 = motSwim.getTime();
            name5 = motSwim.getFirstName();
         }
      }
      System.out.println("1:" + name5 + " @ " + no5 + "sek.");
      System.out.println("2:" + name4 + " @ " + no4 + "sek.");
      System.out.println("3:" + name3 + " @ " + no3 + "sek.");
      System.out.println("4:" + name2 + " @ " + no2 + "sek.");
      System.out.println("5:" + name1 + " @ " + no1 + "sek.");
   }
}