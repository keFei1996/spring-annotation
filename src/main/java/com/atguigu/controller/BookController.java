package com.atguigu.controller;

import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author by zxk
 * @date 2022/3/2.
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
}
