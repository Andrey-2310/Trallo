create sequence trallo_seq;

create table section(
                    id bigint primary key default nextval('trallo_seq'),
                    section_order int,
                    name varchar(2048)
);

create table note(
                     id bigint primary key default nextval('trallo_seq'),
                     section_id bigint not null,
                     note_order integer,
                     description varchar(2048),
                     title varchar(2048)
);

alter table note
    add constraint note_section_fk
    foreign key (section_id) references section(id);