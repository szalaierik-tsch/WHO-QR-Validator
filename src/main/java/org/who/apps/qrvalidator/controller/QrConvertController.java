package org.who.apps.qrvalidator.controller;

import org.springframework.web.bind.annotation.*;
import org.who.apps.qrvalidator.model.ConvertResponse;

@RestController
@RequestMapping("/qr")
public class QrConvertController {

    @PostMapping("/convertToString")
    public ConvertResponse convertToString(@RequestBody(required = false) byte[] picture) {
        return new ConvertResponse("QR_CODE_STRING_PLACEHOLDER");
    }
}