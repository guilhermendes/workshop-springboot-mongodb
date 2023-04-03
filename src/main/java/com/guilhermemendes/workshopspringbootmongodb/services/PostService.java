package com.guilhermemendes.workshopspringbootmongodb.services;

import com.guilhermemendes.workshopspringbootmongodb.domain.Post;
import com.guilhermemendes.workshopspringbootmongodb.domain.User;
import com.guilhermemendes.workshopspringbootmongodb.dto.UserDTO;
import com.guilhermemendes.workshopspringbootmongodb.repository.PostRepository;
import com.guilhermemendes.workshopspringbootmongodb.repository.UserRepository;
import com.guilhermemendes.workshopspringbootmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontradoooo"));
    }

}
