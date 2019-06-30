import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {


    public Calculator(){}
    public int parseToInt(String string){

        return Integer.parseInt(string);
    }
    public String [] getNumbers(String numbers){

        if(numbers.startsWith("//")){
            Matcher m = Pattern.compile("//(.+)(.+)\n(.*)").matcher(numbers);
            m.matches();
            String defaultDelimiters = m.group(1);
            String nextDelimiter = m.group(2);
            String numbers2 = m.group(3);
            return numbers2.split("("+defaultDelimiters+"|"+nextDelimiter+")");
        }
        else return numbers.split("\\n|\\,");

    }
    public boolean checkNegatives(String values[]) {
    boolean decision=false;
        for (int i = 0; i < values.length; i++) {
            if (parseToInt(values[i]) < 0) {
                decision=true;
                System.out.println("Negatives not allowed : " + parseToInt(values[i]));
            }

        }
        if (decision) return true;
        else
        return false;
    }
    public int Add(String values){

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
                    if(!checkNegatives(splitted)) {
                        if (parseToInt(splitted[i]) >= 1000) continue;

                        Sum += parseToInt(splitted[i]);
                    }
                }

                return Sum;
            }

        }
        else if(values.contains("//"))
        {
           splitted=getNumbers(values);

            for(int i=0;i<splitted.length;i++){

                if(!checkNegatives(splitted)) {
                    if (parseToInt(splitted[i]) >= 1000) continue;
                    Sum += parseToInt(splitted[i]);
                }
            }
            return Sum;

        }

    return x;
    }

}
