public class Demo6_task_a{
    public static void main(String[] args){

        final String Red = "\u001B[41m";
        final String Green = "\u001B[42m";
        final String Reset = "\u001B[0m";

        String NUM1= "[      5" ;
        String Num2 = "0%     ]";


        System.out.printf("%s%s%s%s%s\n",Red,NUM1,Green,Num2,Reset);
        
    }
    
}
