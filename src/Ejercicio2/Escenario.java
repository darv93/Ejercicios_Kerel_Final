package Ejercicio2;
import becker.robots.*;


public class Escenario {
    
    private Robot joe;
    private City Escenario;
    private Wall pared;
    private Thing balon;
    
    public Escenario(){
        
      this.Escenario = new City(12,9);
      this.joe = new Robot (Escenario,6,2,Direction.NORTH);
     
    
    }
    
   public void PintarEscenario(){
    
        for (int i=1; i<6;i++){
            this.pared = new Wall(Escenario,i,1,Direction.WEST);
        }
        
        for (int i=1;i<4;i++){
            this.pared = new Wall(Escenario,1,i,Direction.NORTH);
        }
        
        for (int i=1; i<6;i++){
            this.pared = new Wall(Escenario,i,4,Direction.WEST);
        }
        
        for (int i=4;i<7;i++){
            this.pared = new Wall(Escenario,1,i,Direction.NORTH);
        }
        
        for (int i=1; i<6;i++){
            this.pared = new Wall(Escenario,i,7,Direction.WEST);
        }
        
        for (int i=7;i<10;i++){
            this.pared = new Wall(Escenario,1,i,Direction.NORTH);
        }
        
        for (int i=1; i<6;i++){
            this.pared = new Wall(Escenario,i,9,Direction.EAST);
        }
        
        
        this.pared = new Wall(Escenario,5,1,Direction.SOUTH);
        this.pared = new Wall(Escenario,5,3,Direction.SOUTH);
        this.pared = new Wall(Escenario,5,4,Direction.SOUTH);
        this.pared = new Wall(Escenario,5,6,Direction.SOUTH);
        this.pared = new Wall(Escenario,5,7,Direction.SOUTH);
        this.pared = new Wall(Escenario,5,9,Direction.SOUTH);        
        

    }
   
   
   public void Numero(int a, int x, int y){
       
       if (a==0){
           
           for (int i =0;i<5;i++){
              this.balon = new Thing(Escenario,y+i,x);
            }
                      
           for (int i =0;i<3;i++){
              this.balon = new Thing(Escenario,y,i+x);
            }
           
           for (int i =0;i<5;i++){
              this.balon = new Thing(Escenario,y+i,x+2);
            }
           
           for (int i =0;i<3;i++){
              this.balon = new Thing(Escenario,y+4,i+x);
            }
       }
       
       if(a==1){
            for (int i =0;i<5;i++){
              this.balon = new Thing(Escenario,y+i,2+x);
            }
       
       }
       
       if (a==2){
           for (int i =0;i<3;i++){
              this.balon = new Thing(Escenario,y,i+x);
            }
           for (int i =0;i<3;i++){
              this.balon = new Thing(Escenario,y+2,i+x);
            }
           for (int i =0;i<3;i++){
              this.balon = new Thing(Escenario,y+4,i+x);
            }
           this.balon = new Thing(Escenario,y+1,x+2);
           this.balon = new Thing(Escenario,y+3,x);
       }
       
       if(a==3){
           for (int i =0;i<3;i++){
              this.balon = new Thing(Escenario,y,i+x);
            }
           
            for (int i =0;i<3;i++){
              this.balon = new Thing(Escenario,y+2,i+x);
            }
           
           for (int i =0;i<3;i++){
              this.balon = new Thing(Escenario,y+4,i+x);
            }
           
           for (int i =0;i<5;i++){
              this.balon = new Thing(Escenario,y+i,x+2);
            }
       
       }
       
       if(a==4){
           for (int i=0;i<2;i++){
               this.balon = new Thing(Escenario,i+y,x);
           }
           
           for (int i =0;i<3;i++){
              this.balon = new Thing(Escenario,y+2,i+x);
            }
           for (int i =0;i<5;i++){
              this.balon = new Thing(Escenario,y+i,x+2);
            }
       
       }
       
       if(a==5){
           for (int i =0;i<3;i++){
              this.balon = new Thing(Escenario,y,i+x);
            }
           for (int i =0;i<3;i++){
              this.balon = new Thing(Escenario,y+2,i+x);
            }
           for (int i =0;i<3;i++){
              this.balon = new Thing(Escenario,y+4,i+x);
            }
           this.balon = new Thing(Escenario,y+1,x);
           this.balon = new Thing(Escenario,y+3,x+2);
       
       }
   
   }
   
