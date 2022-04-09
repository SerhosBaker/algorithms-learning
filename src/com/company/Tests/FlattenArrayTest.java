package com.company.Tests;

import java.util.*;

public class FlattenArrayTest {
    public ArrayList<Object> test(Collection collection)
    {
        var result = new ArrayList<>();
        var queue = new Stack<Iterator>();
        var currentIterator = collection.iterator();
        while (true)
        {
            if(currentIterator.hasNext())
            {
                var next = currentIterator.next();
                if (next instanceof Collection)
                {
                    queue.push(currentIterator);
                    currentIterator = ((Collection<?>) next).iterator();
                }
                else
                    result.add(next);
            }
            else
            {
                if(queue.size()==0)
                    break;
                else
                {
                    currentIterator = queue.pop();
                }
            }
        }

        return result;
    }
}