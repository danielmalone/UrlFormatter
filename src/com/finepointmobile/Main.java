package com.finepointmobile;

public class Main {

    public static void main(String[] args) {
        String original = "Mr John Smith    ";
        char[] text = original.toCharArray();

        formatUrl(text, 13);
    }

    private static void formatUrl(char[] text, int length) {

        int totalSpaces = 0;

        for (int i = length - 1; i >= 0; i--) {
            if (text[i] == ' ') {
                totalSpaces++;
            }
        }

        System.out.println("Total: " + totalSpaces);

        for (int i = length - 1; i >= 0; i--) {
            if (text[i] == ' ') {
                for (int j = length + 1; j >= i; j--) {
                    text[j + 1] = text[j];
                    text[j + 2] = text[j];
                }
            }
        }

        for (int i = length - 1; i >= 0; i--) {
            if (text[i] == ' ' && text[i - 1] == ' ' && text[i - 2] == ' ') {
                text[i - 2] = '%';
                text[i - 1] = '2';
                text[i] = '0';
            }
        }

        System.out.println(text);
    }
}
