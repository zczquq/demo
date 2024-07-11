package org.zcz.entity;

import lombok.Data;

/**
 * @author 16339
 */
@Data
public class Exam {
    private Integer id;
    private Integer studentId;
    private String course;
    private Double score;
}
