package pr1;

import java.util.Scanner;

public class pr1_ceaser_cipher {
    static StringBuilder enc = new StringBuilder();
    static StringBuilder dec = new StringBuilder();
    
    public static String ceaser(String plaintext, int shift) {
        enc.setLength(0); 
        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                enc.append((char) ((c - base + shift) % 26 + base));
            } else {
                enc.append(c); 
            }
        }
        return enc.toString();
    }

    public static String cipher(String encryptedText, int shift) {
        dec.setLength(0); 
        
        for (char c : encryptedText.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                dec.append((char) ((c - base - shift + 26) % 26 + base));
            } else {
                dec.append(c); 
            }
        }
        return dec.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plaintext:");
        String plaintext = sc.nextLine();
        System.out.println("Enter the shift value:");
        int shift = sc.nextInt();

        String encrypted = ceaser(plaintext, shift);
        System.out.println("Encrypted text: " + encrypted);

        String decrypted = cipher(encrypted, shift);
        System.out.println("Decrypted text: " + decrypted);
    }
}
