/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5_1;

import becker.robots.*;
/**
 *
 * @author Usuario
 */
public class Ladrillos {
    private Robot joe;
    private City unal;
    private Thing balon;
    private Wall pared;
    private boolean a[][];
    
public Ladrillos(){
      this.a=new boolean [5][5];
      this.unal=new City(10,13);
      this.joe=new Robot(unal,9,1,Direction.NORTH);
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                if(i==0 || i==4){
                    if(j % 2 !=0){
                    this.a[i][j]=true;
                    this.balon=new Thing(unal,i+4,j+1);}
                }
                if(j==4 || j==0){
                    if(i % 2 !=0){
                    this.a[j][i]=true;
                    this.balon=new Thing(unal,i+4,j+1);}
                }
            }
        }
    }


    /*public void mover(){
        boolean b[][]=new boolean [5][5];
        joe.move();
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                if(joe.canPickThing()==true){
                    
                    if(i==0 && j>0){
                        joe.pickThing();
                        b[i][j-1]=true;
                    }
                    if(i==1 && j>0){
                        joe.pickThing();
                        b[j-1][4]=true;
                    }
                    if(i==2){
                        joe.pickThing();
                        b[4][4-j]=true;
                    }
                    if(i==3 && j<4){
                        joe.pickThing();
                        b[4-j][0]=true;
                    }
                }
                if (j==4){
                    break;
                }
                joe.move();
            }
            if(i==3){break;}
            for(int k=0;k<=2;k++){
                joe.turnLeft();
            }
        }
        System.out.println(joe.countThingsInBackpack());
        joe.turnLeft();
        joe.move();
        joe.turnLeft();
        for(int i=0;i<=5;i++){
            joe.move();
        }
        joe.turnLeft();
        for(int j=0; j<=3;j++){
            joe.move();
        }
        for(int i=0;i<=4;i++){
            for(int j=0;j<=4;j++){
                if(i==0 && j>0){
                    if(b[i][j-1]==true){joe.putThing();}
                }
                if(i==1 && j>0){
                    if(b[j-1][4]==true){joe.putThing();}
                }
                if(i==2 && j<4){
                    if(b[4][4-j]==true){joe.putThing();}
                }
                if(i==3 && j<4){
                    if(b[4-j][0]==true){joe.putThing();}
                }
                if (j==4){
                    break;
                }
                joe.move();
            }
            if(i<=2){
            for(int k=0;k<=2;k++){
                joe.turnLeft();
            }}
            
        }
    }
*/

public void mover(){
    
    int x = 0; //Para manejar las filas
      int y = 0; //Para manejar las columnas
      int flag = 3;  //Bandera para saber que recorrido se debe realizar
      int n = 0; //Contador de elementos
      
      //Total de elementos en la matriz
      int elementos = this.a.length * this.a[0].length;
 
      // Recorrido en espiral
      //System.out.println("\nMostrando recorrido en espiral");
      while (n < elementos) {
         //System.out.println("\nFlag : " + flag);
         switch (flag) {
         case 0: // Recorrido de izquierda a derecha
             
             this.joe.move();
             for (int m = x; m <= this.a[0].length - y-1; m++) {
               System.out.print(" " + this.a[x][m]);
               if(this.joe.canPickThing()){
                   this.joe.pickThing();
                   this.a[x][m]=true;
               }
               this.joe.move();
               n++;
               
            }
                        
                     
            flag++;
            for (int i=0;i<3;i++){
                 this.joe.turnLeft();
             }
            break;
 
            case 1: //Recorrido de arriba abajo
         
             
             this.joe.move();        
            for (int m = x + 1; m < this.a.length - x+1 ; m++) {
               System.out.print(" " + this.a[m][this.a[0].length - 1 - y]);
               if(this.joe.canPickThing()){
                   this.joe.pickThing();
                   this.a[m][this.a[0].length - 1 - y]=true;
               }
               this.joe.move();
               
               n++;
               
            }
                      
            flag++;
            for (int i=0;i<3;i++){
                 this.joe.turnLeft();
             }
            break;
 
         case 2: //Recorrido de derecha a izquierda
             
             
             this.joe.move();
            for (int m = this.a[0].length - 1 - y; m >= y; m--) {
               System.out.print(" " + this.a[this.a.length - 1 - x][m]);
               if(this.joe.canPickThing()){
                   this.joe.pickThing();
                   this.a[this.a.length - 1 - x][m]=true;
               }
               this.joe.move();
               n++;
               
            }
                     
            flag++;
            for (int i=0;i<3;i++){
                 this.joe.turnLeft();
             }
            break;
 
         case 3: //Recorrido de abajo a arriba
             
             
             this.joe.move();
            for (int m = this.a.length - 1 - x; m >= x + 1; m--) {
               System.out.print(" " + this.a[m][y]);
               if(this.joe.canPickThing()){
                   this.joe.pickThing();
                   this.a[m][y]=true;
               }
               this.joe.move();
               n++;
               
            }
                
             
             
            flag = 0;
            //Se aumentan las filas y las columnas para un subnivel en el espiral
            x++;
            y++;
            for (int i=0;i<3;i++){
                 this.joe.turnLeft();
             }
            break;
         } 
 
    }
      this.joe.move();
}
}
