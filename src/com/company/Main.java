package com.company;

import com.company.Tests.FirstMostFrequentlyItemTest;
import com.company.Tests.FlattenArrayTest;
import com.company.Tests.MinMaxIndexInArray;
import com.company.Tests.TestChangePosition.TestChangePosition;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //test 1
        System.out.println("Test 1: " + FirstMostFrequentlyItemTest.class);
        String test1Result = new FirstMostFrequentlyItemTest().test("Bootlegger");
        System.out.println(test1Result);

        //test2
        System.out.println("Test 2: " + MinMaxIndexInArray.class);
        var test2Reuslt = new MinMaxIndexInArray().test(new int[]{1, 2, 2, 3, 4, 4, 4, 5}, 4);
        System.out.println(Arrays.toString(test2Reuslt));

        //test3
        System.out.println("Test 3: " + FlattenArrayTest.class);
        Object[] data3 = new Object[]{ 1, 'a', "Hello", new int[]{ 1, 2, 3 }, 21, 87, new Object[]{ 1, 2, new Object[]{ 2, 7, 4 }, 3}};
        ArrayList<Object> arrayList3 = new ArrayList<>();
        arrayList3.add(1);
        arrayList3.add('a');
        arrayList3.add("Hello");
        arrayList3.add(Arrays.asList(1, 2, 3));
        arrayList3.add(21);
        arrayList3.add(87);
        arrayList3.add(Arrays.asList(1, 2, Arrays.asList(2, 7, 4), 3));

        var test3Reuslt = new FlattenArrayTest().test(arrayList3);
        System.out.println(test3Reuslt);

        //test3
        System.out.println("Test 3: " + TestChangePosition.class);
        var test3 = new TestChangePosition();
        test3.Init();
        test3.WriteArray();
        test3.ChangePosition2("e",2);
        test3.WriteArray();
    }
}
