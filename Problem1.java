import java.util.*;

public class Problem1 {
      static String removeOccurrences(String str, String rem) {
  	Stack<Character> stack = new Stack<>();
  int n = str.length();
  int m = rem.length();
  for(int i=0;i<n;i++){
      stack.push(str.charAt(i));
      if(stack.size()>=m){
          String x="";
          for(int j=m-1;j>=0;j--){
              char ch = rem.charAt(j);
              if(ch!=stack.peek()){
                  for(int k=0;k<x.length();k++){
                      stack.push(x.charAt(k));
                  }
                  break;
              }
              else{
                  x=stack.peek()+x;
                  stack.pop();
              }
          }
      }
  }
  StringBuilder sb = new StringBuilder();
  while(stack.size()!=0){
      sb.append(stack.pop());
  }
  sb.reverse();
  return sb.toString();
  }
  public static void main(String[] ar){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a String: ");
    String a= sc.nextLine();
    System.out.println("Enter Occurrence to remove: ");
    String b= sc.nextLine();
    System.out.print("Resultant String: "+removeOccurrences(a,b));
  }
}