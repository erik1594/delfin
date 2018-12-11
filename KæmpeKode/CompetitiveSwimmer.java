
public class CompetitiveSwimmer extends MotionistSwimmer {

   String discipline = "none";
   int time = 0000;
   int date = 0000;
   int rank = 0;
   String location = " nowhere"; 



public void setDiscipline (String disc){
   
   this.discipline = disc;
}

public String getDiscipline(){
   return discipline;

}
   
public void setTime (int time){
   this.time   =  time;
}

public int getTime(){
   return time;
}


public void setRank(int rank){
   this.rank   =  rank;
}

public int getRank(){
   return rank;
}


public void setDate(int date){
   this.date   =  date;
}

public int getDate(){
   return date;
}







}