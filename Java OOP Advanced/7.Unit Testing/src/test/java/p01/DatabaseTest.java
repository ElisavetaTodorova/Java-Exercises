package p01;


import org.junit.Assert;

import javax.naming.OperationNotSupportedException;
import java.util.Arrays;

public class DatabaseTest {

    private int a;
    @org.junit.Test
    public void getCapacity() throws Exception {
        Database database = new Database();
        // Arrange
        int valueExpected = 16;
        // Act
        int actualValue = database.getCapacity();
        // Assert
        Assert.assertEquals(valueExpected, actualValue);
    }

    @org.junit.Test
    public void setCorrectCapacity() throws Exception {

        Database database = new Database();
        // Arrange
        int valueExpected = 16;
        // Act
        int actualValue = database.getCapacity();
        // Assert
        Assert.assertEquals(valueExpected, actualValue);
    }

    @org.junit.Test
    public void setCorrectInitialsValues() throws Exception {

        Database database = new Database(1, 2, 3);
        //Arrange
        String expected = "[1, 2, 3]";
        //Act
        String actual = Arrays.asList(database.fetch()).toString();
        //Assert
        Assert.assertEquals(expected, actual);
    }

    /*
       Put elements with count bigger than 16 in the constructor.
        */
    @org.junit.Test(expected = OperationNotSupportedException.class)
    public void addElementsWhoPassTheCapacityInTheConstructor() throws Exception {
        //Act
        Database database = new Database(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    }

    /*
    Put elements with count bigger than 16.
     */
    @org.junit.Test(expected = OperationNotSupportedException.class)
    public void addElementsWhoPassTheCapacity() throws Exception {
        Database database = new Database();
        //Act
        database.addElement(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1);

    }

    @org.junit.Test(expected = OperationNotSupportedException.class)
    public void addNullElement() throws Exception {
        Database database = new Database();
        //Act
        database.addElement(1, 2, 3, null, 4);

    }

    @org.junit.Test
    public void correctlyFetchingElements() throws Exception {
        Database database = new Database();
        //Arrange
        String expected = "[]";
        //Act
        String actual = Arrays.asList(database.fetch()).toString();
        //Assert
        Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void correctAddingElementsWithoutInitialValues() throws Exception {
        Database database = new Database();
        //Arrange
        String expected = "[1, 2, 3]";
        //Act
        database.addElement(1, 2, 3);
        String actual = Arrays.asList(database.fetch()).toString();
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void correctAddingElementsWithInitialValues() throws Exception {
        Database database = new Database(1, 2, 3);
        //Arrange
        String expected = "[1, 2, 3, 4, 34, 5]";
        //Act
        database.addElement(4, 34, 5);
        String actual = Arrays.asList(database.fetch()).toString();
        //Assert
        Assert.assertEquals(expected, actual);
    }


    @org.junit.Test(expected = OperationNotSupportedException.class)
    public void removeFromEmptyDatabase() throws Exception {
        Database database = new Database();
        //Act
        database.remove();
    }


    @org.junit.Test
    public void removeLastElement() throws Exception {
        Database database = new Database(1, 2, 3);
        //Arrange
        Integer expected = 3;
        //Act
        Integer actual = database.remove();
        //Assert
        Assert.assertEquals(expected, actual);


    }


}