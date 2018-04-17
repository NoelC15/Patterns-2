# Composite and Visitor Pattern Implementation 
Implemented by Mustafa Alsolami and Noel Castillo

Project 4
Our project 4 features the visitor and composite patterns 

Both the visitor and composite patterns are implemented to build, manipulate and evaluate a parsed expression. The implementation of the composition pattern consists of a component interface, a set composites, and leafs. Composed of different elements the composite pattern allows the client to build a parsed expression using our concrete composites such as Plus, Minus, Mod, etc. The leafs in this structure are represented by the constants which simply hold values to be evaluated. Implementing the composite pattern allows us to define our expression, the visitor pattern is what then allows us to go in an evaluate the expression. Because the visitor pattern allows us to visit and evaluate each leaf and composite from our structure, we are able to obtain a result from our parsed expression.


