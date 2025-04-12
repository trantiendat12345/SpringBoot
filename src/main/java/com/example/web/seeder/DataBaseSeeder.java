package com.example.web.seeder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.web.models.entity.User;
import com.example.web.repositories.UserRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class DataBaseSeeder implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if(isTableEmpty()) {
            String password = passwordEncoder.encode("password");
            System.out.println("password: " + password);
            User user = new User();
            user.setName("Tien Dat");
            user.setEmail("trantiendat@gmail.com");
            user.setPassword(password);
            user.setUserCatalogueId(1L);
            user.setPhone("1203012301203");
            userRepository.save(user);

            User user2 = new User();
            user2.setName("Nhu Quynh");
            user2.setEmail("nguyennhuquynh@gmail.com");
            user2.setPassword(password);
            user2.setUserCatalogueId(2L);
            user2.setPhone("12342312312");
            userRepository.save(user2);
        }
    }

    private boolean isTableEmpty() {
        Long count = (Long) entityManager.createQuery("SELECT COUNT(id) FROM User").getSingleResult();
        return count == 0;
    }

}
