package com.harry;

import android.util.Log;

/**
 * Created by hsingh on 8/26/15.
 */
public class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = first;
        first = newLink;
    }

    public Link find(int key) {
        Link current = first;
        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public Link delete(int key) {
        Link current = first;
        Link temp = first;
        while (current.iData != key) {
            if (current.next == null)
                return null;
            else {
                temp = current;
            }
            current = current.next;
        }
        if (current == first) {
            first = first.next;
        } else {
            temp.next = current.next;
        }
        return current;
//        Link current = first;
//        Link previous = first;
//        while (current.iData != key) {
//            if (current.next == null)
//                return null;
//            else {
//                previous = current;
//            }
//            current = current.next;
//        }
//        if (current == first) {
//            first = first.next;
//        } else {
//            previous.next = current.next;
//        }
//        return current;
    }


    public void displayList() {
        Log.d("test", "List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}
