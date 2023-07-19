.SILENT:

cmp:
	javac */*.java
	javac *.java

exec: 
	java main

clean:	
	rm -f */*.class
	rm -f *.class

debug: 
	java -agentlib:jdwp=transport=dt_socket,server=y,address=5005 main

run: 
	make clean
	make cmp
	make run
	make clean

db: 
	make clean
	make cmp
	make debug
	make clean