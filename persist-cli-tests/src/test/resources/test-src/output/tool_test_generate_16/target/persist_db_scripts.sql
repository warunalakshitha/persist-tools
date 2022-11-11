DROP TABLE IF EXISTS Employees;

DROP TABLE IF EXISTS Companies;
CREATE TABLE Companies (
	id INT NOT NULL,
	name VARCHAR(191) NOT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE Employees (
	id INT NOT NULL,
	name VARCHAR(191) NOT NULL,
	companyId INT,
	CONSTRAINT FK_EMPLOYEES_COMPANIES_0 FOREIGN KEY(companyId) REFERENCES Companies(id),
	PRIMARY KEY(id)
);