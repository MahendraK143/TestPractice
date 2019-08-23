package Java8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BinaryTree {
    private static Node root,temp;
    private static Node mainRoot[] = new Node[5];
    private static int lineNo=1,indexRootNode=0;
    public static void main(String arg[]) throws FileNotFoundException, IOException {
        FileReader fr=new FileReader("/Users/698675/ForceTeam/Aegis/facade/TestPractive/src/Java8/test.txt");
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while(line!=null)
        {
            if(lineNo > 2) {
                String nums[] = line.split(",");
                root = mainRoot[indexRootNode];
                new BinaryTree().createNode(nums);
            }
            lineNo+=1;
            line=br.readLine();
        }
        br.close();
        dispayAllPaths();
    }
    public static void dispayAllPaths(){
        for (int i=0;i<5;i++) {
            root = mainRoot[i];
            dispayAllPaths(root);
        }

    }
    static void dispayAllPaths(Node node)
    {
        int path[] = new int[1000];
        printPaths(node, path, 0);
    }
    static void printPaths(Node node, int path[], int pathLen)
    {
        if (node == null)
            return;
        path[pathLen] = node.data;
        pathLen++;
        if (node.left == null && node.right == null)
            printArray(path, pathLen);
        else
        {
            printPaths(node.left, path, pathLen);
            printPaths(node.right, path, pathLen);
        }
    }
    static void printArray(int ints[], int len)
    {
        int i;
        for (i = 0; i < len; i++)
        {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }
    public void createNode(String []nums) {
        Node node = new Node(Integer.parseInt(nums[0]));
        if(nums.length==1) {
            mainRoot[++indexRootNode] = node;
            return;
        }
        boolean loop = false;
        do {
            if (root == null) {
                node.left = new Node(Integer.parseInt(nums[1]));
                root = node;
                mainRoot[indexRootNode] = root;
                break;
            } else if(root.data == node.data && root.left == null && root.right == null){
                root.left = new Node(Integer.parseInt(nums[1])); break;
            } else if(root.data == node.data && root.left != null && root.right == null){
                root.right = new Node(Integer.parseInt(nums[1])); break;
            } else if(root.data == node.data && root.right != null && root.left == null){
                root.left = new Node(Integer.parseInt(nums[1])); break;
            } else if(root.left != null && isNodeAvailable(root.left,node)){
                temp = root;
                root = root.left;
                createNode(nums);
                temp.left = root;
                mainRoot[indexRootNode] = temp;
                break;
            } else if( root.right !=null && isNodeAvailable(root.right,node)) {
                root = root.right;
                createNode(nums);
                temp.right = root;
                root = temp;
                mainRoot[indexRootNode] = temp;
                break;
            } else {
                node = new Node(Integer.parseInt(nums[0]));
                node.left = new Node(Integer.parseInt(nums[1]));
                Node n = getNode(node.left);
                if (n!=null){
                    node.left = n;
                }
                mainRoot[++indexRootNode] = node;
            }
        } while (loop);
    }
    public static Node getNode(Node node) {
        for (int i=0;i<5;i++) {
            root = mainRoot[i];
            do {
                if(root.data == node.data) {
                    return root;
                } else if(root.left != null && isNodeAvailable(root.left,node)) {
                    root = root.left;
                } else if(root.right != null && isNodeAvailable(root.right,node)) {
                    root = root.right;
                } else {
                    return null;
                }
            } while (root!=null);
        }
        return null;
    }
    public static boolean isNodeAvailable(Node root,Node node) {
        do {
            if(root.data == node.data) {
                return true;
            } else if(root.left != null) {
                root = root.left;
            } else if(root.right != null) {
                root = root.right;
            } else {
                return false;
            }
        } while (root!=null);
        return false;
    }
}
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}