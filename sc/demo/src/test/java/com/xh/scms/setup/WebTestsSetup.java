package com.xh.scms.setup;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xh.scms.ScmsApplicationTests;
import com.xh.scms.domain.repository.CompetitionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author ankelen
 * @date
 */
//@Transactional
@AutoConfigureMockMvc
public class WebTestsSetup extends ScmsApplicationTests {
    @Autowired
    protected MockMvc mockMvc;
    @Autowired
    protected ObjectMapper mapper;


    //region Repository

    @Autowired
    protected CompetitionRepo competitionRepo;

    //endregion
}
