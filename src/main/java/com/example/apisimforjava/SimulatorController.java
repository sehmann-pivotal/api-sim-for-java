package com.example.apisimforjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimulatorController {

    @GetMapping(value = "/endpoint", produces = "application/json")
    public String hardcodedEndpoint() {
        return "{ \"field\": \"value\" }";
    }
}
