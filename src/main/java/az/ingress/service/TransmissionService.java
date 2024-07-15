package az.ingress.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!default")
public class TransmissionService implements CarService{
    @Override
    public String run() {
        return "Transmission service running ...";
    }
}
