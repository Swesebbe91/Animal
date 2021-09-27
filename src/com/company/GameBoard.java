package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameBoard {
    //Arrays för Zebra och Cheetah
    //"Tagg" för respektive Djur
    //Koppla Gameboard till animal
    //Koppla Gameboard till GameEngine
    //Skapa en ForLoop med vilkor
    CheetahList cheetahList = new CheetahList();
    ZebraList zebraList = new ZebraList();
    Cheetah cheetah=new Cheetah();
    Zebra zebra = new Zebra();

    private int r;
    private int c;
    private char[][] chr;

    public GameBoard() {
        this.r = r;
        this.c = c;
        createBoard();
        this.chr = new char[this.r][this.c];

    }

    public void setCoordinates(char[][] chr) {
        this.chr = chr;
    }

    public void setObjectOnLocation(char name, int x, int y) {
        this.chr[y][x] = name;
    }

    Scanner scan = new Scanner(System.in);

    public void createBoard() {

        Scanner scan = new Scanner(System.in);
        System.out.println("*****************");
        System.out.println("Skriv in storleken på Gameboard");
        System.out.println("*****************");
        System.out.println("Antal rader: \r");
        r = scan.nextInt();
        System.out.println("Antal kolumner: \r");
        c = scan.nextInt();
    }

    public void inputNumOfAnimals() {


        boolean numOfAnimals = true;

        while (numOfAnimals) {


                zebraList.userInputNumZebra();
                cheetahList.userInputNumCheetahs();
                numOfAnimals = false;
           }
            if (zebraList.sizeOfZebraList() >= cheetahList.sizeOfCheetahsList() && cheetahList.sizeOfCheetahsList() > 0) {
                System.out.println("Antal Zebror: " + zebraList.sizeOfZebraList());
                System.out.println("Antal Geparder: " + cheetahList.sizeOfCheetahsList());
                System.out.println("Let the party begin!");
                numOfAnimals = true;
            } else {
                zebraList.clear();
                cheetahList.clear();
                System.out.println("You have entered the wrong number of animals\n" +
                        "Game rules!: \n" +
                        "The amount of Zebras must be equal or more than the amount of cheetas,\n" + "the amount of animals can not be zero. \n");
            }
        }

        public void fillGameBoard () {
        Random random = new Random();
        inputNumOfAnimals();


            for (int i = 0; i < cheetahList.sizeOfCheetahsList(); i++) { //Hämtar antalet cheetas och lägger in de i vektorn på random plats.
                int number;
                int number2;

                cheetah.setX(number = random.nextInt(r));
                cheetah.setY(number2 = random.nextInt(c));
                chr[number][number2] = 'C';
                System.out.println(cheetah.getX() + "C x här");
                System.out.println(cheetah.getY() + "C y här");
            }

            for (int i = 0; i < zebraList.sizeOfZebraList(); i++) {//Hämtar antalet zebror och lägger in de i vektorn på random plats.


                int number;
                int number2;

                zebra.setX(number = random.nextInt(r));
                zebra.setY(number2 = random.nextInt(c));
                chr[number][number2] = 'Z';
                System.out.println(zebra.getX() + "Z x här");
                System.out.println(zebra.getY() + "Z y här");
            }
        }

        public void printBoard(){
        fillGameBoard();

        for (int i = 0; i < r; i++) {           //Antal rader som användaren skriver in
            for (int j = 0; j < c; j++) {        //Antal kolumer som användaren skriver in

                if (chr[i][j] == 0) {
                    chr[i][j] = ' ';
                }
                System.out.print("[" + chr[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("\n");

    }



}


// Begränsa användaren att skriva in mindre än board=10x10
// Begränsa användaren att skriva in för många djur.
