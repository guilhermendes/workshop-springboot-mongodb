package com.guilhermemendes.workshopspringbootmongodb.repository;

import com.guilhermemendes.workshopspringbootmongodb.domain.Post;
import com.guilhermemendes.workshopspringbootmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
