package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.client.RestClient;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;

public class APITest extends TestBase {

    TestBase testBase;
    String serviceUrl;
    String apiUrl;
    String url;
    RestClient restClient;
    CloseableHttpResponse closebaleHttpResponse;


    @BeforeMethod
    public void setUp() throws ClientProtocolException, IOException {
        testBase = new TestBase();
        serviceUrl = prop.getProperty("URL");
        apiUrl = prop.getProperty("serviceURL");
        //https://reqres.in/api/users

        url = serviceUrl + apiUrl;

    }

    @Test
    public void postAPITest(){

        restClient =  new RestClient();
        HashMap<String, String> headerMap = new HashMap<String, String>();
        headerMap.put("Accept", "application/json");
        headerMap.put("Authorization", "Bearer {3MVG9snqYUvtJB1PKIJxVBRpflRE0Q495wXobanO3kUm8cG2R1Ish36RELP0vMqJmOMYj3yJKFcagbj8Dd3Gi}");

    }



}
