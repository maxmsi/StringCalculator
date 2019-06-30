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

    public static void twoNumbersSum10(String values){
        assertEquals(calculator.Add(values),10);

    }

    public static void manyNumbersSum25(String values){

        assertEquals(calculator.Add(values),25);
    }

    public static void testForTwoDelimeters10(String values){

        assertEquals(calculator.Add(values),10);
    }

    public static void testForSetingDelimiter(){

        assertEquals(calculator.Add("//&&&&&&&&\n1&&&&&&&&3&&&&&&&&3"),7);
    }
    public static void testForNegatives(String values){
            try{
                assertEquals(calculator.Add(values),3);
            } catch(RuntimeException ex){
                //ok
            }



    }
    public static void ignoreBiggerThan1000(String values){

        assertEquals(calculator.Add(values),1003);
    }

    public static void main(String [ ] args)
    {
       //testForEmptyString();
       //testForOneNumber("1");
       //twoNumbersSum10("5,1,1,1,1,1");
       //manyNumbersSum25("10,5,2,2,1,4,1");
       //testForTwoDelimeters10("1\n3\n1,5");
       testForSetingDelimiter();
       //testForNegatives("-1,-4,1000");
       //ignoreBiggerThan1000("5,1000,2000,998");



    }





}
