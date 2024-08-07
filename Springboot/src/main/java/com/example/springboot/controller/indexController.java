package com.example.springboot.controller;

import com.example.springboot.database.dao.ProductDAO;
import com.example.springboot.database.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {


    private static final String id = ;
    @Autowired
    private ProductDAO productDao;

    @GetMapping("/")
    public ModelAndView indexPathVar(@PathVariable(name = id) Integer id) {
        // this function is for the home page of the website which is express as just a plain slash "/"
        ModelAndView response = new ModelAndView("index");

        Product product = productDao.findById(id);
        response.addObject("productKey", product);


        response.addObject("message", "Hello World!");

        return response;
    }

   // @GetMapping("/")
    //public ModelAndView index(@RequestParam(required = false) Integer id) {
        // this function is for the home page of the website which is express as just a plain slash "/"
       // ModelAndView response = new ModelAndView("index");

       // Product product = productDao.findById(id);
       // response.addObject("productKey", product);


       // response.addObject("message", "Hello World!");

       // return response;
   // }

    @GetMapping("/page-url")
    public ModelAndView canBeAnyFunctionNameYouWant() {
        // this page is for another page of the website which is express as "/page-url"
        ModelAndView response = new ModelAndView("another-page");

        return response;
    }
}