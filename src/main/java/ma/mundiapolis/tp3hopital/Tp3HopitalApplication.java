package ma.mundiapolis.tp3hopital;

import ma.mundiapolis.tp3hopital.entities.Patient;
import ma.mundiapolis.tp3hopital.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class Tp3HopitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp3HopitalApplication.class, args);

        }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository ) {
        return args -> {
//            patientRepository.save(
////                    new Patient(null,"Hassan",new Date(),false,12));
////            patientRepository.save(
////                    new Patient(null,"Mohammed",new Date(),true,14));
////            patientRepository.save(
////                    new Patient(null,"Hanaa",new Date(),false,2));
////            patientRepository.save(
////                    new Patient(null,"Yasmine",new Date(),true,53));
//
//
//            patientRepository.findAll().forEach(p->{
//                System.out.println(p.getNom());
//            });

        };
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}


