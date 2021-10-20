package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Container arrayy = new Container();

        Scanner scanner = new Scanner(System.in);

        /*
        dynamicArrayTest.addElementToArray(10);
        dynamicArrayTest.addElementToArray(20);
        dynamicArrayTest.addElementToArray(30);
        dynamicArrayTest.addElementToArray(40);
        dynamicArrayTest.addElementToArray(50);

*/


            int n = 0;
            while (n != 4) {
                System.out.println("    ");
                System.out.println("0. Adding an element in the array:  ");
                System.out.println("1. Adding an element in the array after indicated position:  ");
                System.out.println("2. Deleting the last element from the array:  ");
                System.out.println("3. Extraction the element by index :  ");
                System.out.println("4. Exit:  ");

                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                } else {
                    System.out.println("You have input non integer number of operation  ");
                    break;
                    //System.in.skip(System.in.available());
                }

                switch (n) {
                    case 0: {
                        //Scanner scanner = new Scanner(System.in);
                        System.out.print("Please, input the integer number: ");
                        if (scanner.hasNextInt()) {
                            int j = scanner.nextInt();
                            System.out.println(j);

                            arrayy.addElementToArray(j);
                            System.out.print(arrayy.toString() + " ");
                        } else {
                            System.out.println("You have input non integer number");
                        }
                    }
                    ;
                    break;
                    case 1: {
                        //Scanner scanner = new Scanner(System.in);
                        System.out.print("Please, input the integer number of an element u want to insert: ");
                        System.out.print("Please, input the integer number of a position after which u want to insert an element: ");
                        if (scanner.hasNextInt()) {
                            int num = scanner.nextInt();
                            int position = scanner.nextInt();
                            System.out.println(num + "  " + position);


                            arrayy.addElementByIndex(num, position);
                            System.out.print(arrayy.toString() + " ");
                        } else {
                            System.out.println("You have input non integer number");
                        }
                    }
                    ;
                    break;
                    case 2: {
                        //Scanner scanner = new Scanner(System.in);
                        System.out.print("Please, input the integer number of position which element you want to delete: ");
                        if (scanner.hasNextInt()) {
                            int j = scanner.nextInt();
                            System.out.println(j);
                            try {
                                arrayy.removeElement(j);
                            } catch (MyException e) {
                                System.out.print(e.getMessage());
                            }
                            arrayy.shrinkSize();
                            System.out.print(arrayy.toString() + " ");
                        } else {
                            System.out.println("You have input non integer number");
                        }
                    }
                    ;
                    break;
                    case 3: {
                        //Scanner scanner = new Scanner(System.in);
                        System.out.print("Please, input the integer number of position of element you want to extract: ");
                        if (scanner.hasNextInt()) {
                            int j = scanner.nextInt();
                            System.out.println(j);

                            System.out.println("Your element:   ");
                            try {
                                System.out.print(arrayy.PopElement(j));
                            } catch (MyException e) {
                                System.out.print(e.getMessage());
                            }

                        } else {
                            System.out.println("You have input non integer number");
                        }
                    }
                    ;
                    break;
                    case 4: break;
                    default:
                        System.out.println("You have input an incorrect number of operation ");
                        break;

                }
            }

        }
    }
