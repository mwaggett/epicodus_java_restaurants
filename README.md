# Restaurants ~UNFINISHED~

##### _Database practice for Epicodus, 24 August 2015_

#### By **Momo Ozawa & Molly Waggett**

## Description

Database of restaurants. _**This app does not yet have a web interface. The database should also ultimately include a cuisines table so that we may display what cuisine each restaurant serves.**_

## Setup

* Set up the database in PostgreSQL by running the following commands in your terminal:
```
  psql
  CREATE DATABASE restaurant;
  \c restaurant;
  CREATE TABLE restaurants (id serial PRIMARY KEY, name varchar);
```
* If you wish to run tests, create a test database:
```
  CREATE DATABASE restaurant_test WITH TEMPLATE restaurant;
```

## Technologies Used

* Java
* PostgreSQL
* Gradle
* JUnit

### Legal

Copyright (c) 2015 **Momo Ozawa & Molly Waggett**

This software is licensed under the MIT license.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
