BST(binary search tree)

in-order=left root right
pre-order=root left right
post order=left right root



----------------------------------------------------------------------------------------------------------
*****HASHING******
hash_function =num%10
h(k)=value
h(1)=1
h()

=============================================================================================================
**METHOD OVERLOADING IN PYTHON POLYMORPHISM**

class a:
    def san(self):
        print("manner")
    def san(self,data):
        print("no data runcdkscnk")
ob=a()
ob.san(10)

------------------------------------------------------------------------------------------------------------------------
class node:
    def __init__(self,root,right,left):
        .root=new_node
        self.right=None
        self.left=None
class tree:   
    def add_ele(self,value):
        self.data=value
        if value<root.data:
            if root.left==None:
                root.left=new_node
            else:
                self.add_ele(root.left,value)
        else:
            if root.right==None:
                root.right=new_node
            else:
                self.add_ele(root.right,value)
----------------------------------------------------------------------------------------------------------
DATE=28/03/2023
class BinaryTreeNode:
  def __init__(self, data):
    self.data = data
    self.leftChild = None
    self.rightChild=None
def insert(root,newValue):
    if root is None:
        root=BinaryTreeNode(newValue)
        return root
    if newValue<root.data:
        root.leftChild=insert(root.leftChild,newValue)
    else:
        root.rightChild=insert(root.rightChild,newValue)
    return root
def inorder(root):
        if root==None:
            return
        inorder(root.leftChild)
        print(root.data)
        inorder(root.rightChild)    
def hieght(self,root):
    if root==None:
        return -1
    lh=self.hieght(root.leftChild)
    rh=self.hieght(root.rightChild)
    return 1+max(lh,rh)
    
root= insert(None,15)
insert(root,10)
insert(root,25)
insert(root,6)
insert(root,14)
insert(root,20)
insert(root,60)
inorder(root)
======================
level order::::
#program
class Node:
	def __init__(self, key):
		self.data = key
		self.left = None
		self.right = None
def printLevelOrder(root):
	if root is None:
		return
	queue = []
	queue.append(root)
	while(len(queue) > 0):
		print(queue[0].data, end = " ")
		node = queue.pop(0)
		if node.left is not None:
			queue.append(node.left)
		if node.right is not None:
			queue.append(node.right)
root = Node(10)
root.left = Node(20)
root.right = Node(30)
root.left.left = Node(40)
root.left.right = Node(50)
printLevelOrder(root)
================================================================================
graphs**
@@
#BSF
import collections
def bfs(graph, root):
    visited, queue = set(), collections.deque([root])
    visited.add(root)
    while queue:
        vertex = queue.popleft()
        print(str(vertex) + " ", end="")
        for neighbour in graph[vertex]:
            if neighbour not in visited:
                visited.add(neighbour)
                queue.append(neighbour)

graph = {0: [1, 2], 1: [2], 2: [3], 3: [1, 2]}
bfs(graph, 0)


****METHOD:2****
def bfs(g,start):
    q=[start]
    visited=[start]
    while len(q)!=0:
        ele=q.pop(0)
        print(ele)
        for i in g[ele]:
            if i not in visited:
                q.append(i)
                visited.append(i)
        
g={10:[20,40,50],20:[10,40],30:[40,50],40:[10,20,30,50],50:[10,40,30]}
bfs(g,30)
==============================================================
****DFS"""
def dfs(g,start,visited=None):
    s=[start]
    #visited=[start]
    if visited==None:
        visited=[]
    visited.append(start)
    print(start,end=" ")

    for i in g[start]:
        if i not in visited:
            visited.append(i)
            dfs(g,i,visited)
        
g={'A':['B','D','C'],'B':['A','D','H'],'C':['A','D','E'],'D':['A','B','C','E'],'E':['C','D'],'H':['B']}
dfs(g,'B')
