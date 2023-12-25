import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class AesEncryptor {

    private static final String AES_ALGORITHM = "AES";
    private static final String AES_PADDING = "AES/ECB/PKCS5Padding";
    private static final String AES_SECRET_KEY = "MySecretKey12345"; // Change this to your own secret key

    public static String encrypt(String plainText) throws Exception {
        byte[] keyBytes = AES_SECRET_KEY.getBytes(StandardCharsets.UTF_8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, AES_ALGORITHM);
        Cipher cipher = Cipher.getInstance(AES_PADDING);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public static String decrypt(String encryptedText) throws Exception {
        byte[] keyBytes = AES_SECRET_KEY.getBytes(StandardCharsets.UTF_8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, AES_ALGORITHM);
        Cipher cipher = Cipher.getInstance(AES_PADDING);
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedText);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) throws Exception {
        String response = AesEncryptor.encrypt("Anmol@123");
        System.out.println(response);
    }
}
