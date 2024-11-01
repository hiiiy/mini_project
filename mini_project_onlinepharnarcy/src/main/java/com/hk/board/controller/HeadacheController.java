package com.hk.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/page")
@Controller
public class HeadacheController {
	@GetMapping("/headache")
    public String headachePage() {
        return "page/headache"; 
    }
}
