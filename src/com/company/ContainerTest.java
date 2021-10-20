package com.company;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    @org.junit.jupiter.api.Test
    void TestAddElementToArray() {
        try {
            Container intArray2 = new Container();
            intArray2.addElementToArray(3);
            intArray2.addElementToArray(5);
            intArray2.addElementToArray(6);
            intArray2.addElementByIndex(4, 1);
            assertEquals("3 5 4 6", intArray2.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void TestAddElementByIndex() {
        try {
            Container intArray2 = new Container();
            intArray2.addElementToArray(3);
            intArray2.addElementByIndex(9, 0);
            intArray2.addElementToArray(5);
            intArray2.addElementToArray(8);
            intArray2.addElementByIndex(9, 2);
            assertEquals("3 9 5 9 8", intArray2.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    @org.junit.jupiter.api.Test
    void TestRemoveElement() {
        try {
            Container intArray2 = new Container();
            intArray2.addElementToArray(3);
            intArray2.addElementToArray(5);
            intArray2.addElementToArray(8);
            intArray2.removeElement(1);
            assertEquals("3 8", intArray2.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    void TestPopElement() {
        try {
            Container intArray2 = new Container();
            intArray2.addElementToArray(3);
            intArray2.addElementByIndex(9, 0);
            intArray2.addElementToArray(5);
            intArray2.addElementToArray(8);
            intArray2.addElementByIndex(9, 2);
            intArray2.removeElement(1);
            intArray2.removeElement(2);
            String h = intArray2.PopElement(0) + " ";
            assertEquals("3 ", h);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}