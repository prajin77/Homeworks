CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(50),
    city VARCHAR(50)
);

CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    amount INT,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);
INSERT INTO customers VALUES
(1, 'Arun', 'Chennai'),
(2, 'Bala', 'Bangalore'),
(3, 'Charan', 'Hyderabad');

INSERT INTO orders VALUES
(101, 1, 6000),
(102, 2, 4000),
(103, 3, 8000),
(104, 1, 3000);
SELECT o.order_id, c.customer_name, c.city, o.amount
FROM orders o, customers c
WHERE o.customer_id = c.customer_id
AND o.amount > 5000;