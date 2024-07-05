package Class_Codes.Tree;

public class tree {
    static class treenode{
        int val;
        treenode left;
        treenode right;
        public treenode(int data){
            this.val=data;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,8,17,-1,10,5,-1};
        treenode root = pretraversal(0,arr);
// 		print(root);
//        System.out.println(max(root));
//        System.out.println(sum(root));
        System.out.println(countNodes(root));
    }
    static treenode pretraversal(int i,int[]arr){
        if(i>=arr.length||arr[i]==-1) return null;
        treenode newnode = new treenode(arr[i]);
        newnode.left= pretraversal(2*i+1,arr);
        newnode.right =pretraversal(2*i+2,arr);
        return newnode;
    }
    public static int sum(treenode root){
        if(root==null){
            return 0;
        }
        int lsum = sum(root.left);
        int rsum = sum(root.right);
        return lsum+rsum+root.val;
    }
    public static boolean same(treenode root1, treenode root2){
        if(root1==null && root2!=null || root1!=null && root2==null) return false;
        if(root1.val!=root2.val) return false;
        if(root1==null && root2==null) return true;
        return same(root1.left,root2.left)&&same(root1.right,root2.right);
    }
    static int max(treenode root){
        if(root==null){
            return 0;
        }
        int lmax = max(root.left);
        int rmax = max(root.right);
        return Math.max(Math.max(lmax,rmax),root.val);
    }
    static void print(treenode root){
        if(root==null) return ;
        print(root.left);
        System.out.println(root.val);
        print(root.right);
    }
    public static int countNodes(treenode root){
        if(root==null) return 0;
        int l = countNodes(root.left);
        int r = countNodes(root.right);
        return l+r+1;
    }
}
