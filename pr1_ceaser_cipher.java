import java.util.Scanner;
// 2021bit023 
public class pr1_ceaser_cipher {
    static StringBuilder enc = new StringBuilder();
    static StringBuilder dec = new StringBuilder();
    public static String ceaser(String plaintext) {
        enc.setLength(0); // Clear the StringBuilder before use
        for (char c : plaintext.toCharArray()) {
            enc.append((char)(c + 'v')); // Add 'a' to each character
        }
        return enc.toString();
    }
    public static String cipher() {
        dec.setLength(0); // Clear the StringBuilder before use
        String decryption = enc.toString();
        for (char c : decryption.toCharArray()) {
            dec.append((char)(c - 'v')); // Subtract 'a' from each character
        }
        return dec.toString();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plaintext:");
        String plaintext = sc.nextLine();
        String encrypted = ceaser(plaintext);
        System.out.println("Encrypted text: " + encrypted);
        String decrypted = cipher();
        System.out.println("Decrypted text: " + decrypted);
       
    }
}
