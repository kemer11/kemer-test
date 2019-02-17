package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @GetMapping("/")
    public MyDto home() {
	System.out.println("JESTEM!!!");
        return new MyDto("Hello Docker World");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	private class MyDto {

		public String value;

		public MyDto(String value) {
			this.value = value;
		}
	}

}
