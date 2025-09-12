package com.example.resttemplate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nationalize")
public class NationalizeController {

    private final NationalizeService nationalizeService;

    public NationalizeController(NationalizeService nationalizeService) {
        this.nationalizeService = nationalizeService;
    }

    @GetMapping
    public ResponseEntity<NationalizeResponse> getCountry(@RequestParam String name) {
        NationalizeResponse response = nationalizeService.getCountryByName(name);
        return ResponseEntity.ok(response);
    }
}
