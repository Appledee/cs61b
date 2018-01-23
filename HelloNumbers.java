
public class HelloNumbers {
  
public static int NumericStringToInteger (String number){
  if (number == null ) {return 1;}
return Integer.parseInt(number);
}

public static void main (String[] args){
  
  int i = 0;
  int sum = 0;
  String number = "12345";
  int N = 5;

  while (i < N) {
  sum = sum + NumericStringToInteger (number);
  i = i+1;

  }
  
System.out.println(sum);

}


}
