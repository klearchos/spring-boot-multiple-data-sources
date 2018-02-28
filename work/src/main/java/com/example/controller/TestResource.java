package com.example.controller;

import com.example.source.repo.SourceRepo;
import com.example.target.repo.TargetRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {

    SourceRepo sourceRepo;
    TargetRepo targetRepo;

    TestResource(SourceRepo sourceRepo, TargetRepo targetRepo) {
        this.sourceRepo = sourceRepo;
        this.targetRepo = targetRepo;
    }


    @RequestMapping("/test")
    public void testDatSources() {
        System.out.println(sourceRepo.findAll());
        System.out.println("===");
        System.out.println(targetRepo.findAll());
    }
}
