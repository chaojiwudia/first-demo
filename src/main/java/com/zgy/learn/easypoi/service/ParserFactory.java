package com.zgy.learn.easypoi.service;

import com.zgy.learn.easypoi.pojo.ContentType;
import org.springframework.beans.factory.annotation.Autowired;

public interface ParserFactory {

    Parser gerParser(ContentType contentType);
}
