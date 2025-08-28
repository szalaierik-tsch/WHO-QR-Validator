package org.who.apps.qrvalidator.controller;

import org.springframework.web.bind.annotation.*;
import org.who.apps.qrvalidator.model.ValidateResponse;

@RestController
@RequestMapping("/qr")
public class QrValidateController {

    @PostMapping("/validate")
    public ValidateResponse validate(@RequestBody(required = false) String payload) {
        return new ValidateResponse(true, "Validation successful (stub)");
    }
}