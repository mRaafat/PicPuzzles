# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  cat_name                  varchar(255) not null,
  constraint pk_category primary key (cat_name))
;

create table picture (
  id                        integer not null,
  image_link                varchar(255),
  category_cat_name         varchar(255),
  constraint pk_picture primary key (id))
;

create table user (
  name                      varchar(255) not null,
  email                     varchar(255),
  password                  varchar(255),
  category1                 integer,
  category2                 integer,
  category3                 integer,
  constraint pk_user primary key (name))
;

create sequence category_seq;

create sequence picture_seq;

create sequence user_seq;

alter table picture add constraint fk_picture_category_1 foreign key (category_cat_name) references category (cat_name) on delete restrict on update restrict;
create index ix_picture_category_1 on picture (category_cat_name);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists category;

drop table if exists picture;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists category_seq;

drop sequence if exists picture_seq;

drop sequence if exists user_seq;

