# Assignment_2
# **Description**
Welcome aboard, fellow developer. This is where you can find interesting methods (used *Laboratory 1* from the best senior lecturer) using recursion and functions which you are free to use
## **MyArrayList & MyLinkedList**
__MyArrayList__ - ArrayList in Java is used to store dynamically sized collection of elements. Contrary to Arrays that are fixed in size, an ArrayList grows its size automatically when new elements are added to it.
__MyLinkedList__ - The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
### **ArrayList vs. LinkedList**
__How the ArrayList works__
The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

__How the LinkedList works__
The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next container in the list. To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.
  __size()__: Returns the number of elements in the list. g

__contains(Object o)__: Returns true if the list contains the specified element, false otherwise.

__get(int index)__: Returns the element at the specified position in the list.

__add(T item)__: Appends the specified element to the end of the list.

__add(T item, int index)__: Inserts the specified element at the specified position in the list.

__remove(T item)__: Removes the first occurrence of the specified element from the list, if it is present.

__remove2(int index)__: Removes the element at the specified position in the list and returns it.

__indexOf(Object o)__: Returns the index of the first occurrence of the specified element in the list, or -1 if the list does not contain the element.

__lastIndexOf(Object o)__: Returns the index of the last occurrence of the specified element in the list, or -1 if the list does not contain the element.

__sort()__: Sorts the elements in the list in ascending order, according to their natural ordering.

__clear()__: Removes all elements from the list. The list will be empty after this call.

## *Note*: 
__T__ is a generic type parameter that represents the type of elements stored in the list. When creating an instance of MyList, you should specify the type of elements that the list will contain. For example, MyList<String> myList = new MyArrayList<>(); creates a new instance of MyArrayList that can hold string elements.
