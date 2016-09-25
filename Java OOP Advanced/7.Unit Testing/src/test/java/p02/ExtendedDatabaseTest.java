package p02;

import org.junit.Test;

import javax.naming.OperationNotSupportedException;


public class ExtendedDatabaseTest {

    @Test(expected = OperationNotSupportedException.class)
    public void addingPersonWithNullId() throws Exception {
        ExtendedDatabase extendedDatabase=new ExtendedDatabase();
        String name="Pesho";
        Long id=null;
        Person person=new Person(id,name);
        //Act
        extendedDatabase.add(person);

    }

    @Test(expected = OperationNotSupportedException.class)
    public void addingPersonWithSameId() throws Exception {
        ExtendedDatabase extendedDatabase=new ExtendedDatabase();
        String name="Pesho";
        Long id=123456l;
        Person person=new Person(id,name);
        String name2="Gosho";
        Person person2=new Person(id,name2);
        //Act
        extendedDatabase.add(person);
        extendedDatabase.add(person2);

    }

    @Test(expected = OperationNotSupportedException.class)
    public void removingUnexcitingPerson() throws Exception {
        ExtendedDatabase database=new ExtendedDatabase();
        String name="Pesho";
        Long id=123456l;
        Person person=new Person(id,name);
        //Act
        database.remove(person);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void searchByNullId() throws Exception {
        ExtendedDatabase database=new ExtendedDatabase();
        String name="Pesho";
        Long id=null;
        Person person=new Person(id,name);
        //Act
        database.searchById(id);

    }

    @Test(expected = OperationNotSupportedException.class)
    public void searchByNormalId() throws Exception {
        ExtendedDatabase database=new ExtendedDatabase();
        String name="Pesho";
        Long id=1234567l;
        Person person=new Person(id,name);
        //Act
        database.searchById(id);

    }


    @Test(expected = OperationNotSupportedException.class)
    public void searchPeopleByNullName() throws Exception {
        ExtendedDatabase database=new ExtendedDatabase();
        String name=null;
        Long id=1234567l;
        Person person=new Person(id,name);
        //Act
        database.searchPeopleByName(name);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void searchPeopleByUnexcitingName() throws Exception {
        ExtendedDatabase database=new ExtendedDatabase();
        String name="Pesho";
        Long id=1234567l;
        Person person=new Person(id,name);
        //Act
        database.searchPeopleByName(name);
    }

}