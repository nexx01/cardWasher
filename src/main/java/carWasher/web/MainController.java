package carWasher.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.io.*;


@Controller
public class MainController {


    @Autowired
    private JavaMailSender javaMailSender;

    @RequestMapping(value = {"/", "/index.html"})
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");


//        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//        simpleMailMessage.setTo("x@gmail.com");
//        simpleMailMessage.setCc("y@gmail.com");
//        simpleMailMessage.setText("index is accessed");

//        javaMailSender.send(simpleMailMessage);
        return modelAndView;
    }

    @RequestMapping(value = "/login.html")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");

        return modelAndView;
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String upload(@RequestParam("file") MultipartFile file, ModelMap modelMap) throws IOException {
        File file1 = new File("c:/demo/" + file.getOriginalFilename());
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        fileOutputStream.write(file.getBytes());
        fileOutputStream.close();

        modelMap.addAttribute("file", file);

        return "/index";
    }


    @RequestMapping(value = "/download/{filename}",method = RequestMethod.GET)
    public ResponseEntity<Object> dowload(@PathVariable("filename") String filename) throws FileNotFoundException {
        String path = "c/demo/" + filename;
        File file = new File(path);
        InputStreamResource inputStreamResource = new InputStreamResource(new FileInputStream(file));

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-disposition",String.format("attachment: filename=\"%s\""));
        httpHeaders.add("Cache-Controle","no-cache,no-store,mustrevalidate");
        httpHeaders.add("Pragma","no-cache");
        httpHeaders.add("Expire","0");

        return ResponseEntity.ok().headers(httpHeaders).contentLength(file.length())
                .body(inputStreamResource);

    }
}
