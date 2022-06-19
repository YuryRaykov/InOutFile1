package ru.netology;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String[] text = new String[9];
        text[0] = "Каталог src создан";
        text[1] = "Каталог res создан";
        text[2] = "Каталог savegames создан";
        text[3] = "Каталог temp создан";
        text[4] = "Каталог main создан";
        text[5] = "Каталог test создан";
        text[6] = "Создан файл Main.java";
        text[7] = "Создан файл Util.java";
        text[8] = "Каталог drawables создан";

        String[] textn = new String[3];
        textn[0] = "Каталог vectors создан";
        textn[1] = "Каталог icons создан";
        textn[2] = "Файл temp.txt создан";

        String[] textDir = new String[12];
        textDir[0] = "D://Games/src";
        textDir[1] = "D://Games/res";
        textDir[2] = "D://Games/savegames";
        textDir[3] = "D://Games/temp";
        textDir[4] = "D://Games/temp/main";
        textDir[5] = "D://Games/src/test";
        textDir[6] = "D://Games/res/icons";
        textDir[7] = "Каталог vectors создан";
        textDir[8] = "Каталог icons создан";
        textDir[9] = "D://Games/res/drawables";
        textDir[10] = "D://Games/res/vectors";
        textDir[11] = "Файл temp.txt создан";

        String[] textFile = new String[3];
        textFile[0] = "D://Games/temp/main//Main.java";
        textFile[1] = "D://Games/temp/main//Utils.java";
        textFile[2] = "D://Games/temp//temp.txt";

        StringBuilder temp1 = new StringBuilder("Создали папку Games" + '\n');

        for (int i = 0; i < 9; i++) {
            File dir = new File(textDir[i]);
            if (dir.mkdir()) {
                temp1.append(text[i] + '\n');
            }
        }

        for (int i = 0; i < 3; i++) {
            File mainFile = new File(textFile[i]);
            try {
                if (mainFile.createNewFile())
                    temp1.append(text[i] + '\n');
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        String result = temp1.toString();

        try (FileWriter writer = new FileWriter("D://Games/temp//temp.txt", false)) {
            writer.write(result);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileReader reader = new FileReader("temp.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage(
            ));
        }

    }
}