    public void PintarNumero(int a,int b, int c){
    Numero(a,1,1);
    Numero(b,4,1);
    Numero(c,7,1);
    
    
    }
    
    public void recorrer(){
        
        boolean a=false,b=false,c=false,d=false,e=false,f=false,g=false;
        this.joe.move();
        this.joe.move();
        this.joe.move();
            
            
            this.joe.move();
            this.joe.turnLeft();
            this.joe.move();
            if (this.joe.canPickThing()){
                a=true;}
            this.joe.turnLeft();
            this.joe.turnLeft();
            
            this.joe.move();
            this.joe.turnLeft();
            this.joe.move();
            if (this.joe.canPickThing()){
                b=true;}
            this.joe.turnLeft();
            this.joe.turnLeft();
            
            this.joe.move();
            this.joe.turnLeft();
            this.joe.move();
            if (this.joe.canPickThing()){
                c=true;}
            this.joe.turnLeft();
            this.joe.turnLeft();
            
            this.joe.move();
            this.joe.turnLeft();
            this.joe.move();
            if (this.joe.canPickThing()){
                d=true;}
            this.joe.turnLeft();
            this.joe.turnLeft();
            
            
this.joe.turnLeft();
this.joe.turnLeft();
            
            
            this.joe.move();
            this.joe.turnLeft();
            this.joe.move();
            if (this.joe.canPickThing()){
                e=true;}
            this.joe.turnLeft();
            this.joe.turnLeft();
            
            this.joe.move();
            this.joe.turnLeft();
            this.joe.move();
            if (this.joe.canPickThing()){
                f=true;}
            this.joe.turnLeft();
            this.joe.turnLeft();
            
            this.joe.move();
            this.joe.turnLeft();
            this.joe.move();
            if (this.joe.canPickThing()){
                g=true;}
            this.joe.turnLeft();
            this.joe.turnLeft();
            
            this.joe.move();
            this.joe.turnLeft();
            this.joe.turnLeft();
            this.joe.turnLeft();
            
            if(a&&b&&c&&!d&&e&&f&&g==true){
                System.out.print("0");}
            if(!a&&!b&&c&&!d&&e&&!f&&!g==true){
                System.out.print("1");}
            if(!a&&b&&c&&d&&!e&&f&&g==true){
                System.out.print("2");}
            if(!a&&b&&c&&d&&e&&f&&!g==true){
                System.out.print("3");}
            if(a&&!b&&c&&d&&e&&!f&&!g==true){
                System.out.print("4");}
            if(a&&b&&!c&&d&&e&&f&&!g==true){
                System.out.print("5");}
            if(a&&b&&!c&&d&&e&&f&&g==true){
                System.out.print("6");}
            if(!a&&b&&c&&!d&&e&&!f&&!g==true){
                System.out.print("7");}
            if(a&&b&&c&&d&&e&&f&&g==true){
                System.out.print("8");}
            if(a&&b&&c&&d&&e&&f&&!g==true){
                System.out.print("9");}
        
    }
   
    public void RetornarNumero(){
        recorrer();
        this.joe.move();
        this.joe.move();
        this.joe.turnLeft();
        this.joe.move();
        this.joe.move();
        this.joe.move();
        this.joe.turnLeft();
        recorrer();
        this.joe.move();
        this.joe.move();
        this.joe.turnLeft();
        this.joe.move();
        this.joe.move();
        this.joe.move();
        this.joe.turnLeft();
        recorrer();
        
    }
   
}

