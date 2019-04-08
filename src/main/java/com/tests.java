package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/home")
public class tests {
    String a="test";

    @RequestMapping("/index")
    public void index(HttpServletRequest request, HttpServletResponse response) {

        System.out.print(a);
    }
}