package com.company.Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tree<T> {
    public TreeNode<T> root;

    public Tree(TreeNode<T> root) {
        this.root = root;
    }

    public List<TreeNode<T>> findLongestPath() {
        int max = 0;
        ArrayList<TreeNode<T>> longestPath = new ArrayList<>();
        TreeNode<T> current = this.root;
        ArrayList<TreeNode<T>> list = new ArrayList<>();
        while (current != null || list.size() > 0) {
            if (current != null) {
                list.add(current);
                current = current.left;
            } else {
                current = list.remove(list.size() - 1);
                if (current.right != null) {
                    current = current.right;
                } else {
                    int temp = list.size();
                    if (temp > max) {
                        max = temp;
                        longestPath = (ArrayList<TreeNode<T>>) list.clone();
                        longestPath.add(current);
                    }
                    current = null;
                }
            }
        }
        return longestPath;
    }
}
