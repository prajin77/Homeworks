CREATE TABLE projects (
    project_id INT PRIMARY KEY,
    project_name VARCHAR(50),
    budget INT,
    status VARCHAR(20),
    emp_id INT,
    FOREIGN KEY (emp_id) REFERENCES employees(emp_id)
);
INSERT INTO projects VALUES
(201, 'ProjectA', 100000, 'Pending', 101),
(202, 'ProjectB', 150000, 'Started', 102),
(203, 'ProjectC', 200000, 'Pending', 103),
(204, 'ProjectD', 120000, 'Completed', 104);
SELECT * FROM projects
WHERE status = 'Pending';
UPDATE projects
SET status = 'Completed'
WHERE project_name = 'ProjectB';	
DELETE FROM projects
WHERE project_name = 'ProjectD';