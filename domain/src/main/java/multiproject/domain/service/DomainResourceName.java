package multiproject.domain.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DomainResourceName {

    @Value("${active.domain.profile.name}")
    private String profileName;

    public String getProfileName() {
        return profileName;
    }
}
