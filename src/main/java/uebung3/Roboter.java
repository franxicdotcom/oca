package uebung3;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Roboter {

    private int size = 10;
    private int vert = (size-1)/2; //Koordinaten
    private int hor = (size-1)/2; //Koordinaten
    private int direction = 1;//0 nach oben, 1 rechts, 2 unten, 3 links

    public void move(int direction) throws InterruptedException {
        switch (direction){
            case 0:{ //naqch oben wenn möglich
                if (vert>=0)vert--;
                printField();
                TimeUnit.SECONDS.sleep(1);
                break;
            }
            case 1:{//naqch rechts wenn möglich
                if (hor<size-1)hor++;
                printField();
                TimeUnit.SECONDS.sleep(1);
                break;
            }
            case 2:{ //nach unten wenn möglich
                if (vert<size-1)vert++;
                printField();
                TimeUnit.SECONDS.sleep(1);
                break;
            }
            case 3:{//naqch links wenn möglich
                if (hor>=0)hor--;
                printField();
                TimeUnit.SECONDS.sleep(1);
                break;
            }
        }
        
    }
    
    public void getMove(char a){
        int newDirection = 0;
        switch (a) {
            case '<': {//rückwärts
                int oppositeDirection = (direction + 2) % 4;
                try {
                    move(oppositeDirection);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
            case '>': {//vorwärts
                try {
                    move(direction);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
            case 'r': {//Drehung nach rechts
                direction = (direction +1) % 4;
                System.out.println("Roboter wurde nach rechts gedreht");
                break;
            }
            case 'l': {//Drehung nach links
                direction = (direction -1) % 4;
                System.out.println("Roboter wurde nach links gedreht");
                break;
            }
            case '\n': break;
        }   
    }
    
    public void printField(){
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++) {
                if (i==vert && j==hor) System.out.print("@");
                else System.out.print("x");
                if (j == size-1)System.out.print("\n");
            }
        }
        System.out.println();
    }

    public void stringToAction(String action){
        for (int i = 0; i < action.length(); i++) {
            getMove(action.charAt(i));
        }
    }
}
