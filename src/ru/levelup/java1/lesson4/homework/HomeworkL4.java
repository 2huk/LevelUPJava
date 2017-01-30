package ru.levelup.java1.lesson4.homework;

        import java.io.*;

/**
 * Created by anton on 27.01.2017.
 */
public class HomeworkL4 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        int userInput = 0;//1show 2 add 3 exit
        Contact[] strArr = new Contact[100];



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
                for (int i = 0; i < strArr.length; i++) {
                    if (strArr[i] == null) {
                        break;
                    }
                    System.out.println("ID: "+counter+"\t|Name:" + strArr[i].name + "\t|Phone:" + strArr[i].phone + "\t|Age:" + strArr[i].age + "|");

                }
            }
            if (userInput == 1) {
                try {
                    System.out.print("Введите Name");
                    strArr[counter].name = reader.readLine();
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод");

                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    System.out.print("Введите Phone");
                    strArr[counter].phone = reader.readLine();
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод");

                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    System.out.print("Введите Age");
                    strArr[counter].age = Integer.parseInt(reader.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод");

                } catch (IOException e) {
                    e.printStackTrace();
                }
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