package com.xh.scms.application.service.impls;

import com.xh.scms.application.dto.input.CompetitionInputDTO;
import com.xh.scms.application.service.ICompetitionService;
import com.xh.scms.domain.model.Competition;
import com.xh.scms.domain.repository.CompetitionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ankelen
 * @date
 */
@Service
public class CompetitionServiceImpl implements ICompetitionService {
    @Autowired
    private CompetitionRepo repo;

    @Override
    public Object create(CompetitionInputDTO model) {
        Competition entity = new Competition();
        entity.setYear(model.getYear());
        entity.setName(model.getName());
        entity.setProfession(model.getProfession());
        entity.setOrganizer(model.getOrganizer());
        entity.setLevel(model.getLevel());
        entity.setCategory(model.getCategory());
        return repo.save(entity);
    }
}
