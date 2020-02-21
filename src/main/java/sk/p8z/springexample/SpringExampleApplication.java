package sk.p8z.springexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import co.elastic.apm.attach.ElasticApmAttacher;

@SpringBootApplication
public class SpringExampleApplication {

    public static void main(String[] args) {
        ElasticApmAttacher.attach();
        SpringApplication.run(SpringExampleApplication.class, args);
    }

}
