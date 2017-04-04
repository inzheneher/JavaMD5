import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());

        byte bytrData[] = md.digest();

        StringBuilder sb = new StringBuilder();

        for (byte aBytrData : bytrData) {
            String hex = Integer.toHexString(0xff & aBytrData);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        System.out.println(sb.toString());
    }
}
