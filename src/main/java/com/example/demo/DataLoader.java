package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.format.datetime.DateFormatter;
import sun.util.calendar.BaseCalendar;

import java.util.Date;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    PostRepository postRepository;
    @Override

    public void run(String... strings) throws Exception {
        Post post;

        post= new Post("Aaron, Hank", "2019-01-01", "Happy New Year","May the New Year bring to you warmth of love, and a light to guide your path towards a positive destination. ");
        postRepository.save(post);
        post=new Post ("Addams, Jane", "2019-01-25","Make sure you don’t run out of good things to talk about","Maybe right now you’re thinking of speaking to someone you’re attracted to. Maybe you even have a date planned. But you just want to make sure you don’t run out of good things to talk about.");
        postRepository.save(post);
        post=new Post ("Baez, Joan", "2019-02-15","You know that you should say something","Imagine both of you sitting near each other. There is a sudden pause in the conversation, and you know that you should say something now, but your brain seems to have stopped working.");
        postRepository.save(post);
        post=new Post ("Baker, Russell","2019-02-26","You’re not alone if you’ve been in this situation before","You’re not alone if you’ve been in this situation before. I certainly have, many times. And I can understand that you want to prevent this from happening to you again, especially if you’re talking to a person who you like.");
        postRepository.save(post);
        post=new Post ("Broun, Heywood","2019-03-11","Who really says something like that? ","Many of the “conversation tips” articles you’ll find on the internet are embarrassingly cringe-worthy. They often give you silly suggestions like: “If you made a TV show about your life, what would you name it?");
        postRepository.save(post);
        post=new Post ("Chandler, Raymond","2019-03-22","If you find out what a person’s hobbies","Hobbies are things people do without being paid to, just because they enjoy them. Some examples are: yoga, photography, working out, meditation, shopping, etc.");
        postRepository.save(post);
        post=new Post ("Cook, Peter","2019-04-08","People do spend several hours a day at these places","People do spend several hours a day at these places. And their work or school are often related to an area they’re very passionate about. ");
        postRepository.save(post);
        post=new Post ("Dolphy, Eric","2019-04-22","Work/School","Some people say you shouldn’t talk about work. I think that’s ridiculous. When you stop and listen to what people usually talk about, work and school are at the top of the list.");
        postRepository.save(post);
        post=new Post ("Edwards, John","2019-05-15","What countries have you traveled to?","I've been to 44 countries (about 40 of the United States), about 30 of the countries on work/speaking trips of 2 or 3 days. The rest were actual week or more stints.");
        postRepository.save(post);
        post=new Post ("Fermi, Enrico","2019-05-28","What was your biggest experience of culture shock","Culture shock is an experience a person may have when one moves to a cultural environment.");
        postRepository.save(post);
        post=new Post ("Gaye, Marvin","2019-06-10","Where in the world would you love to live most?","I've been around a bit, lived and worked in a few countries and visited even more. Every time I got homesick I would think of a place where the mountains come down to the sea. ");
        postRepository.save(post);
        post=new Post ("Han Shan","2019-07-19","How does your home country compare to here?","Select a country from the list below to compare what life would be like if you were born there, instead of The United States. ");
        postRepository.save(post);
        post=new Post ("Ip, Regina","2019-08-23","Have you ever traveled by yourself?","People who have never traveled alone often describe their first solo trip as an almost religious experience. Traveling alone gives you the chance to indulge yourself fully.");
        postRepository.save(post);
        post=new Post ("Jerky Boys","2019-09-10","Do you play any musical instruments?","\n" +
                "I play the piano and have been playing it since I was 4 years old! I also played the flute and violin for a short period of time and I also play a little bit of guitar. But I play the piano like a pro.");
        postRepository.save(post);

    }
}
