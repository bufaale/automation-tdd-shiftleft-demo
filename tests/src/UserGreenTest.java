package src;

import org.junit.jupiter.api.Test;
import java.net.HttpURLConnection;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserGreenTest {

    @Test
    public void shouldReturn405WhenServiceIsRunning() throws Exception {
        URL url = new URL("http://localhost:8080/users");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int statusCode = connection.getResponseCode();

        assertEquals(405, statusCode);
    }

}
