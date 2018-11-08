package org.debashis.practice.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    private static final Logger LOGGER = Logger.getLogger(MyRestController.class);
    private MyDomain domain;

    private ObjectMapper objectMapper;

    @Autowired
    public MyRestController(@Autowired MyDomain domain, @Qualifier("custom-objectMapper") ObjectMapper objectMapper) {
        this.domain = domain;
        this.objectMapper = objectMapper;
    }

    @GetMapping("/getInfo")
    public String getMyDomainInfo() {
        LOGGER.info("In REST Controller getMyDomainInfo()");
        return domain.toString();
    }


    @GetMapping("/getObjectMapper")
    public String getMapper() {
        return objectMapper.toString();
    }



}
