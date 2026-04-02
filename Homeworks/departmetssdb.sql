CREATE TABLE departmentss (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

CREATE TABLE employeess (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    dept_id INT,
    salary INT,
    FOREIGN KEY (dept_id) REFERENCES departmentss(dept_id)
);
INSERT INTO departmentss VALUES
(1, 'HR'),
(2, 'Development'),
(3, 'Testing');

INSERT INTO employeess VALUES
(101, 'Arun', 1, 40000),
(102, 'Bala', 2, 25000),
(103, 'Charan', 1, 35000),
(104, 'Dinesh', 3, 28000);
SELECT e.emp_name, d.dept_name, e.salary
FROM employeess e, departmentss d
WHERE e.dept_id = d.dept_id
AND e.salary > 30000
AND d.dept_name = 'HR';