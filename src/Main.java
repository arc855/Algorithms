import com.array.algorithm.BirthdayCakeCandles;
import com.array.algorithm.StairCase;
import com.basics.FactorialOfNumber;
import com.linkedlist.algorithm.*;
import com.sorting.algorithms.CountingSort;
import com.sorting.algorithms.FindMissingNumber;
import com.sorting.algorithms.InsertionSort;
import com.sorting.algorithms.InsertionSort1;
import com.srting.algorithm.*;
import com.stringbufferAndstingbuilder.CallBufferAndBuilder;
import com.twodimensional.array.*;

import java.lang.reflect.GenericArrayType;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[]{10, 2, 3,9,3,6};

//        System.out.println("Initial Array :" + Arrays.toString(myArray));
//        SelectionSort selectionSort = new SelectionSort();
////        selectionSort.selectionSortingTeq(myArray);
        InsertionSort insertionSort = new InsertionSort();
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

//        KthLargestAndSmallestElement kthLargestElement = new KthLargestAndSmallestElement();
//        System.out.println("kth largest element : "+kthLargestElement.kthLargestvalue(myArray,2));
//        System.out.println("kth smallest element : "+kthLargestElement.kthsmallestvalue(myArray,2));
//
//        OccuranceOfInteger occuranceOfInteger = new OccuranceOfInteger();
//        System.out.println("Occurance of an INteger  : "+ occuranceOfInteger.occuranceofAnInteger(myArray,10));
//        Basics basics = new Basics();
//        basics.declareAndPrint2DArray();
        int[][] twoDarray = new int[][]{{1,2},{0,2}};

//        MakeWholeRowColZero makeWholeRowColZero = new MakeWholeRowColZero();
//        makeWholeRowColZero.makeRowColZeroIfZero(twoDarray);

//        SumoftwoDarray sumoftwoDarray = new SumoftwoDarray();
//        System.out.println("Sum of two d array is : "+sumoftwoDarray.sumof2Darray(twoDarray));
        int[][] twoDarray1 = new int[][]{{1,10},{5,0},{100,2},{0,20}};
        List<Integer> mylist = new ArrayList<>(
                Arrays.asList(1, 2, 3,4));


        SortMatrix sortMatrix = new SortMatrix();
//        sortMatrix.sortMatrix(twoDarray);
//        sortMatrix.sortGivenMatrix(twoDarray1,2);
//        FindMaxInEachRow findMaxInEachRow = new FindMaxInEachRow();
//        findMaxInEachRow.findMaxInEachRow(twoDarray1);

//        SumOfLinkedList sumOfLinkedList = new SumOfLinkedList();
        ReversedList reversedList = new ReversedList();
//        System.out.println(reversedList.reverseList(mylist));
        Rotation rotation = new Rotation();
//        rotation.rightRotation(1,mylist);
        HackerrankInString hackerrankInString = new HackerrankInString();
//        System.out.println(hackerrankInString.hackerrankInString("arhanackergrailknk"));
        SortAlphanumeric sortAlphanumeric = new SortAlphanumeric();
        String[] arrStr = new String[] {"fa10","b32","caba522"};
//        sortAlphanumeric.sortAlphaNumeric(arrStr);

        //======================================================================
//        CallBufferAndBuilder callBufferAndBuilder = new CallBufferAndBuilder();
//        callBufferAndBuilder.callBuffer();
//        callBufferAndBuilder.callBuilder();

        String[] words = new String[] {"This", "is", "an", "example", "of", "text", "justification."};
        int max_width = 16;
        FormateToMaxWidth formateToMaxWidth = new FormateToMaxWidth();
        formateToMaxWidth.justify(words,max_width);
//        System.out.println(formateToMaxWidth.justify(words,max_width));
        StopWords stopWords = new StopWords();
        String[] stopwords = new String[]{"I","as", "to", "you", "your", "but", "be", "a"};
        String paragraph = "I want to figure out how I can be a better data scientist";
//        System.out.println(paragraph);
//        System.out.println(stopWords.stopwordsStripped(paragraph,stopwords));
        StringConstruction stringConstruction = new StringConstruction();
//        System.out.println(stringConstruction.stringConstruction("ababcc"));
        Pangrams pangrams = new Pangrams();
//        System.out.println(pangrams.pangrams("WwmdRukNYPMFBxYFPVtZrzs FAktokrLtdPy"));

        DiagonalDifference diagonalDifference = new DiagonalDifference();
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(11);
        list1.add(2);
        list1.add(4);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(10);
        list3.add(8);
        list3.add(-12);

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(list1);
        arr.add(list2);
        arr.add(list3);
//        System.out.println("differece of two diagnoal  : "+diagonalDifference.diagonalDifference(arr));
        StairCase stairCase = new StairCase();
//        stairCase.staircase(4);
        BirthdayCakeCandles birthdayCakeCandles  = new BirthdayCakeCandles();
        List<Integer> candles = new ArrayList<>(
                Arrays.asList(4,4,1,3));
//        System.out.println("how many candles are tallest : "+birthdayCakeCandles.birthdayCakeCandles(candles));
        TimeConversion timeConversion = new TimeConversion();
//        System.out.println(timeConversion.timeConversion("12:45:54PM"));
        MakeClock makeClock = new MakeClock();
//        makeClock.watchTime();
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1,2,3,4,5,7));
        PlusMinus plusMinus = new PlusMinus();
//        plusMinus.plusMinus(pm);
        GradingStudents gradingStudents = new GradingStudents();
//        System.out.println(gradingStudents.gradingStudents(list));
        FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
//        factorialOfNumber.extraLongFactorials(25);

        InsertionSort1 insertionSort1 = new InsertionSort1();
//        insertionSort1.insertionSort1(14,list);

        CountingSort countingSort = new CountingSort();
//        System.out.println(countingSort.countingSort(list));
        FindMissingNumber findMissingNumber = new FindMissingNumber();
        System.out.println(findMissingNumber.findMissinNumber(list));







    }
}