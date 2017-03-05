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
    public void mover(){
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
}
