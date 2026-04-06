package com.nattanjr.qrcode.controller;
import com.nattanjr.qrcode.dtos.QrCodeGenerateRequest;
import com.nattanjr.qrcode.dtos.QrCodeGenerateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request) {
        return null;
    }
}
