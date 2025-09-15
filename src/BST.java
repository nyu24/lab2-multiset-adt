/**
 * A minimal implementation of a binary search tree. See the python version for
 * additional documentation.
 * You can also see <a href="https://www.teach.cs.toronto.edu/~csc148h/notes/binary-search-trees/bst_implementation.html">
 *     CSC148 Course Notes Section 8.5 BST Implementation and Search</a>
 * if you want a refresher on BSTs, but it is not required to complete this assignment.
 */
public class BST {
    // we use Integer here so that we can set the root to null. This is the same idea as
    // how the Python code uses None in the BST implementation.
    private Integer root;

    private BST left;
    private BST right;

    public BST(int root) {
        this.root = root;
        this.left = new BST();
        this.right = new BST();
    }

    /**
     * Alternate constructor, so we don't have to explicitly pass in null.
     */
    public BST() {
        root = null;
        // left and right default to being null
    }


    public boolean isEmpty() {
        return false; // TODO implement me!
    }

    public boolean contains(int item) {
        // provided as an example
        if (this.isEmpty()) {
            return false;
        } else if (item == this.root) {
            return true;
        } else if (item < this.root) {
            return this.left.contains(item);
        }
        return this.right.contains(item);

    }


    public void insert(int item) {
        if (this.isEmpty()){
            this.root = item;
            this.left = new BST();
            this.right = new BST();
        }
        else if (item <= this.root){
            this.left.insert(item);
        }
        else{
            this.right.insert(item);
        }

//        if self.is_empty():
//            # Make new leaf.
//            # Note that self._left and self._right cannot be None when the
//            # tree is non-empty! (This is one of our invariants.)
//        self._root = item
//        self._left = BST(None)
//        self._right = BST(None)
//        elif item <= self._root:
//        self._left.insert(item)
//        else:
//        self._right.insert(item)
    }


    public void delete(int item) {
        if (this.isEmpty()) {}
        else if (item == this.root) {
            this.deleteRoot();
        }
        else if (item < this.root) {
            this.left.delete(item);
        }
        else{
            this.right.delete(item);
        }
//        if self.is_empty():
//        pass
//        elif self._root == item:
//        self.delete_root()
//        elif item < self._root:
//        self._left.delete(item)
//        else:
//        self._right.delete(item)
    }

    private void deleteRoot() {
        if (this.left.isEmpty() && this.right.isEmpty()){
            this.root = null;
            this.left = null;
            this.right = null;
        }
        else if (this.left.isEmpty()){
            this.root = this.right.root;
            this.left = this.right.left;
            this.right = this.right.right;
        }
        else if (this.right.isEmpty()){

        }
//        if self._left.is_empty() and self._right.is_empty():
//        self._root = None
//        self._left = None
//        self._right = None
//        elif self._left.is_empty():
//            # "Promote" the right subtree.
//            # Note that self = self._right does NOT work!
//                self._root, self._left, self._right = \
//        self._right._root, self._right._left, self._right._right
//        elif self._right.is_empty():
//            # "Promote" the left subtree.
//                self._root, self._left, self._right = \
//        self._left._root, self._left._left, self._left._right
//        else:
//            # Both subtrees are non-empty. Can choose to replace the root
//            # from either the max value of the left subtree, or the min value
//            # of the right subtree.
//            # (Implementations are very similar, but we'll take the max from the left here.)
//        self._root = self._left._extract_max()
    }


    private int extractMax() {


        return -1;
    }

    public int height() {
        return -1;
    }

    public int count(int item) {
        return -1;
    }

    public int getSize() {
        return -1;
    }

    public static void main(String[] args) {
        // You can also add code here to do some basic testing if you want,
        // but make sure it doesn't contain syntax errors
        // or else we won't be able to run your code on MarkUs since the file won't
        // compile. Always make sure to run the self tests on MarkUs after you update your code.
        BST bst = new BST();
        int a = 1;
        bst.insert(a);
        System.out.println(bst.contains(a));
    }

}
