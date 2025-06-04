class Student {}
class Rockstar {}
class Hacker {}

public static void count(ArrayList mylist) {
    int a = 0, b = 0, c = 0;
    for (Object element : mylist) {
        if (element instanceof Student)
            a++;
        if (element instanceof Rockstar)
            b++;
        if (element instanceof Hacker)
            c++;
    }
    System.out.println(a + " " + b + " " + c);
}
