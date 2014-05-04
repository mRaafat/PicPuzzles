# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  cat_name                  varchar(255) not null,
  number                    integer,
  constraint pk_category primary key (cat_name))
;

create table graphical_password (
  email                     varchar(255) not null,
  cat1                      integer,
  cat1image1                integer,
  cat1image2                integer,
  cat2                      integer,
  cat2image1                integer,
  cat2image2                integer,
  cat3                      integer,
  cat3image1                integer,
  cat3image2                integer,
  constraint pk_graphical_password primary key (email))
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
  constraint pk_user primary key (name))
;

create sequence category_seq;

create sequence graphical_password_seq;

create sequence picture_seq;

create sequence user_seq;

alter table picture add constraint fk_picture_category_1 foreign key (category_cat_name) references category (cat_name) on delete restrict on update restrict;
create index ix_picture_category_1 on picture (category_cat_name);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists category;

drop table if exists graphical_password;

drop table if exists picture;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists category_seq;

drop sequence if exists graphical_password_seq;

drop sequence if exists picture_seq;

drop sequence if exists user_seq;

