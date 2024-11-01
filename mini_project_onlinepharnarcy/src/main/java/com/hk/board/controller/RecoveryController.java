package com.hk.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/page")
@Controller
public class RecoveryController {
	@GetMapping("/recovery")
    public String coldPage() {
        return "page/recovery"; 
    }
}