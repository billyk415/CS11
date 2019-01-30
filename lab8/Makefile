# Makefile
# Billy Kwong
# bqkwong
# lab8
# A simple Makefile for the GCD program
GCD: GCD.c
	echo Main-class: GCD > Manifest
	gcc -o GCD GCD.c
	rm -f Manifest
	chmod u+x GCD

clean:
	rm -f GCD

submit: Makefile GCD
	submit cmps011-pt.s17 lab8 Makefile GCD.c