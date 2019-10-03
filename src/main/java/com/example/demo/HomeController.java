package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    PostRepository postRepository;
    @RequestMapping("/login")
    public String loadFormPage(){
        return "login";
    }
    @RequestMapping("/postform")
    public String loginPage(@RequestParam("login") String login, Model model){
        model.addAttribute("loginval", login);
        model.addAttribute("post", new Post());
        return "postform";
    }
    @RequestMapping("/")
    public String listPosts(Model model){
        model.addAttribute("posts", postRepository.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String dishForm(Model model){
        model.addAttribute("post",new Post());

	return "postform";
    }

    @PostMapping("/process")
    public String processForm(@Valid Post post, BindingResult result){
        if(result.hasErrors()){
            return "postform";
        }
        postRepository.save(post);
        return "redirect:/";
    }

    @RequestMapping("/detail/{id}")
    public String showPost(@PathVariable("id") long id, Model model){
        model.addAttribute("post", postRepository.findById(id).get());
        return "show";

    }
    @RequestMapping("/update/{id}")
    public String updateDish(@PathVariable("id") long id, Model model){
        model.addAttribute("post", postRepository.findById(id).get());
        return "postform";
    }

    @RequestMapping("/delete/(id)")
    public String delDish(@PathVariable("id") long id){
        postRepository.deleteById(id);
        return "redirect:/";
    }


}
