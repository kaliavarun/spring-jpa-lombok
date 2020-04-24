package com.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@Getter
@Entity
@Table(name = "T_STUDENTS2")
public class Student2 implements Serializable {

    @Id
    @SequenceGenerator(name = "S_STUDENTS_SEQUENCE2", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_STUDENTS_SEQUENCE2")
    @Column(name = "id")
    private Long studentId;

    @Column(name = "name", length = 20)
    private String studentName;

    @ManyToOne
    @JoinColumn(name = "mentor_id", nullable = false)
    private Student2 mentor;
}