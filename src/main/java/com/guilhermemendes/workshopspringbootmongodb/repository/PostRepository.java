package com.guilhermemendes.workshopspringbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.guilhermemendes.workshopspringbootmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
