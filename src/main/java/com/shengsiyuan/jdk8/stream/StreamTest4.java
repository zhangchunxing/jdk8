package com.shengsiyuan.jdk8.stream;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by zhangchunxing on 2017/2/27.
 */
public class StreamTest4 {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("hello", "world", "hello world");
//        String[] stringArray = stream.toArray((value) -> new String[value]);
//        String[] stringArray = stream.toArray(String[]::new);
//        Arrays.asList(stringArray).forEach(System.out::println);
//        List<String> list = stream.collect(Collectors.toList());
//        List<String> list = stream.collect(() -> new ArrayList<String>(),
//                (theList, item) -> theList.add(item),
//                (theList1, theList2) -> theList1.addAll(theList2));
        /**
         * 此时类名::实例方法名（LinkedList::add）==>(theList, item) -> theList.add(item)
         */
//       List<String> list = stream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);

       // List<String> linkedList = new linkedLinkedList<>();
        /**
         *linkedList::add ==> (linkedList, item) -> linkedList.add(item)
         *
         *我整理一下，
         * 1.用LinkedList：：add，编译器把lambda表达式（2个参数）第一个参数作为add方法的调用者，
         * lambda剩下的参数（还有1个参数）传递给add方法作为参数。
         * 2.用linkedList(对象名)：：add，编译器用linkedList这个对象调用add方法，
         * lambda表达式的参数传给add方法（此时lambda2个参数都传给add）,
         * 报错，add只能接受一个参数！
         *
         *至于方法引用返回值的问题，应该有编译器自己完成。
         */
      //  List<String> list = stream.collect(LinkedList::new, linkedList::add, linkedList::addAll);
//        list.forEach(System.out::println);

//        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
//        Set<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(set.getClass());
//        set.forEach(System.out::println);

        Stream<String> stream = Stream.of("hello", "world", "hello world");
        String str = stream.collect(Collectors.joining()).toString();
        System.out.println(str);
    }
}
