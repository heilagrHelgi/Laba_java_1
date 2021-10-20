package com.company;
/**
 * This is a Container class, that uses to store objects
 *
 * @author Oleg Pirovskikh
 * intArray - our array that we will use
 * size - a variable means the number of elements in intArray
 * capacity - a variable to show an amount of free space in intArray
 */

public class Container {
    int[] intArray;
    int size;
    int capacity;

    /**
     * This is a constructor where we initialize our array
     */
    public Container() {
        intArray = new int[2];
        size = 0;
        capacity = 2;
    }

    /**
     * This method is used to add the element to the end
     * @param a uses for getting input the element to add it to array
     */
    public void addElementToArray(int a) {
        if (size == capacity) {
            increaseArraySize();
        }
       // if(){
        intArray[size] = a;
        size++;
    }

    /**
     * This is a method to add the element to the position following which were set as a parameter
     *
     * @param a is used to transmit the value of the element u want to add
     * @param k is used to transmit the position of the element u want to add
     */
    public void addElementByIndex(int a, int k) {
        if ((k < capacity) && (k >= 0)) {
            if (size == capacity) {
                increaseArraySize();
            }
            for (int i = 0; i < size; i++) {
                if (i == k) {
                    size++;// Увеличиваем кол-во

                    for (int j = size - 1; j > i + 1; j--) {  // сдвиг

                        intArray[j] = intArray[j - 1];
                    }

                    intArray[i + 1] = a;
                    // Вставка нового элемента
                    i++;  // Обход нового элемента
                }
            }
        }
    }


    /**
     * This is a method to increase the capacity of the array, when we want to add some element, but our size is full
     */
    public void increaseArraySize() {
        int[] tempArray = null;
        if (size == capacity) {
            tempArray = new int[capacity * 2];
            {
                if (capacity >= 0) {
                    System.arraycopy(intArray, 0, tempArray, 0, capacity);
                }
            }
        }
        intArray = tempArray;
        capacity = capacity * 2;
    }

    /**
     * This is a method to delete unnecessary space after increasing the array
     */
    public void shrinkSize() {
        int[] temp;
        if (size > 0) {
            temp = new int[size];
            System.arraycopy(intArray, 0, temp, 0, size);
            capacity = size;
            intArray = temp;
        }
    }

    /**
     * This is a method to delete an element standing at the definite position
     *
     * @param posItion is used for needed position of removing
     * @throws MyException indicates that we are trying to delete the nonexistent element or to refer to nonexistent index
     */
    public void removeElement(int posItion) throws MyException {
        if ((size > 0) && (posItion >= 0) && (posItion < size)) {
            for (int i = posItion; i < size - 1; i++) {
                intArray[i] = intArray[i + 1];
            }
        }
        //intArray[size] = 0;
        size--;
        throw new MyException("User has input wrong position    ");
    }

    /**
     * This is a method to pop element needed
     *
     * @param i used for index of the element we want to pop
     * @return element which is located at the desired index
     * @throws MyException indicates that we are trying to pop nonexistent index
     */
    public int PopElement(int i) throws MyException {
        if ((i > size - 1)|| (i < 0))
             System.out.println("Invalid number of Element");
        else {
            return intArray[i];
        }
        throw new MyException("User has input wrong position    ");
    }

    /**
     * The method to indicate that our array is empty
     *
     * @return true, when its empty, or false when is full
     */
    public boolean isEmpty() {
        return (size == 0);
    }

    /**
     * The method to convert the elements of our array to String type and to output as a line
     *
     * @return the line, which consists of elements of array
     */
    @Override public String toString() {
        String list = new String("");

        if (isEmpty()) {
            return list;
        }
        int[] intArray2 = new int[] {1, 2, 3};
        for (int i = 0; i < size; i++) {
            //int tmp1 = intArray2[i];
            String tmp = Integer.toString(intArray[i]);
            list += tmp.toString() + " ";
        }
        list = list.substring(0, list.length()-1);
        return list;

    }
}

