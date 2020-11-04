package pl.sebasr.car;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class PageInfo {
    private String author;
    private Integer creationDate;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get()
    {
        System.out.println(author);
        System.out.println(creationDate);
    }
}
