package az.ingress.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("!default")
public class EngineService implements CarService{
    @Override
    public String run() {
        return "Engine service running ...";
    }
}
