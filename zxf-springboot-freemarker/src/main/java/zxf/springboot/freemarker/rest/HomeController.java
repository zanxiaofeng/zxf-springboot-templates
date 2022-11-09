package zxf.springboot.freemarker.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zxf.springboot.freemarker.service.FreemarkerService;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    @Autowired
    FreemarkerService freemarkerService;

    @GetMapping(value = "/html", produces = MediaType.TEXT_HTML_VALUE)
    public String html(@RequestParam String htmlP, @RequestParam String jsP) {
        Map<String, String> model = new HashMap<>();
        model.put("htmlP", htmlP);
        model.put("jsP", jsP);
        return freemarkerService.render("html.ftl", model);
    }

    @GetMapping(value = "/xml", produces = MediaType.TEXT_XML_VALUE)
    public String xml(@RequestParam String xmlP, @RequestParam String jsonP) {
        Map<String, String> model = new HashMap<>();
        model.put("xmlP", xmlP);
        model.put("jsonP", jsonP);
        return freemarkerService.render("xml.ftl", model);
    }

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public String json(@RequestParam String jsonP) {
        Map<String, String> model = new HashMap<>();
        model.put("jsonP", jsonP);
        return freemarkerService.render("json.ftl", model);
    }

    @GetMapping(value = "/plain", produces = MediaType.APPLICATION_JSON_VALUE)
    public String plain(@RequestParam String plainP) {
        Map<String, String> model = new HashMap<>();
        model.put("plainP", plainP);
        return freemarkerService.render("plain.ftl", model);
    }
}
