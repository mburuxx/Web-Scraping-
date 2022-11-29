public static LinkedList sort(LinkedList ll, int(f)(const void, const void*)) {
    if (ll == null || ll.size() <= 1) {
        return ll;
    }
 
    // create a new linked list
    LinkedList sortedList = new LinkedList();
 
    // get the middle node of the linked list
    int middle = ll.size() / 2;
    Node middleNode = ll.get(middle);
 
    // set the middle node as the root of the new linked list
    sortedList.add(middleNode);
 
    // create two new linked lists: left and right
    // add all the nodes that are before the middle node to the left linked list
    // add all the nodes that are after the middle node to the right linked list
    LinkedList left = new LinkedList();
    LinkedList right = new LinkedList();
 
    for (int i = 0; i < ll.size(); i++) {
        if (i == middle) {
            continue;
        }
        Node current = ll.get(i);
        if (f(current, middleNode) < 0) { // current node is smaller than the middle node
            left.add(current);
        } else { // current node is larger than or equal to the middle node
            right.add(current);
        }
    }
 
    // sort the left and right linked lists
    left = sort(left, f);
    right = sort(right, f);
 
    // add the nodes of the left linked list to the new linked list
    for (int i = 0; i < left.size(); i++) {
        sortedList.add(left.get(i));
    }
 
    // add the nodes of the right linked list to the new linked list
    for (int i = 0; i < right.size(); i++) {
        sortedList.add(right.get(i));
    }
 
    return sortedList;
}

//test the program:
