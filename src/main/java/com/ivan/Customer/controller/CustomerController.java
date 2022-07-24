package com.ivan.Customer.controller;

import org.springframework.web.bind.annotation.*;
import com.test.ResponseModel;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/add")
    public ResponseModel.Response add(){
        return "add";
    }

    @GetMapping("/create")
    public String create(){
        return  "create";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "delete";
    }

    @PutMapping("/update")
    public String update(){
        return "update!";
    }



}
