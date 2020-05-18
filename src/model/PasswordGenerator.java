package model;

import java.util.Random;

public class PasswordGenerator {

    private Random random;

    private char[] rus = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
    private char[] RUS = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
    private char[] eng = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private char[] ENG = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};


    private int maxLenght;
    private char[] Array;
    boolean isFirst = true;

    public PasswordGenerator(int maxLenght, Random random) {
        this.maxLenght = maxLenght;
        this.random = random;
        Array = new char[maxLenght];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = '*';
        }
    }

    public void PasRus (){
        for (int i = 0; i < Array.length; i++) {
            if (isFirst) {
                Array[i] = rus[random.nextInt(rus.length - 1)];
            }
        }
        isFirst = false;
        for (int i = 0; i < 4; i++) {
            Array[random.nextInt(Array.length - 1)] = rus[random.nextInt(rus.length - 1)];
        }
    }

    public void PasRUS (){
        for (int i = 0; i < Array.length; i++) {
            if (isFirst) {
                Array[i] = RUS[random.nextInt(RUS.length - 1)];
            }
        }
        isFirst = false;
        for (int i = 0; i < 4; i++) {
            Array[random.nextInt(Array.length - 1)] = RUS[random.nextInt(RUS.length - 1)];
        }
    }

    public void PasEng (){
        for (int i = 0; i < Array.length; i++) {
            if (isFirst) {
                Array[i] = eng[random.nextInt(eng.length - 1)];
            }
        }
        isFirst = false;
        for (int i = 0; i < 4; i++) {
            Array[random.nextInt(Array.length - 1)] = eng[random.nextInt(eng.length - 1)];
        }
    }

    public void PasENG (){
        for (int i = 0; i < Array.length; i++) {
            if (isFirst) {
                Array[i] = ENG[random.nextInt(ENG.length - 1)];
            }
        }
        isFirst = false;
        for (int i = 0; i < 4; i++) {
            Array[random.nextInt(Array.length - 1)] = ENG[random.nextInt(ENG.length - 1)];
        }
    }



    public void PasNums (){
        for (int i = 0; i < Array.length; i++) {
            if (isFirst) {
                Array[i] = nums[random.nextInt(nums.length - 1)];
            }
        }
        isFirst = false;
        for (int i = 0; i < 4; i++) {
            Array[random.nextInt(Array.length - 1)] = nums[random.nextInt(nums.length - 1)];
        }
    }

    public String toString() {
        String passwordString = new String(Array);
        return passwordString;
    }
}
