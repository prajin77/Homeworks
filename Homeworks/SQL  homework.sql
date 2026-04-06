create table departments
(
dept_ID int primary key , 
dept_Name varchar(20) not null ,
location varchar(20) not null 
);

insert into departments values
(10, 'HR', 'Chennai'),
(20, 'IT', 'Madurai'),
(30, 'Finance', 'Trichy'),
(40, 'Sales', 'Coimbatore');


create table employees
(
emp_ID int primary key , 
emp_Name varchar(25) not null ,
age smallint check (age>18),
salary decimal(10,2) check (salary>0),
dept_ID int not null ,
job_Role varchar(30) not null ,

foreign key (dept_ID) references  departments (dept_ID)
);

select  * from employees
select  * from departments
drop table employees
insert into employees values
(101, 'Arun', 23, 25000, 20, 'Developer'),
(102, 'Bala', 30, 40000, 10, 'Recruiter'),
 (103, 'Charan', 27, 35000, 20, 'Tester'),
 (104, 'Divya', 35, 50000, 30, 'Accountant'),
 (105, 'Eswar', 29, 28000, 40, 'Sales Executive'),
 (106, 'Farhana', 26, 32000, 20, 'Developer'),
 (107, 'Gokul', 31, 45000, 30, 'Analyst'),
 (108, 'Hari', 24, 22000, 10, 'Assistant');



ANNUAL SALARY and BONUS
select emp_Name,salary ,
salary * 12 AS annual_Salary,
salary + 5000 AS bonus_Amount
from employees;


DEDUCTING
select emp_Name,salary - 2000 as Deducting_Amount 
from employees;

1. Show employees whose salary is greater than 30000.
select emp_Name,salary from employees
where salary >30000 ;

2. Show employees whose age is less than 28.
select emp_Name,age from employees
where age <28 ;


3. Show employees whose salary is equal to 25000.
select emp_Name,salary from employees
where salary =25000 ;

4. Show employees whose age is not equal to 30.
select emp_Name,age from employees
where age != 30 ;



3. Logical Operator

1. Show employees whose salary is greater than 25000 AND dept_id is 20.
select emp_Name,salary from employees
where salary > 25000 and dept_ID = 20;

2. Show employees whose dept_id is 10 OR dept_id is 30.
select emp_Name,dept_ID from employees
where dept_ID = 10 or dept_ID = 30;


3. Show employees whose salary is not less than 30000.
select emp_Name,salary from employees
where salary >= 30000;


4. Show employees whose age is greater than 25 AND salary is less than 45000.
select emp_Name , age , salary from employees 
where age > 25 and salary < 45000 ;

4. Special Operators

1. Show employees whose salary is between 25000 and 40000.
select emp_Name , salary from employees
where salary between 25000 and 40000 ;


2. Show employees whose dept_id is in (10, 20).
select emp_Name , dept_ID from employees
where dept_ID in (10,20);

3. Show employees whose name starts with 'A'.
select emp_Name from employees
where emp_Name like 'A%';

4. Show employees whose name ends with 'a'.
select emp_Name from employees
where emp_Name like '%a';

5. Show employees whose name contains 'ar'.
select emp_Name from employees
where emp_Name like '%ar%';

6. Show employees whose dept_id is not in (30, 40).
select emp_Name , dept_ID 
from employees
where dept_ID not in (30,40);



1. SELECT Clause

1. Display all columns from employee table.
select * from employees

2. Display only emp_name and salary from employee table.
select emp_Name , salary from employees

3. Display dept_name and location from department table.
select dept_Name , location from departments

2. WHERE Clause

1. Show employees working in dept_id 20.
select emp_Name from employees
where dept_ID = 20;


2. Show employees whose salary is more than 35000.
select emp_Name , salary from employees
where salary >35000;


3. Show employees whose age is below 30.
select emp_Name , age from employees
where age < 30;


3. ORDER BY Clause
1. Display all employees in ascending order of salary.
select * from employees
order  by salary asc ;

2. Display all employees in descending order of age.
select * from employees
order  by age desc ;

3. Display employee names in alphabetical order.
select * from employees
order  by emp_Name asc ;


4. GROUP BY Clause
select * from employees
1. Count how many employees are there in each department.
SELECT dept_id, COUNT(*) AS total_employees
FROM employees
GROUP BY dept_id;


