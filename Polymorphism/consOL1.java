import java.util.*;

class MovieTicket{
    String movie;
    int ntick;
    int tot; 

   MovieTicket(){
    System.out.println("We will surprise you with what we have");
    this.movie="GBU";
    this.ntick=4;
    this.tot=200*ntick;
   }
  
   MovieTicket(String movie,int ntick){
    this.movie=movie;
    this.ntick=ntick;
    this.tot=200*ntick;
   }
   

   void display(){
    System.out.println("***********************");
    System.out.println("Movie: "+movie);
    System.out.println("Ticket Price: 200"); 
    System.out.println("Number Of Tickets: "+ntick);
    System.out.println("Total Price: "+tot);   
}  
}

public class consOL1{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String movie;
    int ntick;
    int opt;
    System.out.print("Do u want us to surprise u with latest movie 1 for yes and 0 for no(1/0): ");
    opt = in.nextInt();
    in.nextLine();
    MovieTicket m; 
    if (opt==1){   
     m = new MovieTicket();
}
   else{
    System.out.print("Movie Name: ");  
    movie = in.nextLine();
    System.out.print("Number of tickets: ");  
    ntick = in.nextInt();
     m = new MovieTicket(movie,ntick);
}
     m.display();
}  
}
