package com.gabryel.exercicios.exercicio2;

import java.util.Objects;

public class BinaryTreeInteger {

    private TreeNode root;

    /**
     * Adds a new node with the given value to the tree. If the tree is empty,
     * the new node becomes the root. Otherwise, the new node is inserted in
     * the appropriate position in the tree.
     *
     * @param value the value to be added to the tree
     */
    public void add(Integer value) {
        this.root = insertRecursive(this.root, value);
    }

    /**
     * Recursively inserts a node into a binary search tree.
     *
     * @param node  the current node being traversed
     * @param value the value to be inserted
     * @return the root of the subtree after the new node has been inserted
     */
    private TreeNode insertRecursive(TreeNode node, Integer value) {
        if (node == null) return new TreeNode(value);

        if (value < node.getValue()) node.setLeft(insertRecursive(node.getLeft(), value));
        else if (value > node.getValue()) node.setRight(insertRecursive(node.getRight(), value));

        return node;
    }

    /**
     * Returns true if the tree contains a node with the given value, false
     * otherwise.
     *
     * @param value the value to be searched for in the tree
     * @return true if the tree contains a node with the given value, false otherwise
     */
    public boolean exists(Integer value) {
        return existsRecursive(this.root, value);
    }

    /**
     * Recursively searches for a node with the given value in the binary
     * search tree.
     *
     * @param node  the current node being traversed
     * @param value the value to be searched for in the tree
     * @return true if the tree contains a node with the given value, false otherwise
     */
    private boolean existsRecursive(TreeNode node, Integer value) {
        if (node == null) return false;

        if (Objects.equals(value, node.getValue())) return true;

        else if (value < node.getValue())
            return existsRecursive(node.getLeft(), value);
        else
            return existsRecursive(node.getRight(), value);
    }

    /**
     * Determines if the given binary tree is a subtree of this binary tree.
     *
     * @param outraArvore the binary tree to check as a subtree
     * @return true if the given binary tree is a subtree, false otherwise
     */
    public boolean containsSubTree(BinaryTreeInteger outraArvore) {
        return containsSub(this.root, outraArvore.root);
    }

    /**
     * Checks whether the subtree rooted at node2 is a subtree of the tree rooted at node1.
     *
     * @param node1 the root of the main tree to check
     * @param node2 the root of the subtree to verify
     * @return true if the subtree rooted at node2 is a subtree of the tree rooted at node1, false otherwise
     */
    private boolean containsSub(TreeNode node1, TreeNode node2) {
        // Caso base 1: Se a subárvore estiver vazia, ela está contida em qualquer árvore
        if (node2 == null) return true;

        // Caso base 2: Se a árvore principal estiver vazia, a subárvore não está contida
        if (node1 == null) return false;

        // Se os valores das raízes forem iguais, verificamos se as subárvores também são iguais
        if (Objects.equals(node1.getValue(), node2.getValue()))
            return containsSub(node1.getLeft(), node2.getLeft()) && containsSub(node1.getRight(), node2.getRight());

        // Se os valores não forem iguais, continuamos a busca nas subárvores da árvore principal
        return containsSub(node1.getLeft(), node2) || containsSub(node1.getRight(), node2);
    }

    public void remove(Integer value) {
        this.root = removeRecursive(this.root, value);
    }

    private TreeNode removeRecursive(TreeNode node, Integer value) {
        if (node == null) return node;

        if (value < node.getValue()) {
            node.setLeft(removeRecursive(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(removeRecursive(node.getRight(), value));
        } else {
            if (node.getLeft() == null && node.getRight() == null) return null;

            if (node.getLeft() == null) return node.getRight();

            if (node.getRight() == null) return node.getLeft();

            // Caso 4: Nó com dois filhos
            TreeNode temp = minValue(node.getRight());
            node.setValue(temp.getValue());
            node.setRight(removeRecursive(node.getRight(), temp.getValue()));
        }

        return node;
    }

    private TreeNode minValue(TreeNode no) {
        while (no.getLeft() != null) {
            no = no.getLeft();
        }
        return no;
    }

}