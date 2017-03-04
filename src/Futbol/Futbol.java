package Futbol;
import becker.robots.*;



public class Futbol {
   private Robot joe;
   private City unal;
   private Thing balon;
   
   public Futbol(){
       this.unal = new City(10,10);
       this.balon = new Thing(this.unal,9,9);
       this.joe = new Robot(unal,9,9,Direction.WEST);
   
   }
   
   public void advance(){
       this.joe.pickThing();
       this.joe.move();
       this.joe.putThing(balon);
       this.joe.pickThing();
       this.joe.move();
       this.joe.putThing(balon);
       
   }
   
   public void advanceleft(){
       this.joe.pickThing();
       this.joe.turnLeft();
       this.joe.move();
       this.joe.putThing(balon);
       this.joe.pickThing();
       this.joe.turnLeft();
       this.joe.turnLeft();
       this.joe.turnLeft();
       this.joe.move();
       this.joe.putThing(balon);
       this.joe.pickThing();
       this.joe.move();
       this.joe.putThing(balon);
       
   
   }
   
   public void advanceright(){
       this.joe.pickThing();
       this.joe.move();
       this.joe.putThing(balon);
       this.joe.pickThing();
       this.joe.move();
       this.joe.putThing(balon);
       this.joe.pickThing();
       this.joe.turnLeft();
       this.joe.turnLeft();
       this.joe.turnLeft();
       this.joe.move();
       this.joe.putThing(balon);
       this.joe.pickThing();
       this.joe.turnLeft();
       this.joe.putThing(balon);
         
   
   }
    
    
}

