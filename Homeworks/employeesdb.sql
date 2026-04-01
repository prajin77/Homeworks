CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50) NOT NULL,
    age INT,
    salary INT,
    department_id INT,
    manager_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id),
    FOREIGN KEY (manager_id) REFERENCES employees(emp_id)
);
INSERT INTO employees VALUES
(101, 'Arun', 30, 40000, 2, NULL),
(102, 'Bala', 28, 30000, 2, 101),
(103, 'Charan', 35, 50000, 1, NULL),
(104, 'Dinesh', 25, 25000, 3, 103),
(105, 'Ezhil', 27, 28000, 4, 101);
SELECT * FROM employees
WHERE salary > 30000;
UPDATE employees
SET salary = 35000
WHERE emp_name = 'Bala';
DELETE FROM employees
WHERE emp_name = 'Dinesh';





