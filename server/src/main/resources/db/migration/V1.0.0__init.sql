CREATE TABLE RESTAURANT(id identity not null PRIMARY KEY, restaurant_name text, menu_id integer, admin_id integer);

CREATE TABLE MENU(id identity not null PRIMARY KEY, menu_name text);

CREATE TABLE MENU_ITEMS(id identity not null PRIMARY KEY, item_name text, menu_id_id integer, price float);

CREATE TABLE ORDER_HISTORY(id identity not null PRIMARY KEY, payment_id integer, total_price float);

CREATE TABLE ORDER_ITEMS(id identity not null PRIMARY KEY, order_id integer, menu_item_id integer, quantity integer);

CREATE TABLE PAYMENT(id identity not null PRIMARY KEY, payment_status text, method text);

CREATE TABLE RESTAURANT_ADMIN(id identity not null PRIMARY KEY, restaurant_id integer);
