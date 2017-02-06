package ru.levelup.java1.lesson6.homework.standardcollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by anton on 30.01.2017.
 */
public class Lesson5HW {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        int userInput = 0;//1show 2 add 3 exit
        ArrayList<Contact> contactList = new ArrayList<Contact>();


        while (true) {
            try {
                System.out.print("1 - Add contact\n" +
                        "2 - Show contacts\n" +
                        "3 - Edit contact\n" +
                        "4 - Remove contact\n" +
                        "5 - Search contact\n" +
                        "6 - Quit\n");
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
                    Contact tempContact = contactList.get(i);
                    System.out.println("ID: " + i + "\t|Name:" + tempContact.getName() + "\t|Phone:" + tempContact.getPhone() + "\t|Age:" + tempContact.getAge() + "|");

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
                String nameToChange = new String();
                try {
                    System.out.print("Введите имя контакта, который необходимо заменить\n");
                    nameToChange = reader.readLine();
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод");

                } catch (IOException e) {
                    e.printStackTrace();
                }


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
                for (int i = 0; i < (contactList.size()); i++) {
                    Contact tempContact = contactList.get(i);
                    if (tempContact.getName().equals(nameToChange)) {
                        contactList.set(i, contact);

                    }
                }
            }
            if (userInput == 4) {
                String nameToRemove = new String();
                try {
                    System.out.print("Введите имя контакта, который необходимо удалить\n");
                    nameToRemove = reader.readLine();
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод");

                } catch (IOException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < (contactList.size()); i++) {
                    Contact tempContact = contactList.get(i);
                    if (tempContact.getName().equals(nameToRemove)) {
                        contactList.remove(i);
                        i--;
                    }
                }

            }
            if (userInput == 5) {
                String nameToFind = new String();
                try {
                    System.out.print("Введите имя контакта,который нужно найти\n");
                    nameToFind = reader.readLine();
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод");

                } catch (IOException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < (contactList.size()); i++) {
                    Contact tempContact = contactList.get(i);
                    if (tempContact.getName().equals(nameToFind)) {
                        System.out.println("ID: " + i + "\t|Name:" + tempContact.getName() + "\t|Phone:" + tempContact.getPhone() + "\t|Age:" + tempContact.getAge() + "|");
                    }
                }

            }
            if (userInput == 6) {

                return;
            }

        }
    }
}
