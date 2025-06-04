public static void printElements(ArrayList<String> list) {
    Iterator it = list.iterator();
    while (it.hasNext()) {
        Object element = it.next();
        if (element.toString().equals("###")) {
            break;
        }
    }
    while (it.hasNext()) {
        System.out.println(it.next());
    }
}
