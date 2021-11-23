package com.example.toysforshotsclone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController annotation wants to directly write to the HTTP response.
 * This means it will override our index.html.
 */
@RestController
public class PageController {}
