package com.atguigu.service;

import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @author by zxk
 * @date 2022/3/2.
 */
@Service
public class BookService {

//    @Qualifier("bookDao2")
//    @Autowired(required = false)
    @Inject
    private BookDao bookDao;

    public void print() {
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
