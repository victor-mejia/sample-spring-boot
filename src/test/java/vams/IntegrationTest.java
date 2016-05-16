package vams;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import java.net.URL;

/**
 * Created by vicmejia on 12/05/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebAppConfiguration
@org.springframework.boot.test.IntegrationTest({"server.port=0"})
public class IntegrationTest {

    @Value("${local.server.port}")
    private int port;

    private URL base;
    private RestTemplate restTemplate;

    @Before
    public void init() throws Exception{
        this.base = new URL("http://localhost:"+port+"/");
        this.restTemplate = new RestTemplate();
    }

    @Test
    public void getHello() throws Exception{
        ResponseEntity<String> response  = restTemplate.getForEntity(base.toString(), String.class);
        assertEquals(response.getBody(),"Greetings from Spring Boot!");
        assertEquals(response.getStatusCode(), HttpStatus.OK);
    }
}
