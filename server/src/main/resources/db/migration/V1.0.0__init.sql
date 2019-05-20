CREATE TABLE RESTAURANT(id integer PRIMARY KEY, restaurant_name text, menu_id integer, admin_id integer);

CREATE TABLE MENU(id integer PRIMARY KEY, menu_name text);

CREATE TABLE MENU_ITEMS(id integer PRIMARY KEY, item_name text, menu_id_id integer, price float);

CREATE TABLE ORDER_HISTORY(id integer PRIMARY KEY, payment_id integer, total_price float);

CREATE TABLE ORDER_ITEMS(id integer PRIMARY KEY, order_id integer, menu_item_id integer, quantity integer);

CREATE TABLE PAYMENT(id integer PRIMARY KEY, payment_status text, method text);

CREATE TABLE RESTAURANT_ADMIN(id integer PRIMARY KEY, restaurant_id integer, order_id integer);
