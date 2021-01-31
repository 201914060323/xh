package com.xh.scms.domain.repository;

import com.xh.scms.domain.model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author ankelen
 * @date
 */
public interface CompetitionRepo extends JpaRepository<Competition, String> {
    @Transactional
    @Modifying
    @Query("DELETE FROM Competition a WHERE a.name=?1 AND a.year=?2")
    public int DeleteCompetition(String name,int year);

    @Transactional
    @Modifying
    @Query("UPDATE Competition a SET a.organizer=?1 WHERE a.year=?2 and a.name=?3")
    public int UpdateOrganizerCompetition(String organizer,int year,String name);

}
