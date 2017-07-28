package com.thymeleaf001.controller;

import com.thymeleaf001.models.Address;
import com.thymeleaf001.models.Link;
import com.thymeleaf001.models.Role;
import com.thymeleaf001.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hiemseyha on 7/28/17.
 */

@Controller
public class HelloController {

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String helloForm() {
        return "helloform";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(HttpServletRequest request, Model model) {

              String username = request.getParameter("username");

        if (username == null || username == "") {
            username = "default name";
        }

        final Address address = new Address();

        final List<Link> links = new ArrayList<Link>();

        final Link link001 = new Link();
        link001.setUrl("http://www.thymeleaf.org/doc/articles/springmvcaccessdata.html");

        final Link link002 = new Link();
        link002.setUrl("https://www.youtube.com/watch?v=GNteuJDo1KA");

        links.add(link001);
        links.add(link002);


        final User user = new User();
        user.setUsername("seyha");

        final Role role = new Role();
        role.setName(false);

        user.setRole(role);

        model.addAttribute("name",username);
        model.addAttribute("address", address);
        model.addAttribute("links", links);
        model.addAttribute("user", user);

        return "hello";
    }
}
