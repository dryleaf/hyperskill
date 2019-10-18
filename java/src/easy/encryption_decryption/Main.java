package easy.encryption_decryption;

/**
 * Stage 1/6...
 * Description:
 *
 * For the first stage, you need to manually encrypt the message "we found a treasure!" and print only the ciphertext (in lower case).
 * To encrypt the message, replace each letter with the letter that is in the corresponding position from the end of the English alphabet (a→z, b→y, c→x, ... x→c, y →b, z→a). Do not replace spaces or the exclamation mark.
 *
 * Use the given template to your program to print the ciphertext instead of the original message.
 *
 * The output should look like ## ##### # ########! where # is a lower-case English letter.
 *
 * @author Josimar Lopes
 */
public class Main {
    private static String encode(String str) {
        StringBuilder sb  = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (((int) ch) >= 97 && ((int) ch) <= 122) {
                char encryptedChar = (char) (97 + (122 - (int) ch));
                sb.append(encryptedChar);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
    public static void main(String... args) {
        System.out.println(encode("we found a treasure!"));
    }
}
