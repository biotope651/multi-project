package multiproject.parser;

import lombok.extern.slf4j.Slf4j;
import multiproject.common.util.CommonResourceName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages="multiproject")
public class ParserApplication implements CommandLineRunner {

    @Value("${active.parser.profile.name}")
    private String activeName;

    @Autowired
    private CommonResourceName commonResourceName;

//    @Autowired
//    private DomainResourceName domainResourceName;

    public static void main(String[] args) {
        SpringApplication.run(ParserApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.debug("##################################################");

        log.debug("### Call Parser Run Method !!");
        log.debug("Active Name : {}", activeName);

        log.debug("##################################################");

        log.debug("### Call Common Module!");
        log.debug("Common : {}", commonResourceName.getProfileName());

        log.debug("##################################################");

//        log.debug("### Call Domail Module!");
//        log.debug("Domain : {}", domainResourceName.getProfileName());
//
//        log.debug("##################################################");
    }
}
