package org.debashis.practice.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.debashis.practice.app.MyDomain;
import org.debashis.practice.app.MyRestController;
import org.debashis.practice.app.SpringBootPracticeApp;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RunWith(MockitoJUnitRunner.class)
//@SpringBootTest(classes = SpringBootPracticeApp.class)
public class TestClass {

    public static final Logger LOGGER = Logger.getLogger(TestClass.class);

    @Mock
    private MyDomain domain;
    @Mock
    private ObjectMapper mapper;

    private MyRestController controller;

    @BeforeClass
    public static void startTestClass() {
        LOGGER.info("Starting TestClass");
    }

    @AfterClass
    public static void closeTestClass() {
        LOGGER.info("Closing TestClass");
    }

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        controller = new MyRestController(domain, mapper);
    }

    @Test
    public void test() {

        Mockito.when(domain.toString()).thenReturn("some-value");
        String expected = controller.getMyDomainInfo();
        Assertions.assertThat(expected).isEqualTo("some-value");
    }
}
