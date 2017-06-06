package com.example.examplequerydslspringdatajpamaven.rest;

import com.example.examplequerydslspringdatajpamaven.entity.Cat;
import com.example.examplequerydslspringdatajpamaven.entity.QCat;
import com.example.examplequerydslspringdatajpamaven.repository.CatRepository;
import com.querydsl.core.types.dsl.BooleanExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dtarasenko on 6/1/2017.
 */

@RestController
public class HelloRestController {

    @Autowired
    private CatRepository catRepository;

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/cats")
    public List<Cat> helloCats() {
        return catRepository.findAll();
    }

    @GetMapping("/cats/{name}")
    public Cat queryCats(@PathVariable String name) {

        QCat qCat = QCat.cat;
        BooleanExpression nameIs = qCat.name.eq(name);

        return catRepository.findOne(nameIs);
    }
}
