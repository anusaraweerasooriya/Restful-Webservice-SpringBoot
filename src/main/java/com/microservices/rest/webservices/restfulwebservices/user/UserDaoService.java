package com.microservices.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Adam", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Jim", LocalDate.now().minusYears(30)));
        users.add(new User(3,"Caraline", LocalDate.now().minusYears(30)));
        users.add(new User(4,"Balian", LocalDate.now().minusYears(30)));
    }

    public List<User> findAll() {
        return users;
    }
}
