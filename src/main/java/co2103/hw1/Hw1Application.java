package co2103.hw1;

import co2103.hw1.domain.Actor;
import co2103.hw1.domain.Musical;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Hw1Application implements CommandLineRunner {

    public static List<Musical> musicals;
    public static List<Actor> actors;

    public static void main(String[] args) {
        SpringApplication.run(Hw1Application.class, args);
    }

    @Override
    public void run(String... args){
        musicals = new ArrayList<>();
        Musical m = new Musical();
        m.setId(1);
        m.setName("Faith");
        m.setComposer("Mozart");
        musicals.add(m);

        actors = new ArrayList<>();
        Actor a = new Actor();
        a.setName("Beldy");
        a.setTraining("Stage");
        a.setType("Romance");
        a.setAwards(2);
        actors.add(a);

        actors = new ArrayList<>();
        Actor a2 = new Actor();
        a2.setName("Tayah");
        a2.setTraining("Dance");
        a2.setType("Action");
        a2.setAwards(3);
        actors.add(a2);


    }
}