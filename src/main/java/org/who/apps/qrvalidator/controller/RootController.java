package org.who.apps.qrvalidator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String root() {
        return """
                <html>
                  <head><title>QR Validator</title></head>
                  <body>
                    <h1>QR Validator Service</h1>
                    <p>Version: 0.0.1-SNAPSHOT</p>
                    <p>Explore API: <a href="/swagger-ui.html">Swagger UI</a></p>
                  </body>
                </html>
                """;
    }
}

