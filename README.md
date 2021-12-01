# vaccine_system


## Sample data
- the data are stored under `data/` folder, as binary files
- the data files cannot directly view using notepad
- to view to data, go to `utils/Setup.java`
    - uncomment the `DataFaker.printAllData();` line
    - run it

## Regenerating sample data
- if u accidentally messed up the data, can go to `utils/Setup.java`
    - uncomment the `DataFaker.initAllData();` line
    - run it

## How to use the File DAO class:
- there are generally 5 functions for the DAO class, can refer to `BaseRootDAO.java` file:
    - `all();`
        - get all objects from data file
    - `get(UUID id);`
        - get object by unique id from data file
    - `update(UUID id, T t);`
        - update object by unique id in data file
    - `replace(List<T> tList);`
        - overwrite the whole data file with an object list
    - `create(T t);`
        - create a new object and add it to data file
    - `delete(UUID id);`
        - delete object by unique key from data file
    - `deleteAll();`
        - clear the data file completely
- to initialize a DAO class, just use `<ModelDAO> sampleDao = <FileModelDAO>.getInstance(); `
- example:
```java

PeopleDAO peopleDao = FilePeopleDAO.getInstance();
peopleDao.all();
// and more code...

```
