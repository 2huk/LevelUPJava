package ru.levelup.java1.lesson6.homework.incapsulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
                for (int i = 0; i < contactList.size(); i++) {
                    if (contactList.get(i) == null) {
                        break;
                    }
                    System.out.println("ID: " + i + "\t|Name:" + ((contactList.get(i)).getName()) + "\t|Phone:" + (contactList.get(i)).getPhone() + "\t|Age:" + (contactList.get(i)).getAge() + "|");

                }
            }
            if (userInput == 1) {
                Contact contact = new Contact();

                String tempName = new String();
                String tempPhone = new String();
                int tempAge = 0;

                try {
                    System.out.print("Введите Name");
                    contact.setName(reader.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод");

                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    System.out.print("Введите Phone");
                    contact.setPhone(reader.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод");

                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    System.out.print("Введите Age");
                    contact.setAge(Integer.parseInt(reader.readLine()));
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
