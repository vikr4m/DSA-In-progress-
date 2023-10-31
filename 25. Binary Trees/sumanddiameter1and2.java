public class sumanddiameter1and2{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        
        int lsum = sum(root.left);
        int rsum = sum(root.right);
        return lsum+rsum+root.data;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int diameter1(Node root){      //O(n^2) this approach calculates height and diameter which takes more time
        if(root == null){
            return 0;
        }
        
        int leftd = diameter1(root.left);
        int lefth = height(root.left);
        int rightd = diameter1(root.right);
        int righth = height(root.right);
        
        int selfd = lefth+righth+1;

        return Math.max(leftd, Math.max(rightd, selfd));
    }

    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root){       //O(n)
        if(root == null){
            return new Info(0, 0);
        }
        
        Info leftinfo = diameter2(root.left);
        Info rightinfo = diameter2(root.right);
    
        int diam = Math.max(leftinfo.ht+rightinfo.ht+1,Math.max(leftinfo.diam, rightinfo.diam));
        int ht = Math.max(leftinfo.ht, rightinfo.ht) + 1;

        return new Info(diam, ht);
    }
    
    public static void main(String[] args) {
        /*
             1
            / \
           2   3
          / \  / \
         4   5 6  7

         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Sum of nodes: "+sum(root));
        //System.out.println("Diameter of nodes: "+diameter1(root));
        System.out.println("Diameter of nodes: "+diameter2(root).diam);
    }
}