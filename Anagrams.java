public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        String tempA = a.toLowerCase();
        String tempB = b.toLowerCase();

        // if string length not same return false
        if (tempA.length() != tempB.length()){
            return false;
        }
        char[] array1 = tempA.toCharArray();
        char[] array2 = tempB.toCharArray();

        // sort array
        java.util.Arrays.sort(array1);
        java.util.Arrays.sort(array2);
        // compare sorted arrays

        for (int i=0;i<array1.length;i++){
            if (array1[i] != array2[i]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String a = "Hello";
        String b = "hello";

        // if string same print yes else no
        if (isAnagram(a, b)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println("\nString before reverse: " + a);
        System.out.println("String after reverse: " + b);
    }

}
