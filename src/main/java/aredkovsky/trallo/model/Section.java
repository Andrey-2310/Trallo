package aredkovsky.trallo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "section")
@Getter
@Setter
public class Section extends BaseEntity {

    @Column(name = "section_order")
    private int order;

    @Column(name = "name")
    private String name;

}
