class Solution {
    public boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();
    char[] a = s.toCharArray();
    
    for(char c : a){
        
        if(c == ')'){
            if(!stack.empty() && stack.peek() == '('){                    //peek is to view the topmost element 
                stack.pop();                                 // eliminate or remove the peek element
                continue;                                    // break the loop and start with next iteration
            }
        }else if(c == '}'){
            if(!stack.empty() && stack.peek() == '{'){
                stack.pop();
                continue;
            }
        }else if(c == ']'){
            if(!stack.empty() && stack.peek() == '['){
                stack.pop();
                continue;
            }
        }
        
        stack.push(c);                      // push the element
        
    }
    return stack.empty();     // returns true if stack is empty
}
}