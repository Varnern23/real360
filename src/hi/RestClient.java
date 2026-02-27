import java.util.Scanner;
import org.springframework.web.client.RestClient;
public class RestClient {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        restClient client = new restClient();
        String name = reader.nextLine();
        String cleaned = name.strip();
        String url = "cs-hydra.centre.edu:9000/request/" + cleaned;
        String password = client.get().uri(url).retrieve().bodyToMono(String.class).block();
        String cleanedPassword = password.strip();
        String url2 = "cs-hydra.centre.edu:9000/auth/" + cleanedPassword;
        String response = client.get().uri(url2).retrieve().bodyToMono(String.class).block();
        System.out.println(response + "\nYour password is: " + cleanedPassword );
    }
}

