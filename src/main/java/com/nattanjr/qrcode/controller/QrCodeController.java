package com.nattanjr.qrcode.controller;
import com.nattanjr.qrcode.dtos.QrCodeGenerateRequest;
import com.nattanjr.qrcode.dtos.QrCodeGenerateResponse;
import com.nattanjr.qrcode.service.QrCodeGeneratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    private final QrCodeGeneratorService qrCodeGeneratorService;

    public QrCodeController (QrCodeGeneratorService qrCodeService) {
        this.qrCodeGeneratorService = qrCodeService;
    }

    @PostMapping
    public ResponseEntity<QrCodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request) {
       try{
          QrCodeGenerateResponse response = this.qrCodeGeneratorService.generateAndUploadQrCode(request.text());
          return ResponseEntity.ok(response);
       }catch(Exception error){
           return ResponseEntity.internalServerError().build();
       }
    }
}
