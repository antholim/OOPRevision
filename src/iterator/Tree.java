package iterator;

import java.util.Stack;

public class Tree<Integer> implements Container {
    private Node<Integer> root;

    public Tree() {
        this.root = new Node<>(10);
        root.left = new Node<>(5);
        root.right = new Node<>(15);

        /**
         *        10
         *       /  \
         *      5    15
         */
    }

    @Override
    public Iterator createIterator() {
        return new TreeIterator(root);
    }

    private class TreeIterator implements Iterator {
        private Stack<Node<Integer>> stack = new Stack<>();

        public TreeIterator(Node<Integer> root) {
            if (root != null)
                stack.push(root);
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public Object next() {
            if (!hasNext()) return null;

            Node<Integer> current = stack.pop();

            // DFS: push right first, then left
            if (current.right != null)
                stack.push(current.right);

            if (current.left != null)
                stack.push(current.left);

            return current.data;   // return the value
        }
    }

    // ✔ Move Node outside TreeIterator so Tree can build nodes
    private static class Node<Integer> {
        int data;
        Node<Integer> left;
        Node<Integer> right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
