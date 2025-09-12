package com.example.resttemplate;

import com.example.resttemplate.NationalizeResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NationalizeService {

    private final RestTemplate restTemplate = new RestTemplate();

    public NationalizeResponse getCountryByName(String name) {
        String url = "https://api.nationalize.io?name=" + name;
        return restTemplate.getForObject(url, NationalizeResponse.class);
    }
}

