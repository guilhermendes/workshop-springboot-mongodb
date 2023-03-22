package com.guilhermemendes.workshopspringbootmongodb.services;

import com.guilhermemendes.workshopspringbootmongodb.domain.User;
import com.guilhermemendes.workshopspringbootmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    public List<User> findAll(){
        return repo.findAll();
    }
}
