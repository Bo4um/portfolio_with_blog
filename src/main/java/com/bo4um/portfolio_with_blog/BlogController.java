package com.bo4um.portfolio_with_blog;

import com.bo4um.portfolio_with_blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @GetMapping
    public ModelAndView blog() {

        List<Post> posts = Arrays.asList(
                new Post(1L, "Title 1", "Desc 1"),
                new Post(2L, "Title 2", "Desc 2"),
                new Post(3L, "Title 3", "Desc 3"),
                new Post(4L, "Title 4", "Desc 4")
        );
        ModelAndView modelAndView = new ModelAndView("blog");
        modelAndView.addObject("posts", posts);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public String post(@PathVariable("id") Long id, Model model) {
        model.addAttribute("id", id);
        return "post";
    }
}
