package com.gabryel.exercicios.exercicio6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    private TreeNode root;

    public void add(Integer element) {
        TreeNode newNode = new TreeNode(element);

        if (this.root == null)
            this.root = newNode;
        else {
            TreeNode auxNode = this.root;

            while (auxNode != null) {
                Integer info = auxNode.getValue();

                if (element.compareTo(info) == 0) break;

                if (element.compareTo(info) > 0) {
                    if (auxNode.getRight() == null) {
                        auxNode.setRight(newNode);
                        newNode.setParent(auxNode);
                        break;
                    }

                    auxNode = auxNode.getRight();
                } else {
                    if (auxNode.getLeft() == null) {
                        auxNode.setLeft(newNode);
                        newNode.setParent(auxNode);
                        break;
                    }

                    auxNode = auxNode.getLeft();
                }
            }
        }
    }


    /**
     * Perform all three types of traversal (pre-order, in-order, post-order) on the tree and
     * return the results as a list of lists.
     * <p>
     * The list returned will contain three lists, each representing the order in which the
     * nodes were traversed. The first list represents the pre-order traversal, the second
     * represents the in-order traversal, and the third represents the post-order traversal.
     *
     * @return a list of lists representing the results of the three traversals
     */
    public List<List<Integer>> traversals() {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();

        preOrderTraversal(this.root, preOrder);
        inOrderTraversal(this.root, inOrder);
        postOrderTraversal(this.root, postOrder);

        result.add(preOrder);
        result.add(inOrder);
        result.add(postOrder);
        return result;
    }

    private void preOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) return;

        list.add(node.getValue());
        preOrderTraversal(node.getLeft(), list);
        preOrderTraversal(node.getRight(), list);
    }

    private void inOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) return;

        inOrderTraversal(node.getLeft(), list);
        list.add(node.getValue());
        inOrderTraversal(node.getRight(), list);
    }

    private void postOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) return;

        postOrderTraversal(node.getLeft(), list);
        postOrderTraversal(node.getRight(), list);
        list.add(node.getValue());
    }

    public List<Integer> nodesWithSameHeightAndDepth() {
        List<Integer> result = new ArrayList<>();
        if (this.root == null) return result;

        // Usamos uma fila para realizar um nível por nível
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this.root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean isSameLevel = true;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (i > 0 && depth(node) != depth(queue.peek())) isSameLevel = false;

                if (node == null) continue;

                if (node.getLeft() != null) queue.add(node.getLeft());

                if (node.getRight() != null) queue.add(node.getRight());

                if (isSameLevel && height(node.getLeft()) == height(node.getRight())) result.add(node.getValue());
            }
        }

        return result;
    }

    // Métodos auxiliares para calcular altura e profundidade
    private int height(TreeNode node) {
        if (node == null)
            return 0;
        else
            return 1 + Math.max(height(node.getLeft()), height(node.getRight()));

    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + depth(node.getParent()); // Assumindo que cada nó tem uma referência para o pai
        }
    }
}
