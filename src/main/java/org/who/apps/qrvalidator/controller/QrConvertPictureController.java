package org.who.apps.qrvalidator.controller;


import org.springframework.web.bind.annotation.*;
import org.who.apps.qrvalidator.model.ConvertPictureResponse;

@RestController
@RequestMapping("/qr")
public class QrConvertPictureController {

    @PostMapping("/convertToPicture")
    public ConvertPictureResponse convertToPicture(@RequestBody(required = false) String qrCode) {
        return new ConvertPictureResponse("BASE64_PICTURE_PLACEHOLDER");
    }
}