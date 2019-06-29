import org.junit.Test;
import org.testng.AssertJUnit;
import static org.junit.Assert.*;

public class TestClass {

    static Calculator calculator= new Calculator();

    public static void testForEmptyString(){
        String emptyString="";
        assertEquals(calculator.Add(emptyString),0);
    }

    public static void testForOneNumber(String values){

        assertEquals(calculator.Add(values),1);
    }

    public static void twoNumbersSum(String values){
        assertEquals(calculator.Add(values),6);

    }



    public static void main(String [ ] args)
    {
       testForEmptyString();
       testForOneNumber("1");
       twoNumbersSum("5,1");
    }





}
