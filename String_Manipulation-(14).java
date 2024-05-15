// Program :14
// Java program to implement String Manipulation

class String_Manipulation{
    public static void main(String[] args) {

        // Print the Original String
        System.out.println("The Original String:");
        String s="I am a Student";
        System.out.println(s);
        System.out.println("The character at index 2 is: "+s.charAt(2));
        System.out.println("The length of given String is: "+s.length());
        System.out.println("The substrig from index 4:"+s.substring(4));
        System.out.println("The substring from index 5 to 10:"+s.substring(5,10));
        System.out.println("Checks the string contains the given string:"+s.contains("am"));
        System.out.println("Checks the string are equal or not:"+s.equals("am student"));
        System.out.println("The concatenated string:"+s.concat(",my name is Rahul"));
        System.out.println("The replaced string:"+ s.replace('I','i'));
        System.out.println("Checks the strings are equal or not (Ignoring the case):"+s.equalsIgnoreCase("I am a student"));
        System.out.println();

        System.out.println("The index of char 'a' is: "+s.indexOf('a'));
        System.out.println("The trimmed String is: "+s.trim());
        System.out.println("The lowercase String is : "+s.toLowerCase());
        System.out.println("The Uppercase String is : "+s.toUpperCase());
        System.out.println("Checks the string starts with the specified string:"+s.startsWith("Iam"));
        System.out.println("Checks the string ends with the specified string "+s.endsWith("student"));
    
    }
}