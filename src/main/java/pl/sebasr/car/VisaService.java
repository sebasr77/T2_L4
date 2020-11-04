package pl.sebasr.car;

import org.springframework.stereotype.Service;

@Service
public class VisaService implements Card {

    @Override
    public String getInfo() {
        return "VisaService";
    }
}


