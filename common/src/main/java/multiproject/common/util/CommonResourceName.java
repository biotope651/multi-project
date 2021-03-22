package multiproject.common.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CommonResourceName {

    @Value("${active.common.profile.name}")
    private String profileName;

    public String getProfileName() {
        return profileName;
    }
}
