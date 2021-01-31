package com.xh.scms.api;

import com.xh.scms.application.dto.input.CompetitionInputDTO;
import com.xh.scms.application.service.ICompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ankelen
 * @date
 */
@RestController
@RequestMapping(value = "/competitions")
public class CompetitionApi {
    @Autowired
    private ICompetitionService service;

    @PostMapping
    public Object create(@RequestBody CompetitionInputDTO model) {
        return service.create(model);
    }
}
