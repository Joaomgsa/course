package br.com.squad.course.config;

import br.com.squad.course.entities.User;
import br.com.squad.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com","988888888","123456");
        User u2 = new User(null,"Alex Green","alex@gmail.com","9777777777","123456");
    }
}