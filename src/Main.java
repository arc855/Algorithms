import com.array.algorithm.KthLargestAndSmallestElement;
import com.array.algorithm.OccuranceOfInteger;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[]{10, 2, 3,9,3,6};

//        System.out.println("Initial Array :" + Arrays.toString(myArray));
//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.selectionSortingTeq(myArray);
//        InsertionSort insertionSort = new InsertionSort();
//        insertionSort.insertionSort(myArray);
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSort(myArray);

        //String
//        StringBasics stringBasics = new StringBasics();
//        stringBasics.basicsOfStrings();
//        RevereseString revereseString = new RevereseString();
//        revereseString.reverseString("archanags");
//        System.out.println(StringBasics.isUpperCase("ARCHA"));
//        System.out.println( StringBasics.isLowecase("ARCHA"));
//        System.out.println("is password complex  : "+ stringBasics.isPasswordComplex("Arc5"));
//        System.out.println( stringBasics.normalizeStringData("AR,CHA"));

        //search string
//        SearchInString searchInString = new SearchInString();
//        System.out.println("sub string is present or not :"+ searchInString.substringSearch("ARCHANA"));
//        //searchInString.parseContent("archana");

//        //palindrom
//        PalindromString palindromString = new PalindromString();
//        System.out.println("check palindrom or not : "+palindromString.isPalindrom("archana"));
//        System.out.println("check palindrom or not using check method : "+palindromString.checkPalindrom("madam"));
//
//
//        //practice
//        SubStirngPalindrom subStirngPalindrom= new SubStirngPalindrom();
//        subStirngPalindrom.findAllSubStringPalindrom("abcd");
//        subStirngPalindrom.subStrings("madam");

//
//        ReverseWords reverseWords = new ReverseWords();
//        System.out.println("Reverse Words : "+reverseWords.reverseWords("My name is Stripe"));

//        AnagramString anagramString = new AnagramString();
//        System.out.println("anagram or not : "+anagramString.isStringAnagram("archana","archana"));
//
//        SumOfIntergersValue sumOfIntergersValue = new SumOfIntergersValue();
//        sumOfIntergersValue.integerSumEqValue(myArray,9);

//        MaxAndMin maxAndMin = new MaxAndMin();
//        maxAndMin.maxAndMinValue(myArray);
//        ReverseArray reverseArray = new ReverseArray();
//        System.out.println("reverese array is : "+ Arrays.toString(reverseArray.reverseAnArray(myArray)));
//

        KthLargestAndSmallestElement kthLargestElement = new KthLargestAndSmallestElement();
        System.out.println("kth largest element : "+kthLargestElement.kthLargestvalue(myArray,2));
        System.out.println("kth smallest element : "+kthLargestElement.kthsmallestvalue(myArray,2));

        OccuranceOfInteger occuranceOfInteger = new OccuranceOfInteger();
        System.out.println("Occurance of an INteger  : "+ occuranceOfInteger.occuranceofAnInteger(myArray,10));












    }
}