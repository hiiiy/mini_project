package com.hk.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/page")
@Controller
public class ColdController {
	@GetMapping("/cold")
    public String coldPage() {
        return "page/cold"; 
    }
}