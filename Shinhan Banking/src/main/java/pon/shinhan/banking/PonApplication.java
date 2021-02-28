package pon.shinhan.banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pon.shinhan.banking.entity.ShinhanEntity;
import pon.shinhan.banking.repository.ShinhanRepository;

@SpringBootApplication
public class PonApplication{ //implements CommandLineRunner

    public static void main(String[] args) {
        SpringApplication.run(PonApplication.class, args);
    }

//    @Autowired
//    ShinhanRepository shinhanRepository;
//
//    @Override
//    public void run(String... args) {
//        ShinhanEntity shinhanEntity1 = new ShinhanEntity(1, 6.0, 38.0, 38.0, 38.0, 38.0,0);
//        ShinhanEntity shinhanEntity2 = new ShinhanEntity(2,9.0, 36.0, 38.0, 38.0, 38.0,0);
//        ShinhanEntity shinhanEntity3 = new ShinhanEntity(3,13.0, 32.0, 35.0, 38.0, 38.0,0);
//        ShinhanEntity shinhanEntity4 = new ShinhanEntity(4,18.0, 28.0, 0, 31.0, 0,0);
//        ShinhanEntity shinhanEntity5 = new ShinhanEntity(5,22.0, 24.0, 0, 27.0, 0,23.0);
//        ShinhanEntity shinhanEntity6 = new ShinhanEntity(6,30.0, 21.0, 0, 24.0, 0,20.0);
//        ShinhanEntity shinhanEntity7 = new ShinhanEntity(7,30.0, 18.0, 0, 21.0, 0,18.0);
//        shinhanRepository.save(shinhanEntity1);
//        shinhanRepository.save(shinhanEntity2);
//        shinhanRepository.save(shinhanEntity3);
//        shinhanRepository.save(shinhanEntity4);
//        shinhanRepository.save(shinhanEntity5);
//        shinhanRepository.save(shinhanEntity6);
//        shinhanRepository.save(shinhanEntity7);
//    }
}

