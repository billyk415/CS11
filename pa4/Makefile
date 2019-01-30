# Roots.java
# Billy Kwong and Taylor Lim
# bqkwong tjlim
# pa4
# A simple Makefile for the Roots program
Roots: Roots.class
	echo Main-class: Roots > Manifest
	jar cvfm Roots Manifest Roots.class
	rm Manifest
	chmod u+x Roots
Roots.class: Roots.java
	javac -Xlint Roots.java
clean:
	rm –f Roots.class Roots
submit: Makefile Roots.java
	submit cmps011-pt.s17 pa4 Makefile Roots.java
