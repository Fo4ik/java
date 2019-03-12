package cl9.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap<K, V> implements MyTreeMapInterface<K, V> {

    private class TreeNode implements Comparable<TreeNode> {
        K key;
        V value;
        TreeNode left;
        TreeNode right;

        private TreeNode(K key, V value) {
            this.key = key;
            this.value = value;
        }


        @Override
        public int compareTo(TreeNode o) {
            return ((Comparable) key).compareTo(o.key);
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

    private int count;
    private TreeNode root;


    @Override
    public void clear() {
        root = null;
        count = 0;
    }

    @Override
    public boolean containsKey(K key) {
        checkKey(key);
        return findNode(new TreeNode(key, null), root) != null;
    }

    @Override
    public boolean containsValue(V value) {
        List<TreeNode> list = new ArrayList<>();
        addToList(root, list);

        for (TreeNode node : list) {
            if (node.value.equals(value)) {
                return true;
            }
        }

        return false;
    }

    private void addToList(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        addToList(root.left, list);
        list.add(root);
        addToList(root.right, list);
    }

    @Override
    public V get(K key) {
        checkKey(key);

        TreeNode node = findNode(new TreeNode(key, null), root);
        if (node != null) {
            return node.value;
        } else {
            return null;
        }
    }

    @Override
    public void put(K key, V value) {
        checkKey(key);
        if (root == null) {
            root = new TreeNode(key, value);
        } else {
            TreeNode tmp = findNode(new TreeNode(key, value), root);
            if (tmp != null) {
                tmp.value = value;
            } else {
                addNode(new TreeNode(key, value), root);
            }
        }

        count++;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void remove(K key) {
        TreeNode tmp = new TreeNode(key, null);
        root = removeNodeFromTree(root, tmp);
        count--;
    }

    private TreeNode removeNodeFromTree(TreeNode root, TreeNode nodeToRemove) {
        TreeNode node = root;

        if (node == null) {
            return null;
        }

        if (node.compareTo(nodeToRemove) > 0) {
            node.left = removeNodeFromTree(node.left, nodeToRemove);
        } else if (node.compareTo(nodeToRemove) < 0) {
            node.right = removeNodeFromTree(node.right, nodeToRemove);
        } else {
            if (node.left == null && node.right == null) {
                node = null;
            } else if (node.right == null) {
                node = node.left;
            } else if (node.left == null) {
                node = node.right;
            } else {
                TreeNode tmp = findMinRightNode(node.right);
                node = tmp;
                node.right = removeNodeFromTree(node.right, tmp);
            }
        }

        return node;
    }

    private TreeNode findMinRightNode(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    private TreeNode findNode(TreeNode node, TreeNode root) {
        if (root != null) {
            if (root.compareTo(node) == 0) {
                return root;
            } else {
                TreeNode foundNode = findNode(node, root.left);
                if (foundNode == null) {
                    foundNode = findNode(node, root.right);
                }
                return foundNode;
            }
        } else {
            return null;
        }
    }


    private void addNode(TreeNode node, TreeNode root) {
        if (node.compareTo(root) < 0) {
            if (root.left == null) {
                root.left = node;
            } else {
                addNode(node, root.left);
            }
        } else if (node.compareTo(root) > 0) {
            if (root.right == null) {
                root.right = node;
            } else {
                addNode(node, root.right);
            }
        }
    }

    private void checkKey(K key) {
        if (!(key instanceof Comparable)) {
            try {
                throw new IllegalAccessException("Wrong key!");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        List<TreeNode> list = new ArrayList<>();
        addToList(root, list);
        StringBuilder sb = new StringBuilder();

        sb.append("{");

        for (TreeNode node : list) {
            sb.append(node.toString());
            sb.append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        sb.append("}");

        return sb.toString();
    }
}