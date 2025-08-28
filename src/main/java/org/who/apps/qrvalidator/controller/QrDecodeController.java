package org.who.apps.qrvalidator.controller;

import org.springframework.web.bind.annotation.*;
import org.who.apps.qrvalidator.model.DecodeResponse;

@RestController
@RequestMapping("/qr")
public class QrDecodeController {

    @PostMapping("/decode")
    public DecodeResponse decode(@RequestBody(required = false) String payload) {
        return new DecodeResponse("Decoded content placeholder");
    }
}