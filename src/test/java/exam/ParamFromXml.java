package exam;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by ASUS PC on 20.11.2016.
 */
public class ParamFromXml {

    @Test
    @Parameters({"email", "password"})
    public void testA(String email, String password) {
        System.out.println(email + " / "+ password);
    }

}
