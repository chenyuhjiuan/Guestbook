package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.format.datetime.DateFormatter;

import java.util.Date;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    PostRepository postRepository;
    @Override

    public void run(String... strings) throws Exception {
        Post post;

        post= new Post("Aaron, Hank", "Happy New Year");
        postRepository.save(post);
        post=new Post ("Addams, Jane", "make sure you don’t run out of good things to talk about");
        postRepository.save(post);
        post=new Post ("Baez, Joan", "you know that you should say something");
        postRepository.save(post);
        post=new Post ("Baker, Russell","You’re not alone if you’ve been in this situation before");
        postRepository.save(post);
        post=new Post ("Broun, Heywood","Who really says something like that? ");
        postRepository.save(post);
        post=new Post ("Chandler, Raymond","If you find out what a person’s hobbies");
        postRepository.save(post);
        post=new Post ("Cook, Peter","people do spend several hours a day at these places");
        postRepository.save(post);
        post=new Post ("Dolphy, Eric","Work/School");
        postRepository.save(post);
        post=new Post ("Edwards, John","What countries have you traveled to?");
        postRepository.save(post);
        post=new Post ("Fermi, Enrico","What was your biggest experience of “culture shock”");
        postRepository.save(post);
        post=new Post ("Gaye, Marvin","Where in the world would you love to live most?");
        postRepository.save(post);
        post=new Post ("Han Shan","How does your home country compare to here?");
        postRepository.save(post);
        post=new Post ("Ip, Regina","Have you ever traveled by yourself?");
        postRepository.save(post);
        post=new Post ("Jerky Boys","Do you play any musical instruments?");
        postRepository.save(post);

    }
}
