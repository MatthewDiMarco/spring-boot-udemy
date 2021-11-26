package io.app.securitydemo.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

    @RequestMapping("/list")
    public String list() {
        return "list posts...";
    }

    @RequestMapping("/drafts")
    public String listDrafts() {
        return "list drafts...";
    }

}
