package org.medical.prescription.sign;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("sign")
public class SignController {
    @PostMapping(value = "simple-form-upload-mvc", consumes = MULTIPART_FORM_DATA_VALUE)
    public String handleFileUploadForm(@RequestPart("file") MultipartFile file) throws IOException {
        try {
            File f = new ClassPathResource("").getFile();
            final Path path = Paths.get(f.getAbsolutePath() + File.separator + "static" + File.separator + "image");

            if (!Files.exists(path)) {
                Files.createDirectories(path);
            }
            String content = new String(file.getBytes());
            System.out.println(content);

            return content;

        } catch (IOException e) {

            return "bad";
        }
    }
}
