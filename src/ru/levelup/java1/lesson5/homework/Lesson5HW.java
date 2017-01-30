package ru.levelup.java1.lesson5.homework;

import java.io.*;

/**
 * Created by anton on 30.01.2017.
 */
public class Lesson5HW {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        int userInput = 0;//1show 2 add 3 exit
        MyContactList contactList = new MyContactList();



        while (true) {
            try {
                System.out.print("1 - Add contact\n" +
                        "2 - Show contacts\n" +
                        "3 - Quit\n");
                userInput = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод");

            } catch (IOException e) {
                e.printStackTrace();
            }
            if (userInput == 2) {
                for (int i = 0; i < contactList.contacts.length; i++) {
                    if (contactList.get(i) == null) {
                        break;
                    }
                    System.out.println("ID: " + i + "\t|Name:" + ((contactList.get(i)).name) + "\t|Phone:" + (contactList.get(i)).phone + "\t|Age:" + (contactList.get(i)).age + "|");

                }
            }
            if (userInput == 1) {
                Contact contact = new Contact();

                String tempName = new String();
                String tempPhone = new String();
                int tempAge = 0;

                try {
                    System.out.print("Введите Name");
                    contact.name = reader.readLine();
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод");

                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    System.out.print("Введите Phone");
                    contact.phone = reader.readLine();
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод");

                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    System.out.print("Введите Age");
                    contact.age = Integer.parseInt(reader.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод");

                } catch (IOException e) {
                    e.printStackTrace();
                }
                contactList.add(contact);
                //System.out.println("ID: "+counter+"\t|Name:" + strArr[counter].name + "\t|Phone:" + strArr[counter].phone + "\t|Age:" + strArr[counter].age + "|");
                counter++;
                System.out.println();
            }
            if (userInput == 3) {
                return;
            }
        }
    }
}
