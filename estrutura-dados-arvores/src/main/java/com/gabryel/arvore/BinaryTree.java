package com.gabryel.arvore;

import org.w3c.dom.Node;

import java.util.List;

public class BinaryTree<T extends Comparable<T>> implements Tree<T> {
    private TreeNode<T> root;

    @Override
    public void add(T element) {
        TreeNode<T> newNode = new TreeNode<>(element);

        if (root == null)
            root = newNode;
        else {
            TreeNode<T> auxNode = root;

            while (auxNode != null) {
                T info = auxNode.getInfo();

                if (element.compareTo(info) == 0) break;

                if (element.compareTo(info) > 0) {
                    if (auxNode.getRightNode() == null) {
                        auxNode.setRightNode(newNode);
                        break;
                    }

                    auxNode = auxNode.getRightNode();
                } else {
                    if (auxNode.getLeftNode() == null) {
                        auxNode.setLeftNode(newNode);
                        break;
                    }

                    auxNode = auxNode.getLeftNode();
                }
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public int getTreeHeight() {
        return 0;
    }

    @Override
    public int nodeDepth(T element) {
        return 0;
    }

    @Override
    public TreeNode<T> search(T element) {
        if (root != null)
            return binarySearch(root, element);
        return null;
    }

    @Override
    public List<T> preOrder() {
        return List.of();
    }

    @Override
    public List<T> inOrder() {
        return List.of();
    }

    @Override
    public List<T> postOrder() {
        return List.of();
    }

    @Override
    public TreeNode<T> remove(TreeNode<T> tree, T element) {
        if (tree == null)
            return null;

        int comparison = element.compareTo(tree.getInfo());
        if (comparison < 0) {
            tree.setLeftNode(remove(tree.getLeftNode(), element));
        } else if (comparison > 0) {
            tree.setRightNode(remove(tree.getRightNode(), element));
        } else {
            // Nó encontrado

            if (tree.getLeftNode() == null && tree.getRightNode() == null)
                return null;
            else if (tree.getLeftNode() == null)
                return tree.getRightNode();
            else if (tree.getRightNode() == null)
                return tree.getLeftNode();
            else {
                TreeNode<T> temp = minValue(tree.getRightNode());
                tree.setInfo(temp.getInfo());
                tree.setRightNode(remove(tree.getRightNode(), temp.getInfo()));
            }
        }
        return tree;
    }

    @Override
    public int size() {
        return size(this.root);
    }

    /**
     * Recursively calculates the size of the subtree rooted at the given node.
     * The size is defined as the total number of nodes in the subtree.
     *
     * @param node the root node of the subtree
     * @return the size of the subtree
     */
    private int size(TreeNode<T> node) {
        if (node == null)
            return 0;
        else
            return 1 + size(node.getLeftNode()) + size(node.getRightNode());
    }

    /**
     * Finds the node with the minimum value in a given subtree.
     * This is done by traversing the left children of each node
     * until a node with no left child is found.
     *
     * @param node the root node of the subtree to search
     * @return the node with the minimum value in the subtree
     */
    private TreeNode<T> minValue(TreeNode<T> node) {
        TreeNode<T> current = node;
        while (current.getLeftNode() != null) {
            current = current.getLeftNode();
        }
        return current;
    }

    /**
     * Performs a binary search of a given subtree to find a node
     * containing a given element.
     *
     * @param node the root node of the subtree to search
     * @param element the element to search for
     * @return the node containing the element, or null if the element
     *         is not found
     */
    private TreeNode<T> binarySearch(TreeNode<T> node, T element) {
        if (node == null) return null;

        T info = node.getInfo();
        int comparison = element.compareTo(node.getInfo());

        if (comparison == 0)
            return node;
        else if (info.compareTo(element) > 0)
            return binarySearch(node.getRightNode(), element);
        else
            return binarySearch(node.getLeftNode(), element);
    }

}
