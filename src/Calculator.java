public class Calculator {


    public Calculator(){}

    public int Add(String values){
        int x;
        if(values.isEmpty()) {
            return 0;
        }

        else{
             x=Integer.parseInt(values);
             }

    return x;
    }

}
