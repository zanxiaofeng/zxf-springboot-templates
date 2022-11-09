package zxf.springboot.freemarker.service;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.StringWriter;

@Service
public class FreemarkerService {
    @Autowired
    private Configuration configuration;

    public String render(String templateName, Object dataModel) {
        try {
            Template template = configuration.getTemplate(templateName);
            try (StringWriter out = new StringWriter()) {
                template.process(dataModel, out);
                return out.toString();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
