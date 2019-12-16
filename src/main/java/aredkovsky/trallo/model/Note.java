package aredkovsky.trallo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "note")
@Getter
@Setter
public class Note extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @Column(name = "note_order")
    private int order;

    @Column
    private String description;

    @Column
    private String title;

}
