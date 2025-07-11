package BT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Represents a binary tree implementation.
 */
public class BTImplementation {

    // Represents a node in the binary tree.

    public static class Node {
        private int val;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }

    }

    private static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();

        if(root != null)q.add(root);

        while(q.size() > 0){
            Node temp = q.peek();
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(temp.val + " ");
            q.remove();
        }
    }

    private static void nthLevelDisplay(Node root, int n) {
        if (root == null) return;
        if(n == 1) {
            System.out.print(root.val + " ");
        }
        nthLevelDisplay(root.left, n-1);
        nthLevelDisplay(root.right, n-1);
    }


    private static void preOrderDisplay(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrderDisplay(root.left);
        preOrderDisplay(root.right);
    }

    private static void inOrderDisplay(Node root) {
        if (root == null) return;
        inOrderDisplay(root.left);
        System.out.print(root.val + " ");
        inOrderDisplay(root.right);
    }

    private static void postOrderDisplay(Node root) {
        if (root == null) return;
        postOrderDisplay(root.left);
        postOrderDisplay(root.right);
        System.out.print(root.val + " ");
    }

    private static int size(Node root) {
        if (root == null) return 0;
        return  1 + size(root.left) + size(root.right);
    }

    private static int sum(Node root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    private static int product(Node root) {
        if (root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }

    private static int min(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = min(root.left);
        int c = min(root.right);
        return Math.min(a,Math.min(b,c));
    }

    private static int max(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }

    private static int height(Node root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }






    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(3);
        Node b = new Node(5);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(6);
        a.left = c;
        a.right = d;
        Node e = new Node(8);
        Node f = new Node(1);
        b.left = e;
        b.right = f;
        Node g = new Node(10);
        Node h = new Node(9);
        d.left = g;
        e.right = h;

//        preOrderDisplay(root);
//        System.out.println();
//
//        inOrderDisplay(root);
//        System.out.println();
//
//        postOrderDisplay(root);
//        System.out.println();
//
//        System.out.println(size(root));
//
//        System.out.println(sum(root));
//
//        System.out.println(product(root));
//
//        System.out.println(min(root));
//
//        System.out.println(max(root));
//
//        System.out.println(height(root));



//        nthLevelDisplay(root,1);
//        System.out.println();
//
//        nthLevelDisplay(root,2);
//        System.out.println();
//
//        nthLevelDisplay(root,3);
//        System.out.println();
//
//        nthLevelDisplay(root,4);
//        System.out.println();
//
//        int level = height(root) + 1;
//        for(int i = 1; i <= level; i++){
//            nthLevelDisplay(root, i);
//            System.out.println();
//        }

        bfs(root);


    }
}

