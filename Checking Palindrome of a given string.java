public class Reversingastring {

    public static void main(String[] args) {
     String str="Harshini";
     StringBuilder sb=new StringBuilder(str).reverse();
     System.out.println("The reverse of the string is:"+sb);
     if(str.equals(sb)){
         System.out.println("Palindrome");
     }
     else{
         System.out.println("Not a Palindrome");
     }
    }
}