2. Find maximum salary in each department.
SELECT emp_name, dept_id, salary
FROM employees
WHERE salary = (
    SELECT MAX(salary)
    FROM employees e2
    WHERE e2.dept_id = employees.dept_id
);

select dept_ID , max(salary)
from employees 
group by dept_ID 
order by dept_ID asc
;


3. Find minimum salary in each department.
select dept_ID , min(salary)
from employees 
group by dept_ID 
order by dept_ID asc
;


4. Find average salary in each department.
select dept_ID , avg(salary)
from employees 
group by dept_ID 
order by dept_ID asc
;

5. HAVING Clause
1. Show departments having more than 2 employees.
select dept_ID , count(*) as total 
from employees 
group by dept_ID 
having count(*)>2
order by dept_ID asc 
;

2. Show departments where average salary is greater than 30000.
select dept_ID , avg(salary) as avg_salary 
from employees 
group by dept_ID 
having avg(salary)>30000
order by dept_ID asc 
;

3. Show departments where maximum salary is above 40000.
select dept_ID , max(salary) as max_salary 
from employees 
group by dept_ID 
having  max(salary)>40000
order by dept_ID asc 
;







6. DISTINCT Clause
1. Display unique dept_id values from employee table.
select distinct dept_ID
from employees
2. Display unique job roles from employee table.
select distinct job_Role
from employees




7. LIMIT Clause
1. Show first 3 employees from employee table.
select * from employees
limit 3 ;

2. Show top 2 highest paid employees.
select * from employees
order by salary asc
limit 3 ;



 Part 4: Mixed Questions Using Clause + Operator
1. Display employees whose salary is greater than 25000 and sort by salary descending.
select emp_Name , salary from employees 
where salary > 25000
order by salary asc

2. Show employees from dept_id 20 whose age is between 24 and 30.
select emp_Name , age  from employees 
where dept_ID = 20 
and age between 24 and 30 ;

3. Count employees in each department where average salary is above 30000.
select dept_ID , count(*) as total
from employees
group by dept_ID
having avg(salary)>30000;

4. Show employee names starting with 'D' or 'F'.
select emp_Name from employees
where emp_Name like 'D%' or emp_Name like 'F%' ;


5. Display employees whose job_role is either 'Developer' or 'Tester'.
select emp_Name,job_Role from employees
where job_Role in ('Developer' ,'Tester');


6. Show employees whose salary is not between 25000 and 35000.
select emp_Name , salary 
from employees
where salary between 25000 and 35000 ;


7. Display department-wise total salary.
SELECT dept_id, SUM(salary) AS total_salary
FROM employees
GROUP BY dept_id;


8. Show departments having total salary greater than 60000.

SELECT dept_id, SUM(salary) AS total_salary
FROM employees
GROUP BY dept_id
HAVING SUM(salary)>60000
order by dept_ID asc
;


Part 5: Join + Clause + Operator Homework
1. Display employee name with department name.
select e.emp_Name , d.dept_Name from employees e
join departments d on (e.dept_ID = d.dept_ID);

2. Show employee name, salary, and department location.
select e.emp_Name , e.salary , d.location from employees e
join departments d on (e.dept_ID = d.dept_ID);


3. Show employees who work in IT department.
select e.emp_Name  from employees e
join departments d 
on e.dept_ID = d.dept_ID
where d.dept_Name = 'IT';

4. Show employees whose department location is Chennai.
select e.emp_Name  from employees e
join departments d 
on e.dept_ID = d.dept_ID
where d.location = 'Chennai';

5. Show employees with salary greater than 30000 along with department name.
select e.emp_Name , e.salary  from employees e
join departments d 
on e.dept_ID = d.dept_ID
where e.salary>30000;

6. Count employees in each department using join.
select d.dept_Name , count (e.emp_ID) as total_employees
from departments d
join employees e  
on e.dept_ID = d.dept_ID
group by d.dept_ID;

7. Show departments having more than 1 employee using join and having clause.
select d.dept_Name , count (e.emp_ID) as total_employees
from departments d
join employees e  
on e.dept_ID = d.dept_ID
group by d.dept_ID
having count(e.emp_ID)>1;
 