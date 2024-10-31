package com.hk.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class StoreController {

    @GetMapping("/Store")
    public String storePage() {
        return "page/Store"; // "Store.html" 페이지를 반환
    }
}
