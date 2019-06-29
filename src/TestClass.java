import org.junit.Test;
import org.testng.AssertJUnit;
import static org.junit.Assert.*;

public class TestClass {

    static Calculator calculator= new Calculator();

    public static void testForEmptyString(){
        String emptyString="";
        assertEquals(calculator.Add(emptyString),1);
    }

    public static void main(String [ ] args)
    {
       testForEmptyString();
    }



}
