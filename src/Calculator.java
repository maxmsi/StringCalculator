public class Calculator {


    public Calculator(){}
    public int parseToInt(String string){

        return Integer.parseInt(string);
    }


    public int Add(String values){
        int x=400,Sum=0;
        String [] splitted=values.split("\\n|\\,");


        if(values.isEmpty()) {
            return 0;
        }

        else if (!values.isEmpty()){

            if(splitted.length<2) {

                x = parseToInt(values); }


            else {

                for(int i=0;i<splitted.length;i++){
                    Sum +=parseToInt(splitted[i]);
                }

                return Sum;
            }

        }



    return x;
    }

}
