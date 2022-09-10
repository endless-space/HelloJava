package com.dev.spring.io;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@Slf4j
public class ResourceTest {

    @Test
    public void testResource() throws IOException {
        ClassPathResource resource = new ClassPathResource("beans.xml");
        System.out.println(resource.getFile().getCanonicalPath());
    }
}
