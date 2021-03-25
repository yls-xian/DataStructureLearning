package TreeLearning;

import sun.reflect.generics.tree.Tree;

import javax.swing.tree.TreeNode;

/**
 * @author yulinsheng
 * @time 2021-03-24 15:38
 */
public class TreeNodeTest {
//    定义节点的值
   private int no;
   private String name;
   private TreeNodeTest left;
   private TreeNodeTest right;
   public TreeNodeTest(int no,String name){
        super();
        this.no =  no;
        this.name = name;
   }

}
