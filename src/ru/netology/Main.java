package ru.netology;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder temp1 = new StringBuilder("Создали папку Games" + '\n');

        File dir1 = new File("D://Games/src");
        if (dir1.mkdir()) {
            temp1.append("Каталог src создан" + '\n');
        }

        File dir2 = new File("D://Games/res");
        if (dir2.mkdir()) {
            temp1.append("Каталог res создан" + '\n');
        }

        File dir3 = new File("D://Games/savegames");
        if (dir3.mkdir()) {
            temp1.append("Каталог savegames создан" + '\n');
        }

        File dir4 = new File("D://Games/temp");//
        if (dir4.mkdir()) {
            temp1.append("Каталог temp создан" + '\n');
        }

        File dir5 = new File("D://Games/temp/main");//
        if (dir5.mkdir()) {
            temp1.append("Каталог main создан" + '\n');
        }

        File dir6 = new File("D://Games/src/test");
        if (dir6.mkdir()) {
            temp1.append("Каталог test создан" + '\n');
        }

        File mainFile1 = new File("D://Games/temp/main//Main.java");//
        try {
            if (mainFile1.createNewFile())
                temp1.append("Создан файл Main.java" + '\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File mainFile2 = new File("D://Games/temp/main//Utils.java");//
        try {
            if (mainFile2.createNewFile())
                temp1.append("Создан файл Util.java" + '\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File dir7 = new File("D://Games/res/drawables");
        if (dir7.mkdir()) {
            temp1.append("Создан файл Util.java" + '\n');
        }

        File dir8 = new File("D://Games/res/vectors");
        if (dir8.mkdir()) {
            temp1.append("Каталог vectors создан" + '\n');
        }

        File dir9 = new File("D://Games/res/icons");
        if (dir9.mkdir()) {
            temp1.append("Каталог icons создан" + '\n');
        }

        File mainFile3 = new File("D://Games/temp//temp.txt");//
        try {
            if (mainFile3.createNewFile())
                temp1.append("Файл temp.txt создан" + '\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String result = temp1.toString();

        try (FileWriter writer = new FileWriter("D://Games/temp//temp.txt", false)) {
            writer.write(result);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

//        try (FileReader reader = new FileReader("temp.txt")) {
//            int c;
//            while ((c = reader.read()) != -1) {
//                System.out.print((char) c);
//            }
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage(
//            ));
//        }

    }
}
