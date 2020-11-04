package pl.sebasr.car;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MasterCardService implements Card {

    @Override
    public String getInfo() {
        return "MasterCardService";
    }
}


