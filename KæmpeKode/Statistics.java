import java.util.*;
import java.io.*;

public class Statistics extends CompetitiveSwimmer{
   
   private int crawl = 0;
   private int bryst = 0;
   private int butterfly = 0;
   private int ryg = 0;

   public void setCrawlTime(int cCrawl) {
   
      this.crawl = cCrawl;
   }
   
   public void setBrystTime(int bBryst) {
   
      this.bryst = bBryst;
   }
   
   public void setButterflyTime(int bButterfly) {
   
      this.butterfly = bButterfly;
   }
   
   public void setRygTime(int rRyg) {
   
      this.ryg = rRyg;
   }

   public int getCrawlTime() {
      
      return crawl;
   }
   
   public int getBrystTime() {
      
      return bryst;
   }
   
   public int getButterflyTime() {
   
      return butterfly;
   }
   
   public int getRygTime() {
   
      return ryg;
   }
   
}
   
  
