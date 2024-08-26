@echo off
if not exist ".\out" mkdir ".\out"
javac TestCase1.java
javac TestCase2.java
java TestCase1 > ".\out\output-1.txt"
java TestCase2 > ".\out\output-2.txt"
type ".\out\output-1.txt"
type ".\out\output-2.txt"