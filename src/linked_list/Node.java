package linked_list;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node() {
    }


    // 9 5 1 15 2 19 6 11 10

    public static void main(String[] args) {
        Node node = new Node(1);
        node = addLast(node, 3);
        node = addLast(node, 5);


        node = removeByIndex(node, 0);

        for (Node tmp = node; tmp != null; tmp = tmp.next) {
            System.out.println(tmp.data);
        }
    }


    public static Node addFirst(Node node, int newData) {
        Node newNode = new Node(newData);
        newNode.next = node;
        node = newNode;
        return node;
    }


    public static int getLast(Node node) {
        if (node == null) return -1;
        while (node.next != null) {
            node = node.next;
        }
        return node.data;
    }

    public static Node addLast(Node node, int newData) {
        Node newNode = node;

        if (node == null) {
            return new Node(newData);
        }

        while ((node.next != null)) {
            node = node.next;
        }


        node.next = new Node(newData);

        return newNode;
    }


    public static int indexOf(Node node, int data) {
        int index = 0;
        Node current = node;

        if (node == null) return -1;

        while (current != null) {
            if (current.data == data) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;

    }

    public static int getByIndex(Node node, int index) {
        int count = 0;
        if (node == null) return -1;
        if (count == index) return node.data;
        return getByIndex(node.next, index - 1);
    }


    public static Node merge(Node node1, Node node2) {
        if (node1 == null)
            return node2;
        if (node2 == null)
            return node1;

        if (node1.data < node2.data) {
            node1.next = merge(node1.next, node2);
            return node1;
        } else {
            node2.next = merge(node1, node2.next);
            return node2;
        }
    }


    public static boolean isSorted(Node node) {
        if (node == null) return true;
        for (Node t = node; t.next != null; t = t.next)
            if (t.data > t.next.data) return false;

        return true;
    }


    public static int[] toArray(Node node) {
        int arraySize = 0;

        //find size to create array
        for (Node x = node; x != null; x = x.next) {
            arraySize++;
        }


        int[] resultArray = new int[arraySize];
        int i = 0;
        //fill array with values
        for (Node x = node; x != null; x = x.next) {
            resultArray[i++] = x.data;
        }
        return resultArray;
    }


    public static String toString(Node node) {
        if (node == null) return "";
        StringBuilder result = new StringBuilder();
        Node current = node;
        while (current.next != null) {
            result.append(current.data);
            result.append(" -> ");
            current = current.next;
        }
        result.append(current.data);
        return result.toString();
    }

    public static Node reverse(Node node) {
        if (node == null) {
            return null;
        }

        Node current = node;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static Node sort(Node node) {
        // Node current will point to head
        Node current = node, index = null;
        int temp;

        while (current != null) {
            // Node index will point to node next to
            // current
            index = current.next;

            while (index != null) {
                // If current node's data is greater
                // than index's node data, swap the data
                // between them
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }

                index = index.next;
            }
            current = current.next;
        }
        return node;
    }


    public static Node removeElem(Node node, int data) {
        Node current = node;
        Node temp = null;

        if (current != null && current.data == data) {
            node = current.next;
            return node;
        }

        while (current != null && current.data != data) {
            temp = current;
            current = current.next;
        }

        if (current == null) {
            return node;
        }

        temp.next = current.next;
        return node;
    }


    public static int size(Node node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    public static Node deleteFirst(Node node) {
        Node temp = node;
        if (node != null) {
            node = node.next;
            temp = null;
            return node;
        }
        return temp;
    }

    public static Node deleteLast(Node head) {
        if (head == null) {
            return head;
        }

        if (head.next == null) {
            Node temp = head;
            head = head.next;
            return temp;
        }

        Node current = head;
        Node previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public static Node removeByIndex(Node node, int index) {
        int size = size(node);

        if (index < 0 || index >= size) {
            return node;
        } else if (index == 0) {
            return deleteFirst(node);
        } else if (index == size - 1) {
            deleteLast(node);
        } else {
            Node temp = node;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            --size;
        }
        return node;
    }
}



