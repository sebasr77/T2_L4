package pl.sebasr.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService {

    private MessageSource messageSource;

    @Autowired
    public MessageService(MessageSource messageSource) {
        this.messageSource = messageSource;
        String text = messageSource.getMessage("hello", new Object[] {}, Locale.forLanguageTag("pl"));
        System.out.println(text);
    }
}
