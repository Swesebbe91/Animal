package com.company;

public class Main {

    public static void main(String[] args) {


        GameBoard gameBoard = new GameBoard();


//        gameBoard.zebraList.userInputNumZebra();
//        gameBoard.zebraList.sizeOfZebraList();
//        gameBoard.cheetahList.userInputNumCheetahs();
//        gameBoard.cheetahList.sizeOfCheetahsList();


        gameBoard.printBoard();

    }
}

/*
            Scanner scan = new Scanner(System.in);
            System.out.println("*******************************");
            System.out.println("Skriv in storleken på Gameboard");
            System.out.println("*******************************");
            System.out.println("Antal rader: \r");
            int r = scan.nextInt();
            System.out.println("Antal kolumner: \r");
            int c = scan.nextInt();
            String[][] str = new String[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("[ ]");

                }
                System.out.println();
            }
        }
    }
}
*/
