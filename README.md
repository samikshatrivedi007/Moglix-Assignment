# Moglix Online Shortlisting Assignment

## Problem Statement

Given a string containing only '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

### Examples

Input:
```
s = "(()"
```

Output:
```
2
```

Input:
```
s = ")()())"
```

Output:
```
4
```

---

## Approach

This solution uses the **Stack** approach.

### Algorithm

1. Initialize a stack with `-1`.
2. Traverse the string.
3. If the current character is `'('`, push its index.
4. If the current character is `')'`:
   - Pop the top element.
   - If the stack becomes empty, push the current index.
   - Otherwise, calculate the current valid length using:
     ```
     currentLength = currentIndex - stack.peek()
     ```
5. Keep track of the maximum length.

---

## Complexity

- Time Complexity: **O(n)**
- Space Complexity: **O(n)**

---

## Language

Java

---

## Author

Samiksha Trivedi
