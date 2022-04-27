# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table follow (
  edge_id                       bigint auto_increment not null,
  user_id                       bigint,
  other_id                      bigint,
  constraint pk_follow primary key (edge_id)
);

create table user (
  user_id                       bigint auto_increment not null,
  user_name                     varchar(255),
  user_password                 varchar(255),
  display_name                  varchar(255),
  display_avatar                varchar(255),
  constraint pk_user primary key (user_id)
);


# --- !Downs

drop table if exists follow;

drop table if exists user;

