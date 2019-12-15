create table day(
                    id bigint not null primary key,
                    day_type varchar(255) not null,
                    date_of_day date
);

create table note(
                     id bigint not null primary key,
                     day_id bigint not null,
                     content varchar(2048),
                     title varchar(2048)
);

alter table note
    add constraint note_day_fk
    foreign key (day_id) references day(id);