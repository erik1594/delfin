import java.io.*;
import java.util.*;
public class MotionistSwimmer{

   private String firstName = "Null";
   private String lastName = "Null";
   private int age = -1;
   private int unpaidSub = -1;
   private String isActive = "Nothing";
   private String segment = "none";
   


   

   public void setFirstName(String fname){
   
      this.firstName =  fname;
   }
   
   
   public void setSegment(String seg){
      this.segment   =  seg;
   }
   
   public void setLastName(String lname){
   
      this.lastName  =  lname;
   }
   
   public void setAge(int newage){
      this.age    =  newage;
   }
   
   public void setUnpaidSub(int newUnpaidSub){
      this.unpaidSub =  newUnpaidSub;
   }
   
   public void setActiveOrPas(String newIsActive){
      this.isActive  =  newIsActive;
   }
   
   

   public String getFirstName(){
      return   firstName;
}

   public String getLastName(){
      return   lastName;
}

   public int getAge(){
      return   age;
}

   public int getUnpaidSub(){
      return   unpaidSub;
}
   public String getIsActive(){
      return   isActive;
} 

   public String getSegment(){
      return   segment;
   }


}

   
  
   
   
   
   
   








   
   
 
   
