# Modifying two arrays

**Overview**

This repository contains Java code and documentation for performing simple analyses and editing on two integer arrays such as checking for equality, appending two arrays, and converting an array to an String. Within this project, there exists multiple functions that can be generally split up into those two categories

**Analysis of two integer arrays**

The _equals_ function compares two separate integer arrays for equality such that both arrays must have the same length and same elements within each index. This function returns _true_ or _false_ in boolean form

The _equalityType_ function compares two separate integer arrays for equality such that both arrays must point to the same array. This function returns "==" or "not equal" in String form.

The _getIndex_ function returns the integer element present at a user-given index. This function also supports negative indexes, such that it starts counting indexes from the last element, rather than the first. This function returns an integer

**Editing two integer arrays**

The _append_ function takes two given integer arrays and combines them into a singular array. This function returns an integer array.

The _arrayToString_ function takes a given integer array and converts it into a readable String with brackets and commas separating each element. This function returns a String.

The _subArray_ function takes a given integer array as well as the desired start and end indexes and splices the original array to form a new subarray that consists of only elements between the given start and end indexes from the original array. This function returns an integer array.

