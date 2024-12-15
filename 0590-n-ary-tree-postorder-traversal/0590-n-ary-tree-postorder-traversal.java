/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> al=new ArrayList<>();
        if(root==null)return al;
    Stack<Node> st=new Stack<>();
    st.push(root);
    while(!st.isEmpty()){
        Node current=st.pop();
        al.add(0,current.val);
        for(Node child:current.children){
            st.push(child);
        }
    }
       return al; 
    }
}