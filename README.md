[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/APICmIZe)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=17186230&assignment_repo_type=AssignmentRepo)

# (Two credits) Real world example
A real world example of a stack is a call stack. This stack contains a list of the functions that the program is currently in. For example, if A() calls B(), and B() calls C(), the stack will show up as [A, B, C], so to return from C(), all you have to do is pop the last function in the stack, then go to the function that is now at the top of the stack. The computer often stores local vairables on the stack too, so that variables can be restored after a function returns.

Sources:
https://www.geeksforgeeks.org/function-call-stack-in-c/
