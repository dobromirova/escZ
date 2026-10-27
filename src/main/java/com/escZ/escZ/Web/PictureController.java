package com.escZ.escZ.Web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class PictureController {

    @PostMapping("/upload")
    public String uploadPictures(
            @RequestParam("routeId") Long routeId,
            @RequestParam("title") String title,
            @RequestParam("pictures") List<MultipartFile> pictures) {

        for (MultipartFile picture : pictures) {
            if (!picture.isEmpty()) {

                System.out.println(picture.getOriginalFilename());
            }
        }

        return "redirect:/";
    }


}
