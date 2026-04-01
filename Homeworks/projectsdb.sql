CREATE TABLE tasks (
    task_id INT PRIMARY KEY,
    task_name VARCHAR(50),
    priority VARCHAR(20),
    due_days INT,
    project_id INT,
    emp_id INT,
    FOREIGN KEY (project_id) REFERENCES projects(project_id),
    FOREIGN KEY (emp_id) REFERENCES employees(emp_id)
);
INSERT INTO tasks VALUES
(301, 'Design', 'High', 5, 201, 101),
(302, 'Coding', 'Medium', 10, 202, 102),
(303, 'Testing', 'Low', 7, 203, 104),
(304, 'Deployment', 'High', 3, 204, 103);
SELECT * FROM tasks
WHERE due_days > 5;
UPDATE tasks
SET priority = 'High'
WHERE task_name = 'Coding';
DELETE FROM tasks
WHERE task_name = 'Testing';