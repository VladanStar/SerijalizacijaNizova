package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
	// write your code here
        int[] numbers = {1,2,3,4,5};
        String[] strings = {"John", "susan"," Kim"};
        // kreiranje izlaznog toka za datoteku array.txt
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("array.txt",true));

        // Pisanje niza u izlaz toka objekata
        output.writeObject(numbers);
        output.writeObject(strings);
        // zatvaranje toka
        output.close();

        // Kreiranje ulaznog toka za datoteku array.txt
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.txt"));

        int[] newNumbers = (int[])(input.readObject());
        String[] newStrings = (String[]) input.readObject();
        // prikaz niza
        for(int i =0;i<newNumbers.length;i++){
            System.out.print(newNumbers[i] + " ");
            System.out.println();
        }
        for(int i =0; i<newStrings.length;i++){
            System.out.print(newStrings[i] + " ");
        }
        // zatvaranje toka
        input.close();
    }
}
