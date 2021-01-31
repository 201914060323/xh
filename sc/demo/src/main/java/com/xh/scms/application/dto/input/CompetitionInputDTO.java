package com.xh.scms.application.dto.input;

import lombok.Data;

/**
 * @author ankelen
 * @date
 */
@Data
public class CompetitionInputDTO {
    private Integer year;
    private String name;
    private String profession;
    private String organizer;
    private String level;
    private String category;
}