package collections;

import collections.data.model.Student;

import java.util.*;

public class CollectionsDemo {

    public static void main(String... args) {

    }


    private static void listIterator() {

        Collection<Integer> collection = new ArrayList<>();
        Iterator<Integer> iterator = collection.iterator();

        while (iterator.hasNext()) {
            Integer currentElement = iterator.next();
            if (currentElement < 10) {
                iterator.remove();
            }
        }


        for (Integer integer : collection) {
            if (integer < 10) {
                collection.remove(integer);
            }
        }
    }

    private static void listAddElements() {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add(2, "Pear");
        System.out.println(fruits.get(3));

        fruits.set(1, "Cherry");
        fruits.remove(2);
        System.out.println(fruits);

    }


    private static void setAddElements() {

        // hash set implementation
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(5);

        System.out.println(hashSet);



        // tree set implementation
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(4);
        System.out.println(treeSet);


        // lined hash set implementation

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        linkedHashSet.add(3);

        System.out.println(linkedHashSet);
    }



    private static void mapDemo() {

        Map<String, Student> studentMap = new HashMap<>();


        studentMap.put("ST01", new Student("Nicolae", 24));
        studentMap.put("ST02", new Student("Florin", 21));
        studentMap.put("ST03", new Student("Adrian", 19));
        studentMap.put("ST04", new Student("Liviu", 22));

        System.out.println(studentMap.get("ST03")); //Student{name = Adrian, age = 19}

        studentMap.put("ST03", new Student("Denisa", 20));

        System.out.println(studentMap.get("ST03")); //Student{name = Denisa, age = 20}

        System.out.println(studentMap.remove("ST01")); // Student{name = Nicolae, age = 24}

        System.out.println(studentMap);
        // {ST03=Student{name = Denisa, age = 20}, ST04=Student{name = Liviu, age = 22}, ST02=Student{name = Florin, age = 21}}

    }


    private static void comparableDemo() {


        List<Student> studentList = Arrays.asList(

                new Student("Nicolae", 24),
                new Student("Florin", 19),
                new Student("Adrian", 19),
                new Student("Liviu", 22)
        );


        Collections.sort(studentList);

        System.out.println(studentList);
        // [Student{name = Adrian, age = 19}, Student{name = Florin, age = 19}, Student{name = Liviu, age = 22}, Student{name = Nicolae, age = 24}]

    }


//    private static void comparatorDemo() {
//
//        List<Student> studentList = Arrays.asList(
//
//                new Student("Nicolae", 24, 2),
//                new Student("Florin", 19, 0),
//                new Student("Adrian", 19, 10),
//                new Student("Liviu", 22, 7)
//        );
//
//
//        Collections.sort(studentList, new Student.SortByCoursesNumber());
//
//        System.out.println(studentList);
//        //[Student{name = Florin, age = 19, coursesNumber = 0}, Student{name = Nicolae, age = 24, coursesNumber = 2},
//        // Student{name = Liviu, age = 22, coursesNumber = 7}, Student{name = Adrian, age = 19, coursesNumber = 10}]
//
//
//
//    }

}
