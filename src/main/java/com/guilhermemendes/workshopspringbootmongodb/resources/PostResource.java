package com.guilhermemendes.workshopspringbootmongodb.resources;

import com.guilhermemendes.workshopspringbootmongodb.domain.Post;
import com.guilhermemendes.workshopspringbootmongodb.resources.util.URL;
import com.guilhermemendes.workshopspringbootmongodb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/posts")
public class PostResource {

    @Autowired
    private PostService service;

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public ResponseEntity<Optional<Post>> findById(@PathVariable String id){
        Optional<Post> obj = Optional.ofNullable(service.findById(id));
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value="/titlesearch", method = RequestMethod.GET)
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value="text", defaultValue = "") String text) throws UnsupportedEncodingException {
        text = URL.decodeParam(text);
        List<Post> list = service.findByTitle(text);
        return ResponseEntity.ok().body(list);
    }

    @RequestMapping(value="/fullsearch", method = RequestMethod.GET)
    public ResponseEntity<List<Post>> fullSearch(
            @RequestParam(value="text", defaultValue = "") String text,
            @RequestParam(value="minDate", defaultValue = "") String minDate,
            @RequestParam(value="maxDate", defaultValue = "") String maxDate) throws UnsupportedEncodingException {
        text = URL.decodeParam(text);
        Date min = URL.convertDate(minDate, new Date(0L));
        Date max = URL.convertDate(maxDate, new Date());

        List<Post> list = service.fullSearch(text, min, max);
        return ResponseEntity.ok().body(list);
    }




}
