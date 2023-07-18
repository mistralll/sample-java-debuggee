.SILENT:

cmp:
	javac */*.java
	javac *.java

run: 
	java main

clean:	
	rm -f */*.class
	rm -f *.class

r: 
	make clean
	make cmp
	make run
	make clean