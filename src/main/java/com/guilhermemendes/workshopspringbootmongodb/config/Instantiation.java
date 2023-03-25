package com.guilhermemendes.workshopspringbootmongodb.config;

import com.guilhermemendes.workshopspringbootmongodb.domain.Post;
import com.guilhermemendes.workshopspringbootmongodb.domain.User;
import com.guilhermemendes.workshopspringbootmongodb.dto.AuthorDTO;
import com.guilhermemendes.workshopspringbootmongodb.repository.PostRepository;
import com.guilhermemendes.workshopspringbootmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

import static java.util.Arrays.*;

@Configuration


public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GNT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo, abraços!", new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei hoje feliz!!", new AuthorDTO(maria));


        postRepository.saveAll(Arrays.asList(post1, post2));
    }
}
