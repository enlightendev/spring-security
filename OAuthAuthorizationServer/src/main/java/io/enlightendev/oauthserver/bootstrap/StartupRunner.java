package io.enlightendev.oauthserver.bootstrap;

import io.enlightendev.oauthserver.domain.User;
import io.enlightendev.oauthserver.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 *
 */
public class StartupRunner implements CommandLineRunner {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private DataSource ds;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    UserRepository userRepository;

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {

        log.info("StartupRunner::run()");

        log.info("DataSource: " + ds.toString());

        userRepository.save(new User("juan","jlamadrid","password"));

        log.info("User count:" + userRepository.count());

    }
}
