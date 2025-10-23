# Installation Guide for SPRINGBOOT

### 1. JAVA and Maven Installation

- Java installation

```bash
# Update the system
sudo apt update

# Install JDK
sudo apt install default-jdk

# Install specific JDK
sudo apt install openjdk-17-jdk
```

### 2. Database Installation

- Login to your Local / Virtual Machine

```bash
# Install MySQL Server from package manager
sudo apt install mysql-server

# Setup the MySQL Permission and Owner
sudo chmod 700 /var/lib/mysql && sudo chown -R mysql:mysql /var/lib/mysql

# Restart webserver and check the version of php
sudo systemctl start mysql && sudo systemctl enable mysql && sudo systemctl status mysql
```

### 3. Database Credential

- Using the command below will enter the mysql command line interface. Hit **"Enter"** when asking for password. (No Default Password).

```bash
# Leave blank when asking for password
sudo mysql -u root -p
```

- Change the database password for **"root"** User.

```sql
-- Alter USER Table
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'P@ssw0rd01';

-- Set the Permission
SHOW GRANTS FOR 'root'@'localhost';

-- Apply the changes
FLUSH PRIVILEGES;

-- Create Database
CREATE DATABASE wordpress;

-- Check if database exist
SHOW databases;

-- Use Database
USE wordpress;

-- Exit to bash
exit
```
