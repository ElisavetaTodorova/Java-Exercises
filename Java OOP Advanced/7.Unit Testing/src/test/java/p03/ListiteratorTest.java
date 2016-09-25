package p03;

import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

/**
 * Created by ELISAV on 19.9.2016 г..
 */
public class ListiteratorTest {

    @Test(expected = OperationNotSupportedException.class)
    public void constructorToWitchAreGivenNullValues() throws Exception {
        //Act
        Listiterator listiterator=new Listiterator("pesho","gosho",null,"palachinka");
    }

    @Test
    public void hasNextWithEmptyListiterator() throws Exception {

        Listiterator listiterator=new Listiterator();
        //Arrange
        boolean expected=false;
        //Act
        boolean actual=listiterator.hasNext();
        //Assert
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void hasNextWithNotEmptyListiterator() throws Exception {

        Listiterator listiterator=new Listiterator("pesho");
        //Arrange
        boolean expected=true;
        //Act
        boolean actual=listiterator.hasNext();
        //Assert
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void moveWithEmptyListiterator() throws Exception {
        Listiterator listiterator=new Listiterator();
        //Arrange
        boolean expected=false;
        //Act
        boolean actual=listiterator.move();
        //Assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void moveWithNotEmptyListiterator() throws Exception {
        Listiterator listiterator=new Listiterator("Pesho");
        //Arrange
        boolean expected=true;
        //Act
        boolean actual=listiterator.move();
        //Assert
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void printWithNoElements() throws Exception {
        Listiterator listiterator=new Listiterator();
        //Act
        listiterator.print();

    }

    @Test
    public void printWithElements() throws Exception {
        Listiterator listiterator=new Listiterator("Pesho","Gosho");
        //Arrange
        String expected="Gosho";
        //Act
        listiterator.move();
        String actual=listiterator.print();
        //Assert
        Assert.assertEquals(expected,actual);

    }

}