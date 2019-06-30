import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {


    public Calculator(){}
    public int parseToInt(String string){

        return Integer.parseInt(string);
    }

    public String [] getNumbers(String numbers){

        if(numbers.startsWith("//")){
            Matcher m = Pattern.compile("//(.)\n(.*)").matcher(numbers);
            m.matches();
            String defaultDelimiters = m.group(1);
            String numbers2 = m.group(2);
            return numbers2.split(defaultDelimiters);

        }
        else{

            return numbers.split("\\n|\\,");
        }
    }


    public int Add(String values){

        /*

         a separate line that looks like this:
         “//[delimiter]\n[numbers…]” for example “//;\n1;2”
         should return three where the default delimiter is ‘;’ .

         */

        String delimiter []=values.split(("//"));
        int x=400,Sum=0;

        String [] splitted=values.split("\\n|\\,");


        if(values.isEmpty()) {
            return 0;
        }

        else if (!values.isEmpty() && !values.contains("//")){

            if(splitted.length<2) {

                x = parseToInt(values); }


            else {

                for(int i=0;i<splitted.length;i++){
                    Sum +=parseToInt(splitted[i]);
                }

                return Sum;
            }

        }
        else if(values.contains("//"))
        {
           splitted=getNumbers(values);
            for(int i=0;i<splitted.length;i++){
                Sum +=parseToInt(splitted[i]);
            }
            return Sum;

        }



    return x;
    }

}
