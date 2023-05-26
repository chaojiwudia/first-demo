package com.zgy.learn.easypoi.service;

import org.springframework.stereotype.Service;

import java.io.Reader;
import java.util.List;

@Service
public interface Parser {
    List<String> parse(Reader r);
}

