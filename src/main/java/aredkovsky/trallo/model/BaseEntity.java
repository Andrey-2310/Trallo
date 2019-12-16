package aredkovsky.trallo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

import static javax.persistence.GenerationType.SEQUENCE;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Id
    @SequenceGenerator( name = "TRALLO_SEQ_GEN", sequenceName = "trallo_seq", allocationSize = 1)
    @GeneratedValue( strategy = SEQUENCE, generator = "TRALLO_SEQ_GEN")
    private Long id;
}
