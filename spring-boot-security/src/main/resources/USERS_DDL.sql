create table users(
      USERNAME varchar_ignorecase(50) not null primary key,
      PASSWORD varchar_ignorecase(50) not null,
      ROLE varchar_ignorecase(50) not null,
      ACTIVE boolean not null);
