package utils;

import com.github.javafaker.Faker;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import static io.restassured.RestAssured.when;
import static utils.RouteConstants.GET_ORGANIZACAO;
import static utils.UtilConstants.EN_US;

public class UtilsTest {

    private static Faker generate = new Faker(EN_US);

    /**
     * Gera um email aleatório via Java Faker
     * @return String email
     */
    public static String generateValidEmail() {
        return generate.internet().emailAddress();
    }

    /**
     * Obtem um email valido para criação de uma campanha
     * @return String email
     */
    public static String getOrganizationEmail() {
        return when().
                get(GET_ORGANIZACAO).
                then().log().all().
                statusCode(200).
                extract().
                path("data[0].email");
    }

    /**
     * Tira um print da tela e retorna em formato Base64.
     * @return String encodeBase64
     */
    public static String encondeImageBase64(String imagePath) throws IOException {

        byte[] fileContent = FileUtils.readFileToByteArray(new File(imagePath));
        String encodedString = java.util.Base64.getEncoder().encodeToString(fileContent);

        return encodedString;
    }

    /**
     * Tira um print da tela e retorna em formato Base64.
     * @return String imageEncodedBase64
     */
    public static String captureScreenShotBase64() {

        Rectangle screenSize = new
                Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage screenCapture = null;
        String base64Encoded = "";

        try {

            screenCapture = new Robot().createScreenCapture(screenSize);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(screenCapture, "png", baos);
            baos.flush();
            byte[] encodeBase64 = Base64.encodeBase64(baos.toByteArray());
            base64Encoded = new String(encodeBase64);
            baos.close();

        } catch (AWTException | IOException e) {
            e.getMessage();
        }

        return base64Encoded;
    }

}
