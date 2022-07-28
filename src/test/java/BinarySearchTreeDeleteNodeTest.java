// The purpose of this code segment is to provide test code for the insertKey() method in BinarySearchTreeAddNode.

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTreeAddNodeTest {

// Test to delete an existing item from the tree. Prints the tree before and after deletion.

@Test
public void DeleteExistingItemFromTree() {
   BinarySearchTreeDeleteNode bst = new BinarySearchTreeDeleteNode();
   bst.root.key = 45;
   bst.root.left.key = 10;
   bst.root.right.key = 90;
   System.out.println("Tree before deletion \n");
   bst.inorder();
   bst.deleteKey(90);
   System.out.println("\nTree after deletion \n");
   bst.inorder();
   System.out.println();
}

// Test to delete a non-existing item from the tree. Prints the tree before and after attempted deletion.

@Test
public void DeleteNonExistingItemFromTree() {

   BinarySearchTreeDeleteNode bst = new BinarySearchTreeDeleteNode();
   bst.root.key = 45;
   bst.root.left.key = 10;
   bst.root.right.key = 90;
   System.out.println("Tree before deletion \n");
   bst.inorder();
   bst.deleteKey(12);
   System.out.println("\nTree after attempted deletion \n");
   bst.inorder();
   System.out.println();

}

}

