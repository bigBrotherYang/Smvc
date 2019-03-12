package com.xt.controller;

import com.xt.vo.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hello")
public class BlogController {
    static List<Blog> list= new ArrayList();
    @RequestMapping("/helloWorld")
    public String helloWorld(Model model){
        model.addAttribute("val","德玛西亚");
        return "success";
    }
    @RequestMapping("/add")
    public String addBLog(@ModelAttribute Blog blog){
        list.add(blog);
        return "index";
    }
    @RequestMapping("/del")
    public String delBlog(@RequestParam(value = "id")int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getBid() == id){
                list.remove(i);
            }
        }
        return "success";
    }
    @RequestMapping("/query")
    public ModelAndView queryList(ModelAndView view){
        view.addObject(list);
        view.setViewName("success");
        return view;
    }

    @RequestMapping("/upd")
    public ModelAndView upd(ModelAndView view,Blog blog){
        view.addObject(list);
        view.setViewName("success");
        return view;
    }
}
