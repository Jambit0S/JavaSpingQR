package org.medical.prescription.qrcode;

import org.springframework.web.bind.annotation.*;

import java.awt.image.BufferedImage;

@RestController
@RequestMapping("qr-code")
public class QrCodeController {
    @GetMapping("{code}")
    public @ResponseBody byte[] getQrCode(@PathVariable String code) throws Exception {
        BufferedImage qr= QrCodeGenerator.generateQRCodeImage(code);
        return  QrCodeGenerator.toByteArray(qr,"png");
    }

}
