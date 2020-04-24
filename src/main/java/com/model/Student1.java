package com.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
@Entity
@Table(name = "T_STUDENTS1")
public class Student1 implements Serializable {

    @Id
    @SequenceGenerator(name = "S_STUDENTS_SEQUENCE1", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_STUDENTS_SEQUENCE1")
    @Column(name = "id")
    private Long studentId;

    @Column(name = "name", length = 20)
    private String studentName;

    @ManyToOne
    @JoinColumn(name = "mentor_id", nullable = false)
    private Student1 mentor;
}