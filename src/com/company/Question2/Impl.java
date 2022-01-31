package com.company.Question2;
import com.company.Question2.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Impl {
    public static void run() {
        TreeNode<Integer> rootNode = new TreeNode<>(100);
        TreeNode<Integer> node20 = new TreeNode<>(20);
        TreeNode<Integer> node130 = new TreeNode<>(130);
        TreeNode<Integer> node10 = new TreeNode<>(10);
        TreeNode<Integer> node50 = new TreeNode<>(50);
        TreeNode<Integer> node110 = new TreeNode<>(110);
        TreeNode<Integer> node140 = new TreeNode<>(140);
        TreeNode<Integer> node5 = new TreeNode<>(5);

        rootNode.left = node20;
        rootNode.right = node130;
        node20.left = node10;
        node20.right = node50;
        node10.left = node5;
        node5.left = node110;
        node130.right = node140;

        Tree<Integer> tree = new Tree<>(rootNode);
        List<TreeNode<Integer>> longestPath = tree.findLongestPath();
        printListOfTreeNodes(longestPath);
        System.out.println("This Method is not yet implemented");
    }

    public static void printListOfTreeNodes(List<TreeNode<Integer>> list) {
        for (TreeNode<Integer> node : list) {
            System.out.print(node.data);
            System.out.print("->");
        }
    }
}